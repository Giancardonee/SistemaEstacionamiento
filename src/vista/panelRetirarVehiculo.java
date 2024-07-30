package vista;




import servicios.GeneradorTicket;
import controlador.Ctrl_PrecioHora;
import controlador.Ctrl_Tarifa;
import controlador.Ctrl_Vehiculo;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.Tarifa;

public class panelRetirarVehiculo extends javax.swing.JPanel {
    public panelRetirarVehiculo() {
        initComponents();
        cargarFechaActual();
        this.setSize(960, 600);
    }

    /*  CONTROLADORES  */
    private Ctrl_Tarifa ctrlTarifa = new Ctrl_Tarifa();
    private Ctrl_Vehiculo ctrlVehiculo = new Ctrl_Vehiculo();
    private Ctrl_PrecioHora ctrlPrecioHora = new Ctrl_PrecioHora();

    /*  MODELOS  */
    private Tarifa modeloTarifa;

    /*  VARIABLES DE USO GENERAL  */
    private String patenteVehiculo;
    private Timestamp fechaActual;
    private Timestamp fechaIngreso;
    private Integer horasTranscurridas;
    private String tipoVehiculo;
    private Double precioHora;
    private Double totalPagar;
    private boolean facturaCreada = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btnRetirarVehiculo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        panelLupa = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JTextField();
        txtFechaActual = new javax.swing.JTextField();
        txtTotalAbonar = new javax.swing.JTextField();
        btnCalcularTotal = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        btnRetirarVehiculo.setBackground(new java.awt.Color(0, 102, 153));
        btnRetirarVehiculo.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        btnRetirarVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirarVehiculo.setText("Retirar Vehiculo");
        btnRetirarVehiculo.setBorderPainted(false);
        btnRetirarVehiculo.setFocusPainted(false);
        btnRetirarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarVehiculoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Retirar Vehiculo");

