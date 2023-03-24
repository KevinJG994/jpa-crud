
package DAO;

import Controlador.ComprasController;
import Entidades.Compras;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quebim
 */
public class ComprasDAO {
    
    ComprasController controlCompras = new ComprasController();

    public void mostrarCompras(JTable tabla) {
        DefaultTableModel modelo;
        String[] titulo = {"ID_COMPRA", "FECHA", "ID_CLIENTE", "ID_PRODUCTO"};
        modelo = new DefaultTableModel(null, titulo);

        List<Compras> datos = controlCompras.findComprasEntities();

        String[] datosCompras = new String[4];
        for (Compras compra : datos) {
            datosCompras[0] = compra.getIdCompra() + "";
            datosCompras[1] = compra.getFecha() + "";
            datosCompras[2] = compra.getIdCliente() + "";
            datosCompras[3] = compra.getIdProducto() + "";

            modelo.addRow(datosCompras);
        }
        tabla.setModel(modelo);
    }
}
