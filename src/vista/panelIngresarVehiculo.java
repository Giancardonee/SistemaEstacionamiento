package vista;

import controlador.Ctrl_Cliente;
import controlador.Ctrl_Tarifa;
import controlador.Ctrl_Vehiculo;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Cliente;
import modelo.Vehiculo;

public class panelIngresarVehiculo extends javax.swing.JPanel {

    public panelIngresarVehiculo() {
        initComponents();
        this.setSize(960, 600);
    }

    private Ctrl_Tarifa ctrlTarifa = new Ctrl_Tarifa();
    private Ctrl_Cliente ctrlCliente = new Ctrl_Cliente();
    private Ctrl_Vehiculo ctrlVehiculo = new Ctrl_Vehiculo();
    private Vehiculo vehiculoIngreso;
    private Cliente clienteBuscado = null;
    private boolean registrarDueño = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnIngresarVehiculo = new javax.swing.JButton();
        txtPatente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDniDuen = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        paneLupa = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbTipoVehiculo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();

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

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Patente:");

        btnIngresarVehiculo.setBackground(new java.awt.Color(0, 102, 153));
        btnIngresarVehiculo.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnIngresarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarVehiculo.setText("Ingresar Vehiculo");
        btnIngresarVehiculo.setBorderPainted(false);
        btnIngresarVehiculo.setFocusPainted(false);
        btnIngresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVehiculoActionPerformed(evt);
            }
        });

        txtPatente.setBackground(new java.awt.Color(153, 153, 153));
        txtPatente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtPatente.setForeground(new java.awt.Color(51, 51, 51));
        txtPatente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPatente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPatenteMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Ingresar Vehiculo");

        txtDniDuen.setBackground(new java.awt.Color(0, 51, 102));
        txtDniDuen.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        txtDniDuen.setForeground(new java.awt.Color(255, 255, 255));
        txtDniDuen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDniDuen.setText("Ingrese el dni del dueño aqui.......");
        txtDniDuen.setBorder(null);
        txtDniDuen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDniDuenMouseClicked(evt);
            }
        });
        txtDniDuen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniDuenActionPerformed(evt);
            }
        });
        txtDniDuen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniDuenKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniDuenKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de Vehiculo");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre: ");

        txtApellido.setEditable(false);
        txtApellido.setBackground(new java.awt.Color(0, 51, 102));
        txtApellido.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setBorder(null);
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(0, 51, 102));
        txtNombre.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(null);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        paneLupa.setBackground(new java.awt.Color(0, 51, 102));
        paneLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paneLupaMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa logo.png"))); // NOI18N

        javax.swing.GroupLayout paneLupaLayout = new javax.swing.GroupLayout(paneLupa);
        paneLupa.setLayout(paneLupaLayout);
        paneLupaLayout.setHorizontalGroup(
            paneLupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLupaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneLupaLayout.setVerticalGroup(
            paneLupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLupaLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Datos del dueño");

        cmbTipoVehiculo.setBackground(new java.awt.Color(153, 153, 153));
        cmbTipoVehiculo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cmbTipoVehiculo.setForeground(new java.awt.Color(51, 51, 51));
        cmbTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Tipo:", "Auto", "Camioneta", "Moto" }));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono:");

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(0, 51, 102));
        txtTelefono.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(41, 41, 41)
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(183, 183, 183))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(153, 153, 153)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(paneLupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDniDuen, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(297, 297, 297)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(btnIngresarVehiculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(paneLupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDniDuen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)))
                .addComponent(btnIngresarVehiculo)
                .addGap(171, 171, 171))
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

    private void paneLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paneLupaMouseClicked

    }//GEN-LAST:event_paneLupaMouseClicked

    private void txtDniDuenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniDuenActionPerformed

    }//GEN-LAST:event_txtDniDuenActionPerformed

    // Al apretar enter, buscamos el cliente. 
    private void txtDniDuenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniDuenKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarCliente();
        }
    }//GEN-LAST:event_txtDniDuenKeyPressed


    private void txtDniDuenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDniDuenMouseClicked
        if (txtPatente.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese primero la patente.");
        } else if (txtDniDuen.getText().equals("Ingrese el dni del dueño aqui.......")) {
            txtDniDuen.setText("");
        }
    }//GEN-LAST:event_txtDniDuenMouseClicked

    private void txtPatenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatenteMouseClicked
        if (txtDniDuen.getText().equals("")) {
            txtDniDuen.setText("Ingrese el dni del dueño aqui.......");
        }
    }//GEN-LAST:event_txtPatenteMouseClicked

    // Este metodo es el encargado de registrar el ingreso del vehiculo. 
    private void btnIngresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVehiculoActionPerformed

        if (cmbTipoVehiculo.getSelectedIndex() != 0) { // si se selecciono un tipo de vehiculo
            if (ctrlVehiculo.vehiculoEnEstablecimiento(txtPatente.getText()) == false) {
                vehiculoIngreso = crearInstanciaVehiculo();
                if (ctrlTarifa.generarTarifaIngreso(vehiculoIngreso)) {
                    if (ctrlVehiculo.ingresarVehiculo(vehiculoIngreso)) {
                        if (registrarDueño == true) {
                            RegistrarCliente();
                        }
                        mostrarMensajeAviso("Vehiculo Ingresado Exitosamente!");
                        vaciarCampos();
                    } else {
                        mostrarMensajeAviso("Error al ingresar vehiculo. Intente nuevamente.");
                    }
                } else {
                    mostrarMensajeAviso("Error al generar la tarifa de ingreso. Por favor intente nuevamente.");
                }
            } else {
                mostrarMensajeAviso("El vehiculo con patente " + txtPatente.getText() + " ya se encuentra en el establecimiento.");
            }
        } else {
            mostrarMensajeAviso("Por favor, seleccione un tipo de vehiculo.");
        }
    }//GEN-LAST:event_btnIngresarVehiculoActionPerformed

    private void txtDniDuenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniDuenKeyReleased
        if (txtDniDuen.getText().length() == 8) {
            buscarCliente();
            if (clienteBuscado == null) // es porque el cliente no existe.
            {
                solicitarDatosDueño(); // DUEÑO = CLIENTE en este caso es lo mismo .
            } else {
                String tipoVehiculo = devolverTipoVehiculo(txtPatente.getText());
                seleccionarTipoVehiculoEnCMBox(tipoVehiculo);

            }
        }
    }//GEN-LAST:event_txtDniDuenKeyReleased

    private void solicitarDatosDueño() {
        txtApellido.setEditable(true);
        txtNombre.setEditable(true);
        txtTelefono.setEditable(true);
        registrarDueño = true;
        marcarCamposACompletar();
        RegistrarCliente();
    }

    private boolean validarCamposCompletos() {
        return (!txtApellido.getText().equals("") && !txtDniDuen.getText().equals("") && !txtNombre.getText().equals("") && !txtTelefono.getText().equals(""));
    }

    private void RegistrarCliente() {
        if (validarCamposCompletos()) {
            String apellido = txtApellido.getText();
            String nombre = txtNombre.getText();
            String dni = txtDniDuen.getText();
            String telefono = txtTelefono.getText();
            Cliente nuevoCliente = new Cliente(dni, nombre, apellido, telefono);
            ctrlCliente.registrarCliente(nuevoCliente);
            desmarcarCamposACompletar();
            //mostrarMensajeAviso("Se registro correctamente el dueño del vehiculo.");
        } else {
            mostrarMensajeAviso("Por favor, ingrese todos los datos del dueño.");
        }
    }

    private void marcarCamposACompletar() {
        txtApellido.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
        txtNombre.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
        txtTelefono.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
    }

    private void desmarcarCamposACompletar() {
        txtApellido.setEditable(false);
        txtNombre.setEditable(false);
        txtTelefono.setEditable(false);
        txtApellido.setBorder(null);
        txtNombre.setBorder(null);
        txtTelefono.setBorder(null);
    }

    private String devolverTipoVehiculo(String patente) {
        return ctrlVehiculo.devolverTipoVehiculo(patente);
    }

    private void seleccionarTipoVehiculoEnCMBox(String tipoVehiculo) {

        if (tipoVehiculo.equals("Auto")) {
            cmbTipoVehiculo.setSelectedIndex(1);
        } else if (tipoVehiculo.equals("Camioneta")) {
            cmbTipoVehiculo.setSelectedIndex(2);
        } else {
            cmbTipoVehiculo.setSelectedIndex(3);
        }
        cmbTipoVehiculo.setEditable(false);
    }


    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        resaltarBordes(txtNombre);
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        resaltarBordes(txtApellido);
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        resaltarBordes(txtTelefono);
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void resaltarBordes(JTextField txt) {
        if (txtNombre.getText().length() >= 1) {
            txt.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.GREEN));
        } else {
            txt.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
        }
    }

    private void buscarCliente() {
        if (!txtPatente.getText().equals("")) {
            if (!txtDniDuen.getText().equals("") && !txtDniDuen.getText().equals("Ingrese el dni del dueño aqui.......")) {
                clienteBuscado = ctrlCliente.retornarCliente(txtDniDuen.getText());
                if (clienteBuscado != null) {

                    txtApellido.setText(clienteBuscado.getApellido());
                    txtNombre.setText(clienteBuscado.getNombre());
                    txtTelefono.setText(clienteBuscado.getTelefono());
                } else {

                    if (registrarDueño == false) {
                        mostrarMensajeAviso("El dni ingresado: " + txtDniDuen.getText() + " no se encuentra registrado.");
                    } else {
                        solicitarDatosDueño(); // Asume que es necesario solicitar datos si no hay coincidencia
                    }
                }
            } else {
                mostrarMensajeAviso("Por favor, ingrese un dni");
            }
        } else {
            mostrarMensajeAviso("Por favor, ingrese una patente.");
        }
    }

    private Vehiculo crearInstanciaVehiculo() {
        String dniDuen = txtDniDuen.getText();
        String patente = txtPatente.getText().toUpperCase(); // lo guardamos en mayuscula.
        String tipoVehiculo = cmbTipoVehiculo.getSelectedItem().toString();
        String ubicacion = "Dentro del establecimiento";
        Vehiculo vehiculo = new Vehiculo(dniDuen, patente, tipoVehiculo, ubicacion);
        return vehiculo;
    }

    private void mostrarMensajeAviso(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    private void vaciarCampos() {
        txtApellido.setText("");
        txtDniDuen.setText("");
        txtNombre.setText("");
        txtPatente.setText("");
        txtTelefono.setText("");
        cmbTipoVehiculo.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarVehiculo;
    private javax.swing.JComboBox<String> cmbTipoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel paneLupa;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDniDuen;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
