package Vistas;

import DAO.UsuariosDAO;
import Entidades.Usuarios;
import javax.swing.JOptionPane;

public class LoginView extends javax.swing.JFrame {

    UsuariosDAO udao = new UsuariosDAO();
    Usuarios usuario = new Usuarios();

    public LoginView() {
        initComponents();
        mostrarLogin();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        panelIzquierdo = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        btnCatalogo = new javax.swing.JButton();
        lbPass = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        panelTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIzquierdo.setBackground(new java.awt.Color(247, 238, 146));

        panelLogo.setBackground(new java.awt.Color(230, 179, 27));

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo (2).png"))); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnCatalogo.setBackground(new java.awt.Color(230, 179, 27));
        btnCatalogo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/folleto.png"))); // NOI18N
        btnCatalogo.setText("Catálogo");
        btnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(btnCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        panelLogin.add(panelIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 370));

        lbPass.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbPass.setText("Contraseña");
        panelLogin.add(lbPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));
        panelLogin.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 290, 30));
        panelLogin.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 290, 30));

        panelTitulo.setBackground(new java.awt.Color(247, 238, 146));

        lbTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Iniciar Sesión");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        panelLogin.add(panelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 360, 60));

        lbUsuario.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbUsuario.setText("Usuario");
        panelLogin.add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        btnLogin1.setBackground(new java.awt.Color(230, 179, 27));
        btnLogin1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnLogin1.setText("Login");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });
        panelLogin.add(btnLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 140, 30));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        if (txtUser.getText().equals("") || txtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Los campos están vacíos.");
        } else {
            Usuarios usuario = udao.login(txtUser.getText(), txtPass.getText());
            if (usuario != null) {
                if (usuario.getRol().equals("cliente")) {
                    ClientesView vistaCliente = new ClientesView();
                    vistaCliente.setUsuarioActual(usuario);
                    vistaCliente.setVisible(true);
                    this.dispose();
                } else {
                    AdminView vistaAdmin = new AdminView();
                    vistaAdmin.setVisible(true);
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectas.");
            }
        }
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        ProductosView vistaProducto = new ProductosView();
        vistaProducto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCatalogoActionPerformed

    public void mostrarLogin() {
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Login");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel panelIzquierdo;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
