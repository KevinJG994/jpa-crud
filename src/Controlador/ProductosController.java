/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Controlador.exceptions.IllegalOrphanException;
import Controlador.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidades.Compras;
import Entidades.Productos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Quebim
 */
public class ProductosController implements Serializable {

    public ProductosController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public ProductosController() {
    }
    

    public void create(Productos productos) {
        if (productos.getComprasCollection() == null) {
            productos.setComprasCollection(new ArrayList<Compras>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Collection<Compras> attachedComprasCollection = new ArrayList<Compras>();
            for (Compras comprasCollectionComprasToAttach : productos.getComprasCollection()) {
                comprasCollectionComprasToAttach = em.getReference(comprasCollectionComprasToAttach.getClass(), comprasCollectionComprasToAttach.getIdCompra());
                attachedComprasCollection.add(comprasCollectionComprasToAttach);
            }
            productos.setComprasCollection(attachedComprasCollection);
            em.persist(productos);
            for (Compras comprasCollectionCompras : productos.getComprasCollection()) {
                Productos oldIdProductoOfComprasCollectionCompras = comprasCollectionCompras.getIdProducto();
                comprasCollectionCompras.setIdProducto(productos);
                comprasCollectionCompras = em.merge(comprasCollectionCompras);
                if (oldIdProductoOfComprasCollectionCompras != null) {
                    oldIdProductoOfComprasCollectionCompras.getComprasCollection().remove(comprasCollectionCompras);
                    oldIdProductoOfComprasCollectionCompras = em.merge(oldIdProductoOfComprasCollectionCompras);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Productos productos) throws IllegalOrphanException, NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productos persistentProductos = em.find(Productos.class, productos.getIdProducto());
            Collection<Compras> comprasCollectionOld = persistentProductos.getComprasCollection();
            Collection<Compras> comprasCollectionNew = productos.getComprasCollection();
            List<String> illegalOrphanMessages = null;
            for (Compras comprasCollectionOldCompras : comprasCollectionOld) {
                if (!comprasCollectionNew.contains(comprasCollectionOldCompras)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Compras " + comprasCollectionOldCompras + " since its idProducto field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            Collection<Compras> attachedComprasCollectionNew = new ArrayList<Compras>();
            for (Compras comprasCollectionNewComprasToAttach : comprasCollectionNew) {
                comprasCollectionNewComprasToAttach = em.getReference(comprasCollectionNewComprasToAttach.getClass(), comprasCollectionNewComprasToAttach.getIdCompra());
                attachedComprasCollectionNew.add(comprasCollectionNewComprasToAttach);
            }
            comprasCollectionNew = attachedComprasCollectionNew;
            productos.setComprasCollection(comprasCollectionNew);
            productos = em.merge(productos);
            for (Compras comprasCollectionNewCompras : comprasCollectionNew) {
                if (!comprasCollectionOld.contains(comprasCollectionNewCompras)) {
                    Productos oldIdProductoOfComprasCollectionNewCompras = comprasCollectionNewCompras.getIdProducto();
                    comprasCollectionNewCompras.setIdProducto(productos);
                    comprasCollectionNewCompras = em.merge(comprasCollectionNewCompras);
                    if (oldIdProductoOfComprasCollectionNewCompras != null && !oldIdProductoOfComprasCollectionNewCompras.equals(productos)) {
                        oldIdProductoOfComprasCollectionNewCompras.getComprasCollection().remove(comprasCollectionNewCompras);
                        oldIdProductoOfComprasCollectionNewCompras = em.merge(oldIdProductoOfComprasCollectionNewCompras);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = productos.getIdProducto();
                if (findProductos(id) == null) {
                    throw new NonexistentEntityException("The productos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productos productos;
            try {
                productos = em.getReference(Productos.class, id);
                productos.getIdProducto();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The productos with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            Collection<Compras> comprasCollectionOrphanCheck = productos.getComprasCollection();
            for (Compras comprasCollectionOrphanCheckCompras : comprasCollectionOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Productos (" + productos + ") cannot be destroyed since the Compras " + comprasCollectionOrphanCheckCompras + " in its comprasCollection field has a non-nullable idProducto field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(productos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Productos> findProductosEntities() {
        return findProductosEntities(true, -1, -1);
    }

    public List<Productos> findProductosEntities(int maxResults, int firstResult) {
        return findProductosEntities(false, maxResults, firstResult);
    }

    private List<Productos> findProductosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Productos.class));
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

    public Productos findProductos(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Productos.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Productos> rt = cq.from(Productos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
