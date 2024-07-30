/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Ctrl_PrecioHora;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class panelTarifas extends javax.swing.JPanel {

    /**
     * Creates new form panelUsuarios
     */
    public panelTarifas() {
        initComponents();
        this.setSize(960, 600);
        cargarPreciosActuales();
    }
    Ctrl_PrecioHora ctrlPrecioHora = new Ctrl_PrecioHora();
    String txtDefaultPrecioNuevo = "Ingrese el precio aqui...";

    private void vaciarTxtField(JTextField txt) {
        if (txt.getText().equals(txtDefaultPrecioNuevo)) {
            txt.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pActAuto = new javax.swing.JTextField();
        pActCamioneta = new javax.swing.JTextField();
        pActMoto = new javax.swing.JTextField();
        txtPrecioNuevoAuto = new javax.swing.JTextField();
        txtPrecioNuevoCamioneta = new javax.swing.JTextField();
        txtPrecioNuevoMoto = new javax.swing.JTextField();

        jMenuItem1.setText("jMenuItem1");

        setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestion de Tarifas");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio Nuevo");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de Vehiculo");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio Actual");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Auto ");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Moto ");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Camioneta");

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pActAuto.setEditable(false);
        pActAuto.setBackground(new java.awt.Color(0, 51, 102));
        pActAuto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pActAuto.setForeground(new java.awt.Color(204, 204, 204));
        pActAuto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pActAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActAutoActionPerformed(evt);
            }
        });

        pActCamioneta.setEditable(false);
        pActCamioneta.setBackground(new java.awt.Color(0, 51, 102));
        pActCamioneta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pActCamioneta.setForeground(new java.awt.Color(204, 204, 204));
        pActCamioneta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pActMoto.setEditable(false);
        pActMoto.setBackground(new java.awt.Color(0, 51, 102));
        pActMoto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        pActMoto.setForeground(new java.awt.Color(204, 204, 204));
        pActMoto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPrecioNuevoAuto.setBackground(new java.awt.Color(0, 51, 102));
        txtPrecioNuevoAuto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrecioNuevoAuto.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecioNuevoAuto.setText("Ingrese el precio aqui...");
        txtPrecioNuevoAuto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioNuevoAutoMouseClicked(evt);
            }
        });
        txtPrecioNuevoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioNuevoAutoActionPerformed(evt);
            }
        });

        txtPrecioNuevoCamioneta.setBackground(new java.awt.Color(0, 51, 102));
        txtPrecioNuevoCamioneta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrecioNuevoCamioneta.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecioNuevoCamioneta.setText("Ingrese el precio aqui...");
        txtPrecioNuevoCamioneta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioNuevoCamionetaMouseClicked(evt);
            }
        });

        txtPrecioNuevoMoto.setBackground(new java.awt.Color(0, 51, 102));
        txtPrecioNuevoMoto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtPrecioNuevoMoto.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecioNuevoMoto.setText("Ingrese el precio aqui...");
        txtPrecioNuevoMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPrecioNuevoMotoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(77, 77, 77)
                .addComponent(jLabel4)
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addGap(142, 142, 142))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pActMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pActCamioneta, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(186, 186, 186)
                                    .addComponent(pActAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPrecioNuevoCamioneta, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(txtPrecioNuevoAuto)
                            .addComponent(txtPrecioNuevoMoto))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pActAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtPrecioNuevoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pActCamioneta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtPrecioNuevoCamioneta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pActMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecioNuevoMoto, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
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

    private void txtPrecioNuevoAutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioNuevoAutoMouseClicked
        vaciarTxtField(txtPrecioNuevoAuto);
        corroborarSiguientesTxtField(txtPrecioNuevoCamioneta, txtPrecioNuevoMoto);
    }//GEN-LAST:event_txtPrecioNuevoAutoMouseClicked

    private void txtPrecioNuevoCamionetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioNuevoCamionetaMouseClicked
        vaciarTxtField(txtPrecioNuevoCamioneta);
        corroborarSiguientesTxtField(txtPrecioNuevoAuto, txtPrecioNuevoMoto);
    }//GEN-LAST:event_txtPrecioNuevoCamionetaMouseClicked

    private void txtPrecioNuevoMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioNuevoMotoMouseClicked
        vaciarTxtField(txtPrecioNuevoMoto);
        corroborarSiguientesTxtField(txtPrecioNuevoAuto, txtPrecioNuevoCamioneta);
    }//GEN-LAST:event_txtPrecioNuevoMotoMouseClicked

    private void pActAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pActAutoActionPerformed

    private void txtPrecioNuevoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioNuevoAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioNuevoAutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actualizarTipoVehiculo(txtPrecioNuevoAuto.getText(), "Auto");
        actualizarTipoVehiculo(txtPrecioNuevoMoto.getText(), "Moto");
        actualizarTipoVehiculo(txtPrecioNuevoCamioneta.getText(), "Camioneta");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void corroborarSiguientesTxtField(JTextField txt1, JTextField txt2) {
        if (txt1.getText().equals("")) {
            txt1.setText(txtDefaultPrecioNuevo);

        }
        if (txt2.getText().equals("")) {
            txt2.setText(txtDefaultPrecioNuevo);
        }
    }

    private void cargarPreciosActuales() {
        Double precioAuto = ctrlPrecioHora.devolverPrecio("Auto");
        Double precioMoto = ctrlPrecioHora.devolverPrecio("Moto");
        Double precioCamioneta = ctrlPrecioHora.devolverPrecio("Camioneta");
        pActAuto.setText(String.valueOf(precioAuto));
        pActCamioneta.setText(String.valueOf(precioCamioneta));
        pActMoto.setText(String.valueOf(precioMoto));
    }

    private boolean txtCompleto(String txt) {
        return (!txt.equals(txtDefaultPrecioNuevo));
    }

    private void actualizarTipoVehiculo(String valorTxt, String tipoVehiculo) {
        if (txtCompleto(valorTxt)) {
            if (chequearCaracteres(valorTxt)) {
                double precioNuevo = Double.parseDouble(valorTxt);
                if (precioNuevo > 0) {
                    ctrlPrecioHora.actualizarPrecio(tipoVehiculo, precioNuevo);
                    cargarPreciosActuales();
                    JOptionPane.showMessageDialog(null, "Precio actualizado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "El precio no puede ser negativo.");
                }
            }
        }
        ponerTxtDefault(tipoVehiculo);
    }

    private boolean chequearCaracteres(String precioChequear) {
        boolean result = false;
        // Patrón para verificar si el texto contiene solo números (positivos o negativos, enteros o decimales)
        String patronNumerico = "-?\\d*\\.?\\d+";
        if (!precioChequear.matches(patronNumerico)) {
            // No cumple con el patrón de un número válido
            JOptionPane.showMessageDialog(null, "Se ingresó una opción no válida.");
        } else {
            // Todos los caracteres son numéricos y cumple con el patrón de un número válido
            result = true;
        }
        return result;
    }

    private void ponerTxtDefault(String tipoVehiculo) {
        if (tipoVehiculo.equals("Moto")) {
            txtPrecioNuevoMoto.setText(txtDefaultPrecioNuevo);
        } else if (tipoVehiculo.equals("Auto")) {
            txtPrecioNuevoAuto.setText(txtDefaultPrecioNuevo);
        } else {
            txtPrecioNuevoCamioneta.setText(txtDefaultPrecioNuevo);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField pActAuto;
    private javax.swing.JTextField pActCamioneta;
    private javax.swing.JTextField pActMoto;
    private javax.swing.JTextField txtPrecioNuevoAuto;
    private javax.swing.JTextField txtPrecioNuevoCamioneta;
    private javax.swing.JTextField txtPrecioNuevoMoto;
    // End of variables declaration//GEN-END:variables
}
