/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.grafico;

import javax.swing.JOptionPane;
import paquete.clases.GestionVuelos;
import paquete.clases.Pasajero;
import paquete.clases.Vuelo;

/**
 *
 * @author Leonardo
 */
public class UIVuelos extends javax.swing.JFrame {

    /**
     * Creates new form UIVuelos
     */
    GestionVuelos objGE;
    
    public UIVuelos() {
        initComponents();
        objGE = new GestionVuelos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FlightSeatsLabel = new javax.swing.JLabel();
        FlightNameLabel = new javax.swing.JLabel();
        FlightNumberTextField = new javax.swing.JTextField();
        FlightSeatsNumberComboBox = new javax.swing.JComboBox<>();
        CreateFlightButton = new javax.swing.JButton();
        FlightListComboBox = new javax.swing.JComboBox<>();
        SelectFlightLabel = new javax.swing.JLabel();
        PassengerNameLabel = new javax.swing.JLabel();
        PassengerNameTextField = new javax.swing.JTextField();
        PassengerDNILabel = new javax.swing.JLabel();
        PassengerDNITextField = new javax.swing.JTextField();
        AddPassengerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FlightSeatsLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightSeatsLabel.setText("Número de asientos:");

        FlightNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FlightNameLabel.setText("Número de vuelo:");

        FlightSeatsNumberComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "150", "200", " " }));

        CreateFlightButton.setText("Crear vuelo");
        CreateFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateFlightButtonActionPerformed(evt);
            }
        });

        SelectFlightLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SelectFlightLabel.setText("Seleccione vuelo:");

        PassengerNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PassengerNameLabel.setText("Nombre del pasajero:");

        PassengerDNILabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PassengerDNILabel.setText("DNI del pasajero:");

        AddPassengerButton.setText("Añadir pasajero");
        AddPassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPassengerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FlightSeatsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(FlightNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FlightSeatsNumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FlightNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CreateFlightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassengerNameLabel)
                            .addComponent(SelectFlightLabel)
                            .addComponent(PassengerDNILabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PassengerNameTextField)
                            .addComponent(PassengerDNITextField, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(FlightListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(AddPassengerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FlightNameLabel)
                            .addComponent(FlightNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectFlightLabel)
                            .addComponent(FlightListComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FlightSeatsLabel)
                    .addComponent(FlightSeatsNumberComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PassengerNameLabel)
                    .addComponent(PassengerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateFlightButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassengerDNILabel)
                            .addComponent(PassengerDNITextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddPassengerButton)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateFlightButtonActionPerformed
        try {
            int numVuelo = Integer.parseInt(FlightNumberTextField.getText());
            int numAsientos = Integer.parseInt((String) FlightSeatsNumberComboBox.getSelectedItem());
            Vuelo objVuelo = new Vuelo(numVuelo, numAsientos);
            
            //Añadir vuelo a FlightListComboBox:
            if (objGE.agregarVuelo(objVuelo)) {
                FlightListComboBox.addItem(FlightNumberTextField.getText());
            }
            
            //Limpiar campos
            FlightNumberTextField.setText("");
            
            objGE.verInfo();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese número de vuelo válido, por favor.");
            //Limpiar campos
            FlightNumberTextField.setText("");
        }
        
    }//GEN-LAST:event_CreateFlightButtonActionPerformed

    private void AddPassengerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPassengerButtonActionPerformed
        try {
            int vueloSeleccionado = Integer.parseInt((String) FlightListComboBox.getSelectedItem());
            int pos = objGE.busquedaS(vueloSeleccionado);
            String nombre = PassengerNameTextField.getText();
            long dni = Long.decode(PassengerDNITextField.getText());
            Pasajero objPasajero = new Pasajero(nombre, dni);
            objGE.getArreglo()[pos].agregarPasajeroAlVuelo(objPasajero);
            System.out.println(objGE.getArreglo()[pos].obeneterInfoVuelo());
            
            //Limpiar campos
            PassengerDNITextField.setText("");
            PassengerNameTextField.setText("");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese DNI correcto, por favor.");
            
            //Limpiar campos
            PassengerDNITextField.setText("");
            PassengerNameTextField.setText("");
        }

    }//GEN-LAST:event_AddPassengerButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UIVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPassengerButton;
    private javax.swing.JButton CreateFlightButton;
    private javax.swing.JComboBox<String> FlightListComboBox;
    private javax.swing.JLabel FlightNameLabel;
    private javax.swing.JTextField FlightNumberTextField;
    private javax.swing.JLabel FlightSeatsLabel;
    private javax.swing.JComboBox<String> FlightSeatsNumberComboBox;
    private javax.swing.JLabel PassengerDNILabel;
    private javax.swing.JTextField PassengerDNITextField;
    private javax.swing.JLabel PassengerNameLabel;
    private javax.swing.JTextField PassengerNameTextField;
    private javax.swing.JLabel SelectFlightLabel;
    // End of variables declaration//GEN-END:variables
}