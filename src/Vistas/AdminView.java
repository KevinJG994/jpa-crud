package Vistas;

import DAO.ClientesDAO;
import DAO.ComprasDAO;
import DAO.ProductosDAO;
import DAO.UsuariosDAO;
import Entidades.Usuarios;
import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class AdminView extends javax.swing.JFrame {

    ProductosDAO pdao = new ProductosDAO();
    ClientesDAO cdao = new ClientesDAO();
    ComprasDAO comdao = new ComprasDAO();
    UsuariosDAO userdao = new UsuariosDAO();
    Usuarios usuario = new Usuarios();

    public AdminView() {
        initComponents();
        mostrarAdmin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbidUsuario2 = new javax.swing.JLabel();
        txtidUsuario = new javax.swing.JTextField();
        lbidUsuario3 = new javax.swing.JLabel();
        txtidUsuario2 = new javax.swing.JTextField();
        lbidUsuario4 = new javax.swing.JLabel();
        txtidUsuario3 = new javax.swing.JTextField();
        lbidUsuario = new javax.swing.JLabel();
        txtidUsuario4 = new javax.swing.JTextField();
        panelAdmin = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnCompras = new javax.swing.JButton();
        btnDesconectar = new javax.swing.JButton();
        panelTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        tabbedPanel = new javax.swing.JTabbedPane();
        panelCompras = new javax.swing.JPanel();
        lbPanelProductos1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCompras = new javax.swing.JTable();
        panelProductos = new javax.swing.JPanel();
        lbPanelProductos = new javax.swing.JLabel();
        panelControl = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbFranquicia = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        lbPrecio = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtFranquicia = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        lbId = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        lbTipo = new javax.swing.JLabel();
        jComboTipo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        panelClientes = new javax.swing.JPanel();
        lbPanelClientes = new javax.swing.JLabel();
        panelControlCL = new javax.swing.JPanel();
        btnEliminarCL = new javax.swing.JButton();
        btnModificarCL = new javax.swing.JButton();
        btnInsertarCL = new javax.swing.JButton();
        misClientes = new javax.swing.JPanel();
        lbIdCL = new javax.swing.JLabel();
        txtIdCL = new javax.swing.JTextField();
        lbNombreCL = new javax.swing.JLabel();
        txtNombreCL = new javax.swing.JTextField();
        lbApellido = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lbIdUsuario = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        misUsuarios = new javax.swing.JPanel();
        lbIdUser = new javax.swing.JLabel();
        lbPass = new javax.swing.JLabel();
        lbRol = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lbUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtIdUser = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jComboRol = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel6.setText("Descripción");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lbidUsuario2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbidUsuario2.setText("idUsuario");

        txtidUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        lbidUsuario3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbidUsuario3.setText("idUsuario");

        txtidUsuario2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        lbidUsuario4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbidUsuario4.setText("idUsuario");

        txtidUsuario3.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        lbidUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbidUsuario.setText("idUsuario");

        txtidUsuario4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAdmin.setBackground(new java.awt.Color(255, 255, 255));
        panelAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIzquierdo.setBackground(new java.awt.Color(247, 238, 146));

        panelLogo.setBackground(new java.awt.Color(230, 179, 27));

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo (2).png"))); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogoLayout.createSequentialGroup()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnProductos.setBackground(new java.awt.Color(230, 179, 27));
        btnProductos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/juego-de-mesa (1).png"))); // NOI18N
        btnProductos.setText("  Productos");
        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(230, 179, 27));
        btnClientes.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/objetivo.png"))); // NOI18N
        btnClientes.setText("  Clientes");
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnCompras.setBackground(new java.awt.Color(230, 179, 27));
        btnCompras.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-compras (1).png"))); // NOI18N
        btnCompras.setText("  Compras");
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprasActionPerformed(evt);
            }
        });

        btnDesconectar.setBackground(new java.awt.Color(230, 179, 27));
        btnDesconectar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnDesconectar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        btnDesconectar.setText(" Desconectar");
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
                .addGap(0, 1, Short.MAX_VALUE))
            .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCompras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDesconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        panelAdmin.add(panelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 570));

        panelTitulo.setBackground(new java.awt.Color(247, 238, 146));

        lbTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Administrador");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        panelAdmin.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 620, 60));

        tabbedPanel.setBackground(new java.awt.Color(255, 255, 255));

        panelCompras.setBackground(new java.awt.Color(255, 255, 255));
        panelCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPanelProductos1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPanelProductos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPanelProductos1.setText("Panel Compras");
        panelCompras.add(lbPanelProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 32));

        jPanel1.setBackground(new java.awt.Color(247, 238, 146));

        tablaCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaCompras.setSelectionBackground(new java.awt.Color(230, 179, 27));
        jScrollPane4.setViewportView(tablaCompras);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        panelCompras.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 550, 410));

        tabbedPanel.addTab("Compras", panelCompras);

        panelProductos.setBackground(new java.awt.Color(255, 255, 255));
        panelProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPanelProductos.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPanelProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPanelProductos.setText("Panel Productos");
        panelProductos.add(lbPanelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 32));

        panelControl.setBackground(new java.awt.Color(247, 238, 146));

        lbNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbNombre.setText("Nombre");

        lbFranquicia.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbFranquicia.setText("Franquicia");

        lbDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbDescripcion.setText("Descripción");

        lbPrecio.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbPrecio.setText("Precio");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtId.setToolTipText("");

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        txtFranquicia.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        txtDescripcion.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        txtPrecio.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        lbId.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbId.setText("Id");

        btnEliminar.setBackground(new java.awt.Color(230, 179, 27));
        btnEliminar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText(" Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(230, 179, 27));
        btnModificar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-editar.png"))); // NOI18N
        btnModificar.setText(" Modificar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnInsertar.setBackground(new java.awt.Color(230, 179, 27));
        btnInsertar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        btnInsertar.setText(" Insertar");
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        lbTipo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbTipo.setText("Tipo");

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Comic", "Funko" }));

        javax.swing.GroupLayout panelControlLayout = new javax.swing.GroupLayout(panelControl);
        panelControl.setLayout(panelControlLayout);
        panelControlLayout.setHorizontalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelControlLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(txtId))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlLayout.createSequentialGroup()
                                .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlLayout.createSequentialGroup()
                                .addComponent(lbFranquicia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFranquicia, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))))
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnInsertar)))
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelControlLayout.createSequentialGroup()
                                .addComponent(lbDescripcion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelControlLayout.createSequentialGroup()
                                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPrecio)
                                    .addComponent(lbTipo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelControlLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnModificar)
                        .addGap(58, 58, 58)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelControlLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(501, Short.MAX_VALUE)))
        );
        panelControlLayout.setVerticalGroup(
            panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFranquicia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFranquicia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(panelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelControlLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(149, Short.MAX_VALUE)))
        );

        panelProductos.add(panelControl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 570, 200));

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
        jScrollPane2.setViewportView(tablaProductos);

        panelProductos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 570, 220));

        tabbedPanel.addTab("Productos", panelProductos);

        panelClientes.setBackground(new java.awt.Color(255, 255, 255));
        panelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbPanelClientes.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPanelClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPanelClientes.setText("Panel Usuarios                       Panel Clientes");
        panelClientes.add(lbPanelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 590, 32));

        panelControlCL.setBackground(new java.awt.Color(247, 238, 146));

        btnEliminarCL.setBackground(new java.awt.Color(230, 179, 27));
        btnEliminarCL.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnEliminarCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminarCL.setText(" Eliminar");
        btnEliminarCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCLActionPerformed(evt);
            }
        });

        btnModificarCL.setBackground(new java.awt.Color(230, 179, 27));
        btnModificarCL.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnModificarCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-editar.png"))); // NOI18N
        btnModificarCL.setText(" Modificar");
        btnModificarCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificarCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCLActionPerformed(evt);
            }
        });

        btnInsertarCL.setBackground(new java.awt.Color(230, 179, 27));
        btnInsertarCL.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnInsertarCL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir.png"))); // NOI18N
        btnInsertarCL.setText(" Insertar");
        btnInsertarCL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertarCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarCLActionPerformed(evt);
            }
        });

        misClientes.setBackground(new java.awt.Color(230, 179, 27));
        misClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbIdCL.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbIdCL.setText("Id");
        misClientes.add(lbIdCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 25));

        txtIdCL.setEditable(false);
        txtIdCL.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        txtIdCL.setToolTipText("");
        misClientes.add(txtIdCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, -1));

        lbNombreCL.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbNombreCL.setText("Nombre");
        misClientes.add(lbNombreCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 42, 25));

        txtNombreCL.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        misClientes.add(txtNombreCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 170, -1));

        lbApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbApellido.setText("Apellido");
        misClientes.add(lbApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 25));

        txtApellido.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        misClientes.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 170, -1));

        lbEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbEmail.setText("Email");
        misClientes.add(lbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 25));

        txtEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        misClientes.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 180, -1));

        lbTelefono.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbTelefono.setText("Teléfono");
        misClientes.add(lbTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 25));

        txtTelefono.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        misClientes.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, -1));

        lbIdUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbIdUsuario.setText("idUsuario");
        misClientes.add(lbIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 25));

        txtIdUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        misClientes.add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 160, -1));

        misUsuarios.setBackground(new java.awt.Color(230, 179, 27));
        misUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbIdUser.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbIdUser.setText("idUsuario");
        misUsuarios.add(lbIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 25));

        lbPass.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbPass.setText("Password");
        misUsuarios.add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 25));

        lbRol.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbRol.setText("Rol");
        misUsuarios.add(lbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 30, 25));
        misUsuarios.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 170, 20));

        lbUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        lbUsuario.setText("Usuario");
        misUsuarios.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 42, 25));

        txtUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        misUsuarios.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 180, -1));

        txtIdUser.setEditable(false);
        txtIdUser.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        misUsuarios.add(txtIdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 170, -1));

        btnRegistrar.setBackground(new java.awt.Color(230, 179, 27));
        btnRegistrar.setFont(new java.awt.Font("Comic Sans MS", 1, 10)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregue-el-simbolo-de-la-interfaz-de-personas-de-la-persona-negra-de-cerca-con-el-signo-mas-en-un-circulo-pequeno.png"))); // NOI18N
        btnRegistrar.setText(" Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        misUsuarios.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 110, 30));

        jComboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cliente", "admin" }));
        misUsuarios.add(jComboRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 80, 30));

        javax.swing.GroupLayout panelControlCLLayout = new javax.swing.GroupLayout(panelControlCL);
        panelControlCL.setLayout(panelControlCLLayout);
        panelControlCLLayout.setHorizontalGroup(
            panelControlCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlCLLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnInsertarCL)
                .addGap(75, 75, 75)
                .addComponent(btnModificarCL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarCL, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelControlCLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(misUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(misClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelControlCLLayout.setVerticalGroup(
            panelControlCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelControlCLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelControlCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(misClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(misUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelControlCLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarCL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelClientes.add(panelControlCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 580, 260));

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaClientes.setSelectionBackground(new java.awt.Color(230, 179, 27));
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaClientes);

        panelClientes.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 580, 190));

        tabbedPanel.addTab("Productos", panelClientes);

        panelAdmin.add(tabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 610, 540));
        tabbedPanel.getAccessibleContext().setAccessibleName("Clientes");

        getContentPane().add(panelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        String nombre = txtNombre.getText();
        String franquicia = txtFranquicia.getText();
        String descripcion = txtDescripcion.getText();
        BigDecimal precio = new BigDecimal(txtPrecio.getText());
        String tipo = (String) jComboTipo.getSelectedItem();

        String mensaje = "";
        mensaje = pdao.insertarProducto(nombre, franquicia, descripcion, precio, tipo);
        JOptionPane.showMessageDialog(null, mensaje);
        limpiarProductos();
        mostrarTablaProductos();
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (txtNombre.getText().equals("") || txtFranquicia.getText().equals("")
                || txtDescripcion.getText().equals("") || txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos.");
        } else {

            int id = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            String franquicia = txtFranquicia.getText();
            String descripcion = txtDescripcion.getText();
            BigDecimal precio = new BigDecimal(txtPrecio.getText());
            String tipo = (String) jComboTipo.getSelectedItem();

            String mensaje = "";
            mensaje = pdao.modificarProducto(id, nombre, franquicia, descripcion, precio, tipo);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiarProductos();
            mostrarTablaProductos();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtNombre.getText().equals("") || txtFranquicia.getText().equals("")
                || txtDescripcion.getText().equals("") || txtPrecio.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos.");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el producto?");
            if (respuesta == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(txtId.getText());
                String mensaje = "";
                mensaje = pdao.eliminarProducto(id);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiarProductos();
                mostrarTablaProductos();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductosMouseClicked
        int seleccionar = tablaProductos.getSelectedRow();
        txtId.setText(tablaProductos.getValueAt(seleccionar, 0) + "");
        txtNombre.setText(tablaProductos.getValueAt(seleccionar, 1) + "");
        txtFranquicia.setText(tablaProductos.getValueAt(seleccionar, 2) + "");
        txtDescripcion.setText(tablaProductos.getValueAt(seleccionar, 3) + "");
        txtPrecio.setText(tablaProductos.getValueAt(seleccionar, 4) + "");
        jComboTipo.setSelectedItem(tablaProductos.getValueAt(seleccionar, 5));

    }//GEN-LAST:event_tablaProductosMouseClicked

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        LoginView login = new LoginView();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDesconectarActionPerformed

    private void btnEliminarCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCLActionPerformed
        if (txtNombreCL.getText().equals("") || txtApellido.getText().equals("")
                || txtEmail.getText().equals("") || txtTelefono.getText().equals("")
                || txtIdUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos.");
        } else {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar el cliente?");
            if (respuesta == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(txtIdCL.getText());
                String mensaje = "";
                mensaje = cdao.eliminarCliente(id);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiarClientes();
                mostrarTablaClientes();
            }
        }
    }//GEN-LAST:event_btnEliminarCLActionPerformed

    private void btnModificarCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCLActionPerformed
        if (txtNombreCL.getText().equals("") || txtApellido.getText().equals("")
                || txtEmail.getText().equals("") || txtTelefono.getText().equals("")
                || txtIdUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos.");
        } else {
            int id = Integer.parseInt(txtIdCL.getText());
            String nombre = txtNombreCL.getText();
            String apellido = txtApellido.getText();
            String email = txtEmail.getText();
            String telefono = txtTelefono.getText();
            usuario.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));

            String mensaje = "";
            mensaje = cdao.modificarCliente(id, nombre, apellido, email, telefono, usuario);
            JOptionPane.showMessageDialog(null, mensaje);
            limpiarClientes();
            mostrarTablaClientes();
        }
    }//GEN-LAST:event_btnModificarCLActionPerformed

    private void btnInsertarCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarCLActionPerformed
        String nombre = txtNombreCL.getText();
        String apellido = txtApellido.getText();
        String email = txtEmail.getText();
        String telefono = txtTelefono.getText();
        usuario.setIdUsuario(Integer.parseInt(txtIdUsuario.getText()));

        String mensaje = "";
        mensaje = cdao.insertarCliente(nombre, apellido, email, telefono, usuario);
        JOptionPane.showMessageDialog(null, mensaje);
        limpiarClientes();
        mostrarTablaClientes();
    }//GEN-LAST:event_btnInsertarCLActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        int seleccionar = tablaClientes.getSelectedRow();
        txtIdCL.setText(tablaClientes.getValueAt(seleccionar, 0) + "");
        txtNombreCL.setText(tablaClientes.getValueAt(seleccionar, 1) + "");
        txtApellido.setText(tablaClientes.getValueAt(seleccionar, 2) + "");
        txtEmail.setText(tablaClientes.getValueAt(seleccionar, 3) + "");
        txtTelefono.setText(tablaClientes.getValueAt(seleccionar, 4) + "");
        txtIdUsuario.setText(tablaClientes.getValueAt(seleccionar, 5) + "");
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        tabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        tabbedPanel.setSelectedIndex(2);
        mostrarTablaClientes();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprasActionPerformed
        tabbedPanel.setSelectedIndex(0);
        mostrarTablaCompras();
    }//GEN-LAST:event_btnComprasActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String usuario = txtUsuario.getText();
        String pass = txtPass.getText();
        String rol = (String) jComboRol.getSelectedItem();

        String mensaje = "";
        mensaje = userdao.registrarUsuario(usuario, pass, rol);
        JOptionPane.showMessageDialog(null, mensaje);
        limpiarUsuarios();
    }//GEN-LAST:event_btnRegistrarActionPerformed


    private void limpiarProductos() {
        txtId.setText("");
        txtNombre.setText("");
        txtFranquicia.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");
    }

    private void limpiarClientes() {
        txtIdCL.setText("");
        txtNombreCL.setText("");
        txtApellido.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtIdUsuario.setText("");
    }

    private void limpiarUsuarios() {
        txtIdUser.setText("");
        txtUsuario.setText("");
        txtPass.setText("");
    }

    private void mostrarTablaProductos() {
        pdao.mostrarProductos(tablaProductos);
    }

    private void mostrarTablaClientes() {
        cdao.mostrarClientes(tablaClientes);
    }

    private void mostrarTablaCompras() {
        comdao.mostrarCompras(tablaCompras);
    }
    
    private void mostrarAdmin() {
        this.setVisible(true);
        this.setTitle("Administrador");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        tabbedPanel.setSelectedIndex(1);
        limpiarProductos();
        mostrarTablaProductos();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnCompras;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarCL;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnInsertarCL;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarCL;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> jComboRol;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbApellido;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFranquicia;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbIdCL;
    private javax.swing.JLabel lbIdUser;
    private javax.swing.JLabel lbIdUsuario;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNombreCL;
    private javax.swing.JLabel lbPanelClientes;
    private javax.swing.JLabel lbPanelProductos;
    private javax.swing.JLabel lbPanelProductos1;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbPrecio;
    private javax.swing.JLabel lbRol;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JLabel lbidUsuario;
    private javax.swing.JLabel lbidUsuario2;
    private javax.swing.JLabel lbidUsuario3;
    private javax.swing.JLabel lbidUsuario4;
    private javax.swing.JPanel misClientes;
    private javax.swing.JPanel misUsuarios;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelCompras;
    private javax.swing.JPanel panelControl;
    private javax.swing.JPanel panelControlCL;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JTabbedPane tabbedPanel;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaCompras;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFranquicia;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdCL;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCL;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtidUsuario;
    private javax.swing.JTextField txtidUsuario2;
    private javax.swing.JTextField txtidUsuario3;
    private javax.swing.JTextField txtidUsuario4;
    // End of variables declaration//GEN-END:variables
}
