package DAO;

import Controlador.UsuariosController;
import Entidades.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Quebim
 */
public class UsuariosDAO {

    private UsuariosController controlarUsuario = new UsuariosController();
    private Usuarios user = new Usuarios();

    public boolean login(String usuario, String pass) {
        EntityManager em = controlarUsuario.getEntityManager();
        boolean valor;

        try {
            Query query = em.createQuery("SELECT u.user, u.password FROM Usuarios u WHERE u.user = :user AND u.password = :password");
            query.setParameter("user", usuario);
            query.setParameter("password", pass);

            List resultado = query.getResultList();
            if (!resultado.isEmpty()) {
                valor = true;

            } else {
                valor = false;
            }
        } catch (Exception e) {
            valor = false;
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");

        }
        return valor;
    }
}
