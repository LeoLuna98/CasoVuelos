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

        AddPassengerPanel = new javax.swing.JPanel();
        SelectFlightLabel = new javax.swing.JLabel();
        FlightListComboBox = new javax.swing.JComboBox<>();
        PassengerNameLabel = new javax.swing.JLabel();
        PassengerNameTextField = new javax.swing.JTextField();
        PassengerDNILabel = new javax.swing.JLabel();
        PassengerDNITextField = new javax.swing.JTextField();
        AddPassengerButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        FlightInfoTextPane = new javax.swing.JTextPane();
        FlightInfoLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        FlightNameLabel = new javax.swing.JLabel();
        FlightSeatsLabel = new javax.swing.JLabel();
        CreateFlightButton = new javax.swing.JButton();
        FlightNumberTextField = new javax.swing.JTextField();
        FlightSeatsNumberComboBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de reserva de vuelos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddPassengerPanel.setBackground(new java.awt.Color(97, 212, 195));
        AddPassengerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelectFlightLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        SelectFlightLabel.setForeground(new java.awt.Color(0, 0, 0));
        SelectFlightLabel.setText("Seleccione vuelo:");
        AddPassengerPanel.add(SelectFlightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        FlightListComboBox.setBackground(new java.awt.Color(255, 255, 255));
        FlightListComboBox.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        FlightListComboBox.setForeground(new java.awt.Color(0, 0, 0));
        FlightListComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        FlightListComboBox.setBorder(null);
        FlightListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightListComboBoxActionPerformed(evt);
            }
        });
        AddPassengerPanel.add(FlightListComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        PassengerNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PassengerNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        PassengerNameLabel.setText("Nombre del pasajero:");
        AddPassengerPanel.add(PassengerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        PassengerNameTextField.setBackground(new java.awt.Color(97, 212, 195));
        PassengerNameTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        PassengerNameTextField.setForeground(new java.awt.Color(102, 102, 102));
        PassengerNameTextField.setText("Ingrese nombre");
        PassengerNameTextField.setBorder(null);
        PassengerNameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassengerNameTextFieldMousePressed(evt);
            }
        });
        AddPassengerPanel.add(PassengerNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 174, -1));

        PassengerDNILabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PassengerDNILabel.setForeground(new java.awt.Color(0, 0, 0));
        PassengerDNILabel.setText("DNI del pasajero:");
        AddPassengerPanel.add(PassengerDNILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        PassengerDNITextField.setBackground(new java.awt.Color(97, 212, 195));
        PassengerDNITextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        PassengerDNITextField.setForeground(new java.awt.Color(102, 102, 102));
        PassengerDNITextField.setText("Ingrese DNI");
        PassengerDNITextField.setBorder(null);
        PassengerDNITextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassengerDNITextFieldMousePressed(evt);
            }
        });
        AddPassengerPanel.add(PassengerDNITextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 174, -1));

        AddPassengerButton.setBackground(new java.awt.Color(255, 255, 255));
        AddPassengerButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        AddPassengerButton.setForeground(new java.awt.Color(0, 0, 0));
        AddPassengerButton.setText("Añadir pasajero");
        AddPassengerButton.setBorderPainted(false);
        AddPassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPassengerButtonActionPerformed(evt);
            }
        });
        AddPassengerPanel.add(AddPassengerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 136, -1));

        FlightInfoTextPane.setEditable(false);
        FlightInfoTextPane.setBackground(new java.awt.Color(97, 212, 195));
        FlightInfoTextPane.setBorder(null);
        FlightInfoTextPane.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(FlightInfoTextPane);

        AddPassengerPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 216, 49));

        FlightInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FlightInfoLabel.setForeground(new java.awt.Color(0, 0, 0));
        FlightInfoLabel.setText("Información del vuelo:");
        AddPassengerPanel.add(FlightInfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        AddPassengerPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        AddPassengerPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 10));

        getContentPane().add(AddPassengerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 470, 240));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FlightNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FlightNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        FlightNameLabel.setText("Número de vuelo:");
        jPanel1.add(FlightNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 26, 145, -1));

        FlightSeatsLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FlightSeatsLabel.setForeground(new java.awt.Color(0, 0, 0));
        FlightSeatsLabel.setText("Número de asientos:");
        jPanel1.add(FlightSeatsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        CreateFlightButton.setBackground(new java.awt.Color(255, 255, 255));
        CreateFlightButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CreateFlightButton.setForeground(new java.awt.Color(0, 0, 0));
        CreateFlightButton.setText("Crear vuelo");
        CreateFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateFlightButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CreateFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 120, -1));

        FlightNumberTextField.setBackground(new java.awt.Color(0, 102, 153));
        FlightNumberTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        FlightNumberTextField.setForeground(new java.awt.Color(255, 255, 255));
        FlightNumberTextField.setText("Ingrese número");
        FlightNumberTextField.setBorder(null);
        FlightNumberTextField.setCaretColor(new java.awt.Color(51, 51, 51));
        FlightNumberTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FlightNumberTextFieldMousePressed(evt);
            }
        });
        jPanel1.add(FlightNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, -1));

        FlightSeatsNumberComboBox.setBackground(new java.awt.Color(255, 255, 255));
        FlightSeatsNumberComboBox.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        FlightSeatsNumberComboBox.setForeground(new java.awt.Color(0, 0, 0));
        FlightSeatsNumberComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "150", "200", " " }));
        jPanel1.add(FlightSeatsNumberComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 240));

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
            FlightNumberTextField.setText("Ingrese número");
            FlightSeatsNumberComboBox.setSelectedIndex(0);
            
            objGE.verInfo();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese número de vuelo válido, por favor.");
            //Limpiar campos
            FlightNumberTextField.setText("Ingrese número");
            FlightSeatsNumberComboBox.setSelectedIndex(0);
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
            PassengerDNITextField.setText("Ingrese DNI");
            PassengerNameTextField.setText("Ingrese nombre");
            FlightListComboBox.setSelectedIndex(0);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores correctos, por favor.");
            
            //Limpiar campos
            PassengerDNITextField.setText("Ingrese DNI");
            PassengerNameTextField.setText("Ingrese nombre");
            FlightListComboBox.setSelectedIndex(0);
        }

    }//GEN-LAST:event_AddPassengerButtonActionPerformed

    private void FlightListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightListComboBoxActionPerformed
        try {
            int vueloSeleccionado = Integer.parseInt((String) FlightListComboBox.getSelectedItem());
            int pos = objGE.busquedaS(vueloSeleccionado);
            String cad = objGE.getArreglo()[pos].obeneterInfoVueloSinPasajeros();
            FlightInfoTextPane.setText(cad);
        } catch (Exception e) {
            FlightInfoTextPane.setText("");
        }        
    }//GEN-LAST:event_FlightListComboBoxActionPerformed

    private void PassengerDNITextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengerDNITextFieldMousePressed
        PassengerDNITextField.setText("");
    }//GEN-LAST:event_PassengerDNITextFieldMousePressed

    private void PassengerNameTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengerNameTextFieldMousePressed
        PassengerNameTextField.setText("");        
    }//GEN-LAST:event_PassengerNameTextFieldMousePressed

    private void FlightNumberTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightNumberTextFieldMousePressed
        FlightNumberTextField.setText(""); 
    }//GEN-LAST:event_FlightNumberTextFieldMousePressed

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
    private javax.swing.JPanel AddPassengerPanel;
    private javax.swing.JButton CreateFlightButton;
    private javax.swing.JLabel FlightInfoLabel;
    private javax.swing.JTextPane FlightInfoTextPane;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
