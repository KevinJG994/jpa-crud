
package DAO;

import Controlador.ClientesController;
import Controlador.ComprasController;
import Controlador.ProductosController;
import Entidades.Clientes;
import Entidades.Compras;
import Entidades.Productos;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quebim
 */
public class ComprasDAO {
    
    private ComprasController controlCompras = new ComprasController();
    private Compras compra = new Compras();
    private Clientes cliente = new Clientes();
    private ClientesController controlClientes = new ClientesController();
    private Productos producto = new Productos();
    private ProductosController controlProductos = new ProductosController();
    
    private String mensaje ="";
    
    public String realizarCompra(Date fecha, Clientes cliente, Productos producto) {
          try {
        compra.setIdCompra(Integer.BYTES);
        compra.setFecha(fecha);
        cliente = controlClientes.findClientes(cliente.getIdCliente());
        producto = controlProductos.findProductos(producto.getIdProducto());
        compra.setIdCliente(cliente);
        compra.setIdProducto(producto);
        controlCompras.create(compra);

        mensaje = "Compra realizada correctamente.";
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        mensaje = "Error al realizar su compra.";
    }
    return mensaje;
}

    public void mostrarCompras(JTable tabla) {
        DefaultTableModel modelo;
        String[] titulo = {"ID_COMPRA", "FECHA", "ID_CLIENTE", "ID_PRODUCTO"};
        modelo = new DefaultTableModel(null, titulo);

        List<Compras> datos = controlCompras.findComprasEntities();

        String[] datosCompras = new String[4];
        for (Compras compra : datos) {
            datosCompras[0] = compra.getIdCompra() + "";
            datosCompras[1] = new SimpleDateFormat("dd/MM/yyyy").format(compra.getFecha());
            datosCompras[2] = compra.getIdCliente().getIdCliente() + "";
            datosCompras[3] = compra.getIdProducto().getIdProducto() + "";

            modelo.addRow(datosCompras);
        }
        tabla.setModel(modelo);
    }
}
