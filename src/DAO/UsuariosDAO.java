package DAO;


import Controlador.UsuariosJpaController;
import Entidades.Clientes;
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

    private UsuariosJpaController controlarUsuario = new UsuariosJpaController();
    private Usuarios user = new Usuarios();
    private Clientes cliente = new Clientes();
    private String mensaje = "";
           

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
    
     public String registrarUsuario(String usuario, String pass, String rol) {
        try {
            user.setIdUsuario(Integer.BYTES);
            user.setUser(usuario);
            user.setPassword(pass);
            user.setRol(rol);
            controlarUsuario.create(user);

            mensaje = "Usuario añadido.";

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            mensaje = "Error al registrar usuario.";
        }
        return mensaje;
    }

     
     public int obtenerId(Usuarios usuario) {
    if (usuario == null) {
        JOptionPane.showMessageDialog(null, "El usuario es nulo.");
        return -1;
    } else {
        return usuario.getIdUsuario();
    }
}

}
