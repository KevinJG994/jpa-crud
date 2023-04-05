package Vistas;

import Controlador.ClientesController;
import Controlador.ProductosController;
import DAO.ClientesDAO;
import DAO.ComprasDAO;
import DAO.ProductosDAO;
import DAO.UsuariosDAO;
import Entidades.Clientes;
import Entidades.Productos;
import Entidades.Usuarios;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ClientesView extends javax.swing.JFrame {

    ProductosDAO pdao = new ProductosDAO();
    ComprasDAO comdao = new ComprasDAO();
    ClientesDAO cldao = new ClientesDAO();
    UsuariosDAO userdao = new UsuariosDAO();
    Usuarios usuario = new Usuarios();
    Clientes cliente = new Clientes();
    ClientesController controlClientes = new ClientesController();
    Productos producto = new Productos();
    ProductosController controlProductos = new ProductosController();

    public ClientesView() {
        initComponents();
        mostrarClientes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCliente = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        btnDesconectar = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        panelClientes = new javax.swing.JPanel();
        panelControlCompras = new javax.swing.JPanel();
        lbIdCliente = new javax.swing.JLabel();
        lbIdProducto = new javax.swing.JLabel();
        txtIdCompra = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtIdProducto = new javax.swing.JTextField();
        lbIdCompra = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        txtIdCliente = new javax.swing.JTextField();
        lbFecha1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCliente.setBackground(new java.awt.Color(255, 255, 255));
        panelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIzquierdo.setBackground(new java.awt.Color(247, 238, 146));

        panelLogo.setBackground(new java.awt.Color(230, 179, 27));

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo (2).png"))); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnDesconectar.setBackground(new java.awt.Color(230, 179, 27));
        btnDesconectar.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        btnDesconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        btnDesconectar.setText("Desconectar");
        btnDesconectar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        panelCliente.add(panelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 550));

        panelTitulo.setBackground(new java.awt.Color(247, 238, 146));

        lbTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Panel Clientes");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        panelCliente.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 640, 60));

        panelClientes.setBackground(new java.awt.Color(255, 255, 255));
        panelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelControlCompras.setBackground(new java.awt.Color(247, 238, 146));

        lbIdCliente.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbIdCliente.setText("IdCliente");

        lbIdProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbIdProducto.setText("IdProducto");

        txtIdCompra.setEditable(false);
        txtIdCompra.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtIdCompra.setToolTipText("");

        txtFecha.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        txtIdProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        lbIdCompra.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbIdCompra.setText("IdCompra");

        btnComprar.setBackground(new java.awt.Color(230, 179, 27));
        btnComprar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-compras (1).png"))); // NOI18N
        btnComprar.setText(" Comprar");
        btnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        txtIdCliente.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        lbFecha1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbFecha1.setText("Fecha");

        javax.swing.GroupLayout panelControlComprasLayout = new javax.swing.GroupLayout(panelControlCompras);
        panelControlCompras.setLayout(panelControlComprasLayout);
        panelControlComprasLayout.setHorizontalGroup(
            panelControlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlComprasLayout.createSequentialGroup()
                .addGroup(panelControlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelControlComprasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlComprasLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelControlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlComprasLayout.createSequentialGroup()
                                .addComponent(lbFecha1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlComprasLayout.createSequentialGroup()
                                .addComponent(lbIdCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(btnComprar)
                .addGap(70, 70, 70))
            .addGroup(panelControlComprasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbIdProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelControlComprasLayout.setVerticalGroup(
            panelControlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlComprasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelControlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelControlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelControlComprasLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlComprasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelControlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelControlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panelControlComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelClientes.add(panelControlCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 570, 170));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaProductos.setSelectionBackground(new java.awt.Color(230, 179, 27));
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaProductos);

        panelClientes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 570, 220));

        panelCliente.add(panelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 640, 490));

        getContentPane().add(panelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        LoginView login = new LoginView();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDesconectarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if (usuario != null) {
            int idCliente = userdao.obtenerId(usuario);
            if (idCliente != -1) {
                int idProducto = Integer.parseInt(txtIdProducto.getText());
                String mensaje = "";

                try {
                    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha = formatoFecha.parse(txtFecha.getText());
                    Clientes cliente = controlClientes.findClientes(idCliente);
                    Productos producto = controlProductos.findProductos(idProducto);

                    mensaje = comdao.realizarCompra(fecha, cliente, producto);
                } catch (ParseException ex) {
                    mensaje = "Error al ingresar registro.";
                }
                JOptionPane.showMessageDialog(null, mensaje);
                limpiarCompra();
            }
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int seleccionar = tablaProductos.getSelectedRow();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaActual = new Date();
        txtFecha.setText(formatoFecha.format(fechaActual));
        txtIdProducto.setText(tablaProductos.getValueAt(seleccionar, 0) + "");
        if (usuario != null) {
            int idCliente = userdao.obtenerId(usuario);
            txtIdCliente.setText(String.valueOf(idCliente));
        }
    }//GEN-LAST:event_tablaProductosMouseClicked


    private void mostrarTabla() {
        pdao.mostrarProductos(tablaProductos);
    }

    private void limpiarCompra() {
        txtIdCompra.setText("");
        txtFecha.setText("");
        txtIdCliente.setText("");
        txtIdProducto.setText("");
    }

    public void setUsuarioActual(Usuarios usuario) {
        this.usuario = usuario;
    }
    
    public void mostrarClientes(){
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Clientes");
        limpiarCompra();
        mostrarTabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbFecha1;
    private javax.swing.JLabel lbIdCliente;
    private javax.swing.JLabel lbIdCompra;
    private javax.swing.JLabel lbIdProducto;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelControlCompras;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtIdCompra;
    private javax.swing.JTextField txtIdProducto;
    // End of variables declaration//GEN-END:variables
}
