/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import conexion.Conexion;
import controlador.Ctrl_Usuario;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

public class panelUsuarios extends javax.swing.JPanel {

    private Ctrl_Usuario ctrlUsuario = new Ctrl_Usuario();
    private DefaultTableModel modeloTabla;
    
    public panelUsuarios() {
        initComponents();
        this.setSize(956, 456);
        cargarTablaUsuarios();
        cargarUsuarioSeleccionado();
    }

    private void cargarTablaUsuarios() {
        Connection cn = Conexion.conectar();
        try {
            String sql = "SELECT nombreUsuario,nombre,apellido,dni,tipoUsuario,telefono,ultimoInicio FROM tb_usuario";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            crearModeloTabla();
            
            //cargamos la tabla
            while (rs.next()) {
                Object[] row = new Object[7];
                row[0] = rs.getString("nombreUsuario");
                row[1] = rs.getString("nombre");
                row[2] = rs.getString("apellido");
                row[3] = rs.getString("dni");
                row[4] = rs.getString("tipoUsuario");
                row[5] = rs.getString("telefono");
                cargarUltimoInicio(row, rs);

                modeloTabla.addRow(row); // agregamos la fila a la tabla
            }
            Font font = new Font("Ebrima", Font.BOLD, 14);
            tablaUsuarios.setFont(font);

            tablaUsuarios.setModel(modeloTabla);
            tablaUsuarios.setDefaultEditor(Object.class, null);// que no sea editable
            tablaUsuarios.setBackground(Color.cyan);
            rs.close();
            cn.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla de usuarios");
            System.out.println("Error al cargar la tabla de usuarios. Error " + e);
        }
    }

