/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Clientes;
import Entidades.Compras;
import Entidades.Productos;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Quebim
 */
public class ComprasJpaController implements Serializable {

    public ComprasJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public ComprasJpaController() {
    }
    

    public void create(Compras compras) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Clientes idCliente = compras.getIdCliente();
            if (idCliente != null) {
                idCliente = em.getReference(idCliente.getClass(), idCliente.getIdCliente());
                compras.setIdCliente(idCliente);
            }
            Productos idProducto = compras.getIdProducto();
            if (idProducto != null) {
                idProducto = em.getReference(idProducto.getClass(), idProducto.getIdProducto());
                compras.setIdProducto(idProducto);
            }
            em.persist(compras);
            if (idCliente != null) {
                idCliente.getComprasCollection().add(compras);
                idCliente = em.merge(idCliente);
            }
            if (idProducto != null) {
                idProducto.getComprasCollection().add(compras);
                idProducto = em.merge(idProducto);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Compras compras) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compras persistentCompras = em.find(Compras.class, compras.getIdCompra());
            Clientes idClienteOld = persistentCompras.getIdCliente();
            Clientes idClienteNew = compras.getIdCliente();
            Productos idProductoOld = persistentCompras.getIdProducto();
            Productos idProductoNew = compras.getIdProducto();
            if (idClienteNew != null) {
                idClienteNew = em.getReference(idClienteNew.getClass(), idClienteNew.getIdCliente());
                compras.setIdCliente(idClienteNew);
            }
            if (idProductoNew != null) {
                idProductoNew = em.getReference(idProductoNew.getClass(), idProductoNew.getIdProducto());
                compras.setIdProducto(idProductoNew);
            }
            compras = em.merge(compras);
            if (idClienteOld != null && !idClienteOld.equals(idClienteNew)) {
                idClienteOld.getComprasCollection().remove(compras);
                idClienteOld = em.merge(idClienteOld);
            }
            if (idClienteNew != null && !idClienteNew.equals(idClienteOld)) {
                idClienteNew.getComprasCollection().add(compras);
                idClienteNew = em.merge(idClienteNew);
            }
            if (idProductoOld != null && !idProductoOld.equals(idProductoNew)) {
                idProductoOld.getComprasCollection().remove(compras);
                idProductoOld = em.merge(idProductoOld);
            }
            if (idProductoNew != null && !idProductoNew.equals(idProductoOld)) {
                idProductoNew.getComprasCollection().add(compras);
                idProductoNew = em.merge(idProductoNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = compras.getIdCompra();
                if (findCompras(id) == null) {
                    throw new NonexistentEntityException("The compras with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Compras compras;
            try {
                compras = em.getReference(Compras.class, id);
                compras.getIdCompra();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The compras with id " + id + " no longer exists.", enfe);
            }
            Clientes idCliente = compras.getIdCliente();
            if (idCliente != null) {
                idCliente.getComprasCollection().remove(compras);
                idCliente = em.merge(idCliente);
            }
            Productos idProducto = compras.getIdProducto();
            if (idProducto != null) {
                idProducto.getComprasCollection().remove(compras);
                idProducto = em.merge(idProducto);
            }
            em.remove(compras);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Compras> findComprasEntities() {
        return findComprasEntities(true, -1, -1);
    }

    public List<Compras> findComprasEntities(int maxResults, int firstResult) {
        return findComprasEntities(false, maxResults, firstResult);
    }

    private List<Compras> findComprasEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Compras.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Compras findCompras(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Compras.class, id);
        } finally {
            em.close();
        }
    }

    public int getComprasCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Compras> rt = cq.from(Compras.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
