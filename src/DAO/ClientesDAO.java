package DAO;

import Controlador.ClientesController;
import Controlador.UsuariosController;
import Entidades.Clientes;
import Entidades.Usuarios;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClientesDAO {

    private ClientesController controlClientes = new ClientesController();
    private UsuariosController controlUsuarios = new UsuariosController();
    private Usuarios usuario = new Usuarios();
    private Clientes cliente = new Clientes();
    private String mensaje = "";

    public String insertarCliente(String nombre, String apellido, String email, String telefono, Usuarios idUsuario) {
        try {
            cliente.setIdCliente(Integer.BYTES);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setEmail(email);
            cliente.setTelefono(telefono);
            cliente.setIdUsuario(idUsuario);
            controlClientes.create(cliente);

            mensaje = "Registro añadido.";
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            mensaje = "Error al ingresar registro.";
        }
        return mensaje;
    }

    public String modificarCliente(int id, String nombre, String apellido, String email, String telefono, Usuarios idUsuario) {
        try {
            cliente.setIdCliente(id);
            cliente.setNombre(nombre);
            cliente.setApellido(apellido);
            cliente.setEmail(email);
            cliente.setTelefono(telefono);
            cliente.setIdUsuario(idUsuario);
            controlClientes.edit(cliente);

            mensaje = "Registro actualizado.";
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            mensaje = "Error al actualizar el registro.";
        }
        return mensaje;
    }

    public String eliminarCliente(int id) {
        try {
            controlClientes.destroy(id);
            mensaje = "Registro eliminado.";
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            mensaje = "Error al eliminar el registro.";
        }
        return mensaje;
    }

    public void mostrarClientes(JTable tabla) {
        DefaultTableModel modelo;
        String[] titulo = {"ID", "NOMBRE", "APELLIDO", "EMAIL", "TELÉFONO", "IdUsuario"};
        modelo = new DefaultTableModel(null, titulo);

        List<Clientes> datos = controlClientes.findClientesEntities();
        String[] datosClientes = new String[6];
        
        for (Clientes cliente : datos) {
            datosClientes[0] = cliente.getIdCliente() + "";
            datosClientes[1] = cliente.getNombre() + "";
            datosClientes[2] = cliente.getApellido() + "";
            datosClientes[3] = cliente.getEmail() + "";
            datosClientes[4] = cliente.getTelefono() + "";
            datosClientes[5] = cliente.getIdUsuario().getIdUsuario() + "";
            modelo.addRow(datosClientes);
        }
        tabla.setModel(modelo);
    }
}