    private void crearModeloTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Usuario");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Dni");
        modeloTabla.addColumn("Tipo Usuario");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Ult. Inicio");
    }

    private void cargarUltimoInicio(Object[] obj, ResultSet rs) throws SQLException {
        String ultimoInicio = rs.getString("ultimoInicio");

        if (ultimoInicio == null || "NULL".equalsIgnoreCase(ultimoInicio)) {
            obj[6] = "";
        } else {
            obj[6] = ultimoInicio;
        }
    }

    private void cargarUsuarioSeleccionado() {
        // Caza algún clic sobre algún usuario de la lista
        tablaUsuarios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Usuario usuarioSeleccionado = obtenerUsuarioSeleccionadoTabla();
                asignarDatosEnTxtFields(usuarioSeleccionado);
            }
        });
    }

    private void asignarDatosEnTxtFields(Usuario user) {
        txtNombre.setText(user.getNombre());
        txtApellido.setText(user.getApellido());
        txtDni.setText(user.getDni());
        txtTelefono.setText(user.getTelefono());
        txtUsuario.setText(user.getNombreUsuario());
        seleccionarTipoUsuarioEnComboBox(user.getTipoUsuario());
    }

    private void seleccionarTipoUsuarioEnComboBox(String tipoUsuario) {
        for (int i = 0; i < cmbTipoUsuario.getItemCount(); i++) {
            if (cmbTipoUsuario.getItemAt(i).equals(tipoUsuario)) {
                cmbTipoUsuario.setSelectedIndex(i);
                break;  // Detener la iteración una vez que se encuentra la coincidencia
            }
        }
    }

    private Usuario obtenerUsuarioSeleccionadoTabla() {
        Usuario usuarioSeleccionado = null;
        int filaIndex = tablaUsuarios.getSelectedRow(); // Nos traemos la fila seleccionada.
        if (filaIndex != -1) {
            // Modifica esto según la estructura de tu tabla de usuarios
            String nombreUsuario = (String) tablaUsuarios.getValueAt(filaIndex, 0);
            String nombre = (String) tablaUsuarios.getValueAt(filaIndex, 1);
            String apellido = (String) tablaUsuarios.getValueAt(filaIndex, 2);
            String dni = (String) tablaUsuarios.getValueAt(filaIndex, 3);
            String tipoUsuario = (String) tablaUsuarios.getValueAt(filaIndex, 4);
            String telefono = (String) tablaUsuarios.getValueAt(filaIndex, 5);

            // Crea el objeto Usuario con los datos obtenidos
            usuarioSeleccionado = new Usuario(nombreUsuario, nombre, apellido, dni, tipoUsuario, telefono);
        }
        return usuarioSeleccionado;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnLimpiarCampos = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo de Usuario:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dni:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 19)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefono:");

        btnLimpiarCampos.setBackground(new java.awt.Color(0, 0, 204));
        btnLimpiarCampos.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnLimpiarCampos.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCampos.setText("Limpiar Campos");
        btnLimpiarCampos.setBorderPainted(false);
        btnLimpiarCampos.setFocusPainted(false);
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });

        txtUsuario.setEditable(false);
        txtUsuario.setBackground(new java.awt.Color(153, 153, 153));
        txtUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtUsuario.setBorder(null);
        txtUsuario.setEnabled(false);

        txtNombre.setBackground(new java.awt.Color(153, 153, 153));
        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));

        txtTelefono.setBackground(new java.awt.Color(153, 153, 153));
        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(51, 51, 51));

        txtDni.setBackground(new java.awt.Color(153, 153, 153));
        txtDni.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(51, 51, 51));

        txtApellido.setBackground(new java.awt.Color(153, 153, 153));
        txtApellido.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(51, 51, 51));

        cmbTipoUsuario.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        cmbTipoUsuario.setForeground(new java.awt.Color(51, 51, 51));
        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Administrador", "Empleado" }));

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);
        if (tablaUsuarios.getColumnModel().getColumnCount() > 0) {
            tablaUsuarios.getColumnModel().getColumn(0).setResizable(false);
        }

        btnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar usuario.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorderPainted(false);
        btnEliminar.setFocusPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 102, 0));
        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar usuario.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setFocusPainted(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menu administrar usuarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addGap(59, 59, 59))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(134, 134, 134)
                                .addComponent(btnLimpiarCampos)
                                .addGap(105, 105, 105)
                                .addComponent(btnActualizar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar)
                    .addComponent(btnLimpiarCampos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String nombreUsuario = txtUsuario.getText();
        if (!nombreUsuario.equals("")) {
            if (ctrlUsuario.existeUsuario(nombreUsuario)) {
                int respuesta = JOptionPane.showConfirmDialog(null, "Desea eliminar el usuario " + nombreUsuario + "? ");
                if (respuesta == 0) {
                    if (ctrlUsuario.borrarUsuario(nombreUsuario)) {
                        JOptionPane.showMessageDialog(null, "Usuario Eliminado Exitosamente!");
                        actualizarTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al eliminar el usuario.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Operacion cancelada.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese su nombre de usuario si desea eliminarlo.");
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (camposLlenos()) {
            Usuario actualizarUsuario = obtenerUsuarioTxtFields();
            if (ctrlUsuario.actualizarUsuario(actualizarUsuario)) {
                JOptionPane.showMessageDialog(null, "Usuario Actualizado Exitosamente!");
                actualizarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar, deben completarse todos los campos.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private Usuario obtenerUsuarioTxtFields() {
        Usuario user;
        String nombreUsuario = txtUsuario.getText();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String dni = txtDni.getText();
        String telefono = txtTelefono.getText();
        String tipoUsuario = cmbTipoUsuario.getSelectedItem().toString();
        return user = new Usuario(nombreUsuario, nombre, apellido, dni, tipoUsuario, telefono);
    }

    private boolean camposLlenos() {
        return (!txtUsuario.getText().equals("") && (!txtNombre.getText().equals("")) && (!txtApellido.getText().equals(""))
                && (!txtTelefono.getText().equals("")) && (!txtDni.getText().equals("")) && (cmbTipoUsuario.getSelectedIndex() != 0));
    }

    private void limpiarCampos() {
        txtApellido.setText("");
        txtDni.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        cmbTipoUsuario.setSelectedIndex(0);
        tablaUsuarios.clearSelection();
    }

    private void actualizarTabla() {
        cargarTablaUsuarios();
        limpiarCampos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
