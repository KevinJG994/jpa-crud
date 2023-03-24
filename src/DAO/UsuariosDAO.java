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

    public Usuarios login(String usuario, String pass) {
        EntityManager em = controlarUsuario.getEntityManager();

        try {
            Query query = em.createQuery("SELECT u FROM Usuarios u WHERE u.user = :user AND u.password = :password");
            query.setParameter("user", usuario);
            query.setParameter("password", pass);

            List<Usuarios> resultado = query.getResultList();
            if (!resultado.isEmpty()) {
                return resultado.get(0);
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas.");
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas.");
            return null;
        }
    }
}