        txtPatente.setBackground(new java.awt.Color(0, 51, 102));
        txtPatente.setFont(new java.awt.Font("Dialog", 0, 35)); // NOI18N
        txtPatente.setForeground(new java.awt.Color(255, 255, 255));
        txtPatente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPatente.setText("Ingrese la patente aqui...");
        txtPatente.setBorder(null);
        txtPatente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPatenteMouseClicked(evt);
            }
        });
        txtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatenteActionPerformed(evt);
            }
        });
        txtPatente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPatenteKeyPressed(evt);
            }
        });

        panelLupa.setBackground(new java.awt.Color(0, 51, 102));
        panelLupa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelLupaMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa logo.png"))); // NOI18N

        javax.swing.GroupLayout panelLupaLayout = new javax.swing.GroupLayout(panelLupa);
        panelLupa.setLayout(panelLupaLayout);
        panelLupaLayout.setHorizontalGroup(
            panelLupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLupaLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        panelLupaLayout.setVerticalGroup(
            panelLupaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLupaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha Actual: ");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha de Ingreso: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Total a abonar: ");

        txtFechaIngreso.setEditable(false);
        txtFechaIngreso.setBackground(new java.awt.Color(0, 0, 102));
        txtFechaIngreso.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFechaIngreso.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaIngreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaIngreso.setBorder(null);

        txtFechaActual.setEditable(false);
        txtFechaActual.setBackground(new java.awt.Color(0, 0, 102));
        txtFechaActual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtFechaActual.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaActual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaActual.setBorder(null);

        txtTotalAbonar.setEditable(false);
        txtTotalAbonar.setBackground(new java.awt.Color(0, 51, 102));
        txtTotalAbonar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtTotalAbonar.setForeground(new java.awt.Color(255, 255, 255));
        txtTotalAbonar.setBorder(null);
        txtTotalAbonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAbonarActionPerformed(evt);
            }
        });

        btnCalcularTotal.setBackground(new java.awt.Color(0, 102, 153));
        btnCalcularTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCalcularTotal.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularTotal.setText("Calcular Total a Abonar");
        btnCalcularTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panelLupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jLabel1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRetirarVehiculo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                            .addComponent(txtFechaActual, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(39, 39, 39)
                                        .addComponent(btnCalcularTotal))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalAbonar, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLupa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtFechaIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnCalcularTotal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotalAbonar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnRetirarVehiculo)
                .addGap(57, 57, 57))
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

    private void txtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatenteActionPerformed

    }//GEN-LAST:event_txtPatenteActionPerformed


    private void txtPatenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPatenteMouseClicked
        if (txtPatente.getText().equals("Ingrese la patente aqui...")) {
            txtPatente.setText("");
        }
    }//GEN-LAST:event_txtPatenteMouseClicked

    private void panelLupaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelLupaMouseClicked

    }//GEN-LAST:event_panelLupaMouseClicked

    private void txtPatenteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatenteKeyPressed

    }//GEN-LAST:event_txtPatenteKeyPressed

    private void btnRetirarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarVehiculoActionPerformed
        if (facturaCreada) {
            if (ctrlTarifa.actualizarTarifa(modeloTarifa)) {
                if (ctrlVehiculo.retirarVehiculo(patenteVehiculo)) {
                    JOptionPane.showMessageDialog(null, "Vehiculo Retirado Exitosamente!");
                    // aca deberia generar el ticket. 
                     GeneradorTicket.generarPDF(modeloTarifa);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, primero calcule el total a abonar.");
        }
    }//GEN-LAST:event_btnRetirarVehiculoActionPerformed

    private void txtTotalAbonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAbonarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAbonarActionPerformed

    private void btnCalcularTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularTotalActionPerformed
        if (!txtPatente.getText().equals("") && (!txtPatente.getText().equals("Ingrese la patente aqui..."))) {
            patenteVehiculo = txtPatente.getText().toUpperCase(); // pasamos la patente a mayuscula.
            if (ctrlVehiculo.vehiculoEnEstablecimiento(patenteVehiculo)) {
                if (!facturaCreada) {
                    cargarFechaIngreso();
                    calcularTarifa();
                    cargarTotalAbonar();
                    facturaCreada = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "El vehiculo no se encuentra en el establcimiento.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una patente.");
        }
    }//GEN-LAST:event_btnCalcularTotalActionPerformed
    private void cargarFechaActual() {
        fechaActual = new Timestamp(System.currentTimeMillis());
        String fechaFormateada = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(fechaActual);
        txtFechaActual.setText(fechaFormateada);
    }

    private void cargarFechaIngreso() {
        fechaIngreso = ctrlTarifa.devolverFechaIngreso(patenteVehiculo);
        String fechaFormateada = new SimpleDateFormat("dd-MM-yyyy HH:mm").format(fechaIngreso);
        txtFechaIngreso.setText(fechaFormateada);
    }

    private Integer calcularHorasTranscurridas(Timestamp fechaIngreso, Timestamp fechaActual) {
        // Obtiene la diferencia en milisegundos
        long diferenciaMillis = fechaActual.getTime() - fechaIngreso.getTime();
        // Convierte la diferencia de milisegundos a horas
        int hs = (int) (diferenciaMillis / (1000 * 60 * 60));
        // si el vehiculo estuvo menos de una hora, se debe cobrar la hora completa de todas formas.
        if (hs == 0) {
            hs = 1;
        }
        return hs;
    }

    private double calcularTotalPagar(Double precioHora, Integer hsTranscurridas) {
        return (precioHora * hsTranscurridas);
    }

    private void calcularTarifa() {
        tipoVehiculo = ctrlVehiculo.devolverTipoVehiculo(patenteVehiculo);
        precioHora = ctrlPrecioHora.devolverPrecio(tipoVehiculo);
        horasTranscurridas = calcularHorasTranscurridas(fechaIngreso, fechaActual);
        totalPagar = calcularTotalPagar(precioHora, horasTranscurridas);
        String dniCliente = ctrlVehiculo.devolverDniDueño(patenteVehiculo);
        int idTarifa = ctrlTarifa.devolverIdTarifa(patenteVehiculo);
        modeloTarifa = new Tarifa(patenteVehiculo, fechaIngreso, fechaActual, horasTranscurridas, totalPagar,dniCliente,idTarifa);
    }
    
    private void ObtenerDniCliente(String patenteVehiculo){
        
    }
    
    private void cargarTotalAbonar() {
        String stringAbonar = "$ " + totalPagar.toString();
        txtTotalAbonar.setText(stringAbonar);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularTotal;
    private javax.swing.JButton btnRetirarVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelLupa;
    private javax.swing.JTextField txtFechaActual;
    private javax.swing.JTextField txtFechaIngreso;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtTotalAbonar;
    // End of variables declaration//GEN-END:variables
}
