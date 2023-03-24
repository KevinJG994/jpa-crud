/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Controlador.ProductosController;
import Entidades.Productos;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quebim
 */
public class ProductosDAO {

    private ProductosController controlProductos = new ProductosController();
    private Productos producto = new Productos();
    private String mensaje = "";

    public String insertarProducto(String nombre, String franquicia, String descripcion, BigDecimal precio, String tipo) {
        try {
            producto.setIdProducto(Integer.BYTES);
            producto.setNombre(nombre);
            producto.setFranquicia(franquicia);
            producto.setDescripcion(descripcion);
            producto.setPrecio(precio);
            producto.setTipo(tipo);
            controlProductos.create(producto);

            mensaje = "Registro añadido.";

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            mensaje = "Error al ingresar registro.";
        }
        return mensaje;
    }

    public String modificarProducto(int id, String nombre, String franquicia, String descripcion, BigDecimal precio, String tipo) {
             try {
            producto.setIdProducto(id);
            producto.setNombre(nombre);
            producto.setFranquicia(franquicia);
            producto.setDescripcion(descripcion);
            producto.setPrecio(precio);
            producto.setTipo(tipo);
            controlProductos.edit(producto);

            mensaje = "Registro actualizado.";

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            mensaje = "Error al actualizar el registro.\n" +"Error: " +e.getMessage();
        }
        return mensaje;
    }

    public String eliminarProducto(int id) {
        try{
            controlProductos.destroy(id);
            
            mensaje = "Registro eliminado.";

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            mensaje = "Error al eliminar el registro.\n" +"Error: " +e.getMessage();
        }
        return mensaje;
    }
    
    public void mostrarProductos(JTable tabla) {
        DefaultTableModel modelo;
        String[] titulo = {"ID", "NOMBRE", "FRANQUICIA", "DESCRIPCIÓN", "PRECIO", "TIPO"};
        modelo = new DefaultTableModel(null, titulo);

        List<Productos> datos = controlProductos.findProductosEntities();

        String[] datosProductos = new String[6];
        for (Productos productos : datos) {
            datosProductos[0] = productos.getIdProducto() + "";
            datosProductos[1] = productos.getNombre() + "";
            datosProductos[2] = productos.getFranquicia() + "";
            datosProductos[3] = productos.getDescripcion() + "";
            datosProductos[4] = productos.getPrecio() + "";
            datosProductos[5] = productos.getTipo()+"";
            modelo.addRow(datosProductos);
        }
        tabla.setModel(modelo);
    }

}
