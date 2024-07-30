
package vista;

import controlador.Ctrl_Usuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import servicios.GeneradorAdmin;
import seguridad.hash;
public class Login extends javax.swing.JFrame {
    Ctrl_Usuario ctrlUser = new Ctrl_Usuario();
    
    // Constructor. 
    public Login() {
        initComponents();
        asignarFotoEstacionamiento();
        generarUsuarioAdministrador();
    }
    
    private void asignarFotoEstacionamiento()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/img/logo parking sin fondo.png"));
        setIconImage(icon.getImage());
    }
    private void generarUsuarioAdministrador()
    {
        if (!ctrlUser.ExistenUsuarios()) 
        {
            GeneradorAdmin generarUsuarioAdmin = new GeneradorAdmin(ctrlUser); 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txtEntrar = new javax.swing.JLabel();
        panelExit = new javax.swing.JPanel();
        labelExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo parking sin fondo.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estacionamiento Gianca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 280, 600));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Varios Autos.png"))); // NOI18N
        jLabel1.setText(" Por favor, inicie sesion...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 90));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/password.png"))); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user2.png"))); // NOI18N
        jLabel3.setText("USUARIO");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 30));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 400, 10));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(102, 102, 102));
        txtUser.setText("Ingrese su nombre de usuario...");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        background.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 250, 30));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtPassword.setText("*******");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPasswordMousePressed(evt);
            }
        });
        background.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 270, 30));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 400, 10));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        txtEntrar.setBackground(new java.awt.Color(0, 0, 102));
        txtEntrar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtEntrar.setForeground(new java.awt.Color(255, 255, 255));
        txtEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEntrar.setText("Iniciar Sesion");
        txtEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEntrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 170, 50));

        panelExit.setBackground(new java.awt.Color(255, 255, 255));
        panelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelExitMouseExited(evt);
            }
        });

        labelExit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelExit.setText("X");

        javax.swing.GroupLayout panelExitLayout = new javax.swing.GroupLayout(panelExit);
        panelExit.setLayout(panelExitLayout);
        panelExitLayout.setHorizontalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExitLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelExit)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panelExitLayout.setVerticalGroup(
            panelExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExitLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelExit, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        if (txtUser.getText().equals("Ingrese su nombre de usuario...")) {
            txtUser.setText("");
        }
        if (txtPassword.getPassword() == null || new String(txtPassword.getPassword()).equals("")) {
            txtPassword.setText("*******");
        }
    }//GEN-LAST:event_txtUserMousePressed

    private void txtPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMousePressed
        txtPassword.setText("");
        if (txtUser.getText().equals("")) {
            txtUser.setText("Ingrese su nombre de usuario...");
        }
    }//GEN-LAST:event_txtPasswordMousePressed

    private void panelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseEntered
        panelExit.setBackground(Color.red);
        labelExit.setForeground(Color.white);
    }//GEN-LAST:event_panelExitMouseEntered

    private void panelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseExited
        panelExit.setBackground(Color.white);
        labelExit.setForeground(Color.BLACK);
    }//GEN-LAST:event_panelExitMouseExited

    private void panelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panelExitMouseClicked

    private void txtEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEntrarMouseClicked
        if ((controlarTxtUser() && controlarTxtPassword())) {
            // nos traemos el la contraseña/password a string
            String password = new String(txtPassword.getPassword());
            // hasheamos el password para ver si coincide con el hash de la bd
            String passHashed = hash.sha1(password); // hasheamos la constraseña ingresada. 
            String nombreUsuario = txtUser.getText();
            if (ctrlUser.iniciarSesion(nombreUsuario, passHashed)) {
                ctrlUser.actualizarUltimoInicio(nombreUsuario);
                mostrarMenu(nombreUsuario);
            } else {
                JOptionPane.showMessageDialog(null, "Error. Nombre de usuario o contraseña invalida");
            }
        }
    }//GEN-LAST:event_txtEntrarMouseClicked
    private boolean controlarTxtUser() {
        boolean result = true;
        if (txtUser.getText().equals("Ingrese su nombre de usuario...")) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre de usuario.");
            result = false;
        }
        return result;
    }

    private void mostrarMenu(String nombreUsuario) {
        Menu menu = new Menu(nombreUsuario);
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }

    // chequear esto.
    private boolean controlarTxtPassword() {
        boolean result = true;
        char[] passwordChars = txtPassword.getPassword();
        String password = new String(passwordChars);
        if (password.isEmpty() || password.equals("*******")) {
            result = false;
        }
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelExit;
    private javax.swing.JPanel panelExit;
    private javax.swing.JLabel txtEntrar;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
