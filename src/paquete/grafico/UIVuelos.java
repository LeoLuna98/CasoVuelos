/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete.grafico;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import paquete.clases.GestionVuelos;
import paquete.clases.Nodo;
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
    DefaultTableModel modelo;
    
    public UIVuelos() {
        initComponents();
        objGE = new GestionVuelos();
        
        //Inicializar modelo
        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("DNI");
        modelo.addColumn("Edad");
        PassengerTable.setModel(modelo);
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
        PassengerNameLabel1 = new javax.swing.JLabel();
        PassengerDNIDeleteTextField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        DeletePassengerButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        DeleteFlightButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        FlightNameLabel = new javax.swing.JLabel();
        FlightSeatsLabel = new javax.swing.JLabel();
        CreateFlightButton = new javax.swing.JButton();
        FlightNumberTextField = new javax.swing.JTextField();
        FlightSeatsNumberComboBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PassengerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de reserva de vuelos");
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddPassengerPanel.setBackground(new java.awt.Color(225, 225, 225));
        AddPassengerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SelectFlightLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SelectFlightLabel.setText("Paso 2. Seleccione un vuelo");
        AddPassengerPanel.add(SelectFlightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        FlightListComboBox.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        FlightListComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir vuelo" }));
        FlightListComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                FlightListComboBoxPopupMenuWillBecomeVisible(evt);
            }
        });
        FlightListComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlightListComboBoxActionPerformed(evt);
            }
        });
        AddPassengerPanel.add(FlightListComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        PassengerNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PassengerNameLabel.setText("Ingrese DNI del pasajero a eliminar:");
        AddPassengerPanel.add(PassengerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        PassengerNameTextField.setBackground(new java.awt.Color(225, 225, 225));
        PassengerNameTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        PassengerNameTextField.setForeground(new java.awt.Color(102, 102, 102));
        PassengerNameTextField.setText("Ingrese nombre");
        PassengerNameTextField.setBorder(null);
        PassengerNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PassengerNameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PassengerNameTextFieldFocusLost(evt);
            }
        });
        AddPassengerPanel.add(PassengerNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 174, -1));

        PassengerDNILabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PassengerDNILabel.setText("DNI del pasajero:");
        AddPassengerPanel.add(PassengerDNILabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        PassengerDNITextField.setBackground(new java.awt.Color(225, 225, 225));
        PassengerDNITextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        PassengerDNITextField.setForeground(new java.awt.Color(102, 102, 102));
        PassengerDNITextField.setText("Ingrese DNI");
        PassengerDNITextField.setBorder(null);
        PassengerDNITextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PassengerDNITextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PassengerDNITextFieldFocusLost(evt);
            }
        });
        AddPassengerPanel.add(PassengerDNITextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 174, -1));

        AddPassengerButton.setBackground(new java.awt.Color(255, 255, 255));
        AddPassengerButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        AddPassengerButton.setText("Añadir pasajero");
        AddPassengerButton.setBorderPainted(false);
        AddPassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPassengerButtonActionPerformed(evt);
            }
        });
        AddPassengerPanel.add(AddPassengerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 136, -1));

        jScrollPane2.setBackground(new java.awt.Color(232, 228, 224));

        FlightInfoTextPane.setEditable(false);
        FlightInfoTextPane.setBackground(new java.awt.Color(224, 224, 224));
        FlightInfoTextPane.setBorder(null);
        FlightInfoTextPane.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(FlightInfoTextPane);

        AddPassengerPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 210, 40));

        FlightInfoLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FlightInfoLabel.setText("Información del vuelo:");
        AddPassengerPanel.add(FlightInfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        AddPassengerPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, 10));

        PassengerNameLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PassengerNameLabel1.setText("Nombre del pasajero:");
        AddPassengerPanel.add(PassengerNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        PassengerDNIDeleteTextField.setBackground(new java.awt.Color(225, 225, 225));
        PassengerDNIDeleteTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        PassengerDNIDeleteTextField.setForeground(new java.awt.Color(102, 102, 102));
        PassengerDNIDeleteTextField.setText("Ingrese DNI");
        PassengerDNIDeleteTextField.setBorder(null);
        PassengerDNIDeleteTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PassengerDNIDeleteTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PassengerDNIDeleteTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PassengerDNIDeleteTextFieldFocusLost(evt);
            }
        });
        AddPassengerPanel.add(PassengerDNIDeleteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 180, -1));

        jSeparator4.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        AddPassengerPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 10, 140));

        DeletePassengerButton.setBackground(new java.awt.Color(255, 255, 255));
        DeletePassengerButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        DeletePassengerButton.setText("Eliminar pasajero");
        DeletePassengerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePassengerButtonActionPerformed(evt);
            }
        });
        AddPassengerPanel.add(DeletePassengerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 140, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jButton1.setText("Ver pasajero con mayor edad");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AddPassengerPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Paso 3. Gestione sus vuelos");
        AddPassengerPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        AddPassengerPanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        AddPassengerPanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 10));

        jButton2.setText("?");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        AddPassengerPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        DeleteFlightButton.setBackground(new java.awt.Color(255, 255, 255));
        DeleteFlightButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        DeleteFlightButton.setText("Presionar para eliminar vuelo");
        DeleteFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteFlightButtonActionPerformed(evt);
            }
        });
        AddPassengerPanel.add(DeleteFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, -1));

        getContentPane().add(AddPassengerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 590, 300));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FlightNameLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FlightNameLabel.setText("Número de vuelo:");
        jPanel1.add(FlightNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 145, -1));

        FlightSeatsLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        FlightSeatsLabel.setText("Número de asientos:");
        jPanel1.add(FlightSeatsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        CreateFlightButton.setBackground(new java.awt.Color(255, 255, 255));
        CreateFlightButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        CreateFlightButton.setText("Crear vuelo");
        CreateFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateFlightButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CreateFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 120, -1));

        FlightNumberTextField.setBackground(new java.awt.Color(0, 153, 255));
        FlightNumberTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        FlightNumberTextField.setForeground(new java.awt.Color(255, 255, 255));
        FlightNumberTextField.setText("Ingrese número");
        FlightNumberTextField.setBorder(null);
        FlightNumberTextField.setCaretColor(new java.awt.Color(51, 51, 51));
        FlightNumberTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FlightNumberTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FlightNumberTextFieldFocusLost(evt);
            }
        });
        jPanel1.add(FlightNumberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, -1));

        FlightSeatsNumberComboBox.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        FlightSeatsNumberComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "150", "200" }));
        FlightSeatsNumberComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                FlightSeatsNumberComboBoxPopupMenuWillBecomeVisible(evt);
            }
        });
        jPanel1.add(FlightSeatsNumberComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 70, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 10));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Paso 1. Cree sus vuelos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 300));

        PassengerTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        PassengerTable.setForeground(new java.awt.Color(51, 51, 51));
        PassengerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        PassengerTable.setGridColor(new java.awt.Color(255, 255, 255));
        PassengerTable.setRowHeight(20);
        PassengerTable.setSelectionBackground(new java.awt.Color(225, 225, 225));
        jScrollPane3.setViewportView(PassengerTable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 800, 200));

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
            
            actualizarTabla();
            
            String cad = objGE.getArreglo()[pos].obeneterInfoVueloSinPasajeros();
            FlightInfoTextPane.setText(cad);
            System.out.println("--------------");
            
            //Limpiar campos
            PassengerDNITextField.setText("Ingrese DNI");
            PassengerNameTextField.setText("Ingrese nombre");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores correctos, por favor.");
            
            //Limpiar campos
            PassengerDNITextField.setText("Ingrese DNI");
            PassengerNameTextField.setText("Ingrese nombre");
        }

    }//GEN-LAST:event_AddPassengerButtonActionPerformed

    private void FlightListComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlightListComboBoxActionPerformed
        try {
            int vueloSeleccionado = Integer.parseInt((String) FlightListComboBox.getSelectedItem());
            int pos = objGE.busquedaS(vueloSeleccionado);
            String cad = objGE.getArreglo()[pos].obeneterInfoVueloSinPasajeros();
            FlightInfoTextPane.setText(cad);
            actualizarTabla();
        } catch (Exception e) {
            FlightInfoTextPane.setText("");
        }        
    }//GEN-LAST:event_FlightListComboBoxActionPerformed

    private void FlightSeatsNumberComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_FlightSeatsNumberComboBoxPopupMenuWillBecomeVisible
        // TODO add your handling code here:
        FlightNumberTextField.setText("Ingrese número");
    }//GEN-LAST:event_FlightSeatsNumberComboBoxPopupMenuWillBecomeVisible

    private void FlightListComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_FlightListComboBoxPopupMenuWillBecomeVisible
        PassengerNameTextField.setText("Ingrese nombre");
        PassengerDNITextField.setText("Ingrese DNI");
        PassengerDNIDeleteTextField.setText("Ingrese DNI");
    }//GEN-LAST:event_FlightListComboBoxPopupMenuWillBecomeVisible

    private void DeletePassengerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePassengerButtonActionPerformed
        try {
            long dni = Long.decode(PassengerDNIDeleteTextField.getText());
            int vueloSeleccionado = Integer.parseInt((String) FlightListComboBox.getSelectedItem());
            int pos = objGE.busquedaS(vueloSeleccionado);

            objGE.getArreglo()[pos].eliminarPasajeroDelVuelo(dni);
            
            actualizarTabla();

            System.out.println(objGE.getArreglo()[pos].obeneterInfoVuelo());

            String cad = objGE.getArreglo()[pos].obeneterInfoVueloSinPasajeros();
            FlightInfoTextPane.setText(cad);
            System.out.println("--------------");

            //Limpiar campos
            PassengerDNIDeleteTextField.setText("Ingrese DNI");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese valores correctos, por favor.");
            //Limpiar campos
            PassengerDNIDeleteTextField.setText("Ingrese DNI");
        }
    }//GEN-LAST:event_DeletePassengerButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int vueloSeleccionado = Integer.parseInt((String) FlightListComboBox.getSelectedItem());
            int pos = objGE.busquedaS(vueloSeleccionado);
            objGE.getArreglo()[pos].verMayorEdadEnVuelo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione vuelo, por favor.");
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String cad = "La gestión de vuelos es muy sencilla. Para agregar"
                + "\nun nuevo pasajero, complete primero seleccione un"
                + "\nvuelo. Luego, complete los campos de nombre y DNI."
                + "\nFinalece apretando 'Añadir pasajero'."
                + "\n\nPara eliminar un pasajero, complete el campo de"
                + "\nDNI a eliminar y luego aprite 'Eliminar pasajero'."
                + "\n\nLa tabla de pasajeros se actualiza automáticamente.";
        JOptionPane.showMessageDialog(null, cad);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void DeleteFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteFlightButtonActionPerformed
        // TODO add your handling code here:
        try {
            int numVuelo = Integer.parseInt((String) FlightListComboBox.getSelectedItem());
            objGE.eliminarConReferencia(numVuelo);
            
            int index = FlightListComboBox.getSelectedIndex();
            
            FlightListComboBox.setSelectedIndex(0);
            FlightListComboBox.removeItemAt(index);
            modelo.setRowCount(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione vuelo, por favor.");
        }
    }//GEN-LAST:event_DeleteFlightButtonActionPerformed

    private void FlightNumberTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FlightNumberTextFieldFocusGained
        if ("Ingrese número".equals(FlightNumberTextField.getText())) { 
            FlightNumberTextField.setText("");
        }
    }//GEN-LAST:event_FlightNumberTextFieldFocusGained

    private void FlightNumberTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FlightNumberTextFieldFocusLost
        if ("".equals(FlightNumberTextField.getText())) { 
            FlightNumberTextField.setText("Ingrese número");
        }
    }//GEN-LAST:event_FlightNumberTextFieldFocusLost

    private void PassengerNameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassengerNameTextFieldFocusGained
        if ("Ingrese nombre".equals(PassengerNameTextField.getText())) { 
            PassengerNameTextField.setText("");
        }
    }//GEN-LAST:event_PassengerNameTextFieldFocusGained

    private void PassengerNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassengerNameTextFieldFocusLost
        if ("".equals(PassengerNameTextField.getText())) { 
            PassengerNameTextField.setText("Ingrese nombre");
        }
    }//GEN-LAST:event_PassengerNameTextFieldFocusLost

    private void PassengerDNITextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassengerDNITextFieldFocusGained
        if ("Ingrese DNI".equals(PassengerDNITextField.getText())) { 
            PassengerDNITextField.setText("");
        }
    }//GEN-LAST:event_PassengerDNITextFieldFocusGained

    private void PassengerDNITextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassengerDNITextFieldFocusLost
        if ("".equals(PassengerDNITextField.getText())) { 
            PassengerDNITextField.setText("Ingrese DNI");
        }
    }//GEN-LAST:event_PassengerDNITextFieldFocusLost

    private void PassengerDNIDeleteTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassengerDNIDeleteTextFieldFocusGained
        if ("Ingrese DNI".equals(PassengerDNIDeleteTextField.getText())) { 
            PassengerDNIDeleteTextField.setText("");
        }
    }//GEN-LAST:event_PassengerDNIDeleteTextFieldFocusGained

    private void PassengerDNIDeleteTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PassengerDNIDeleteTextFieldFocusLost
        if ("".equals(PassengerDNIDeleteTextField.getText())) { 
            PassengerDNIDeleteTextField.setText("Ingrese DNI");
        }
    }//GEN-LAST:event_PassengerDNIDeleteTextFieldFocusLost
    
    private void actualizarTabla() {
        try {
            int vueloSeleccionado = Integer.parseInt((String) FlightListComboBox.getSelectedItem());
            modelo.setRowCount(0);
            int pos = objGE.busquedaS(vueloSeleccionado);
            String dato[] = new String[3];
            Nodo<Pasajero> ptr = objGE.getArreglo()[pos].getListaPasajeros().getL();
            while(ptr!=null) {
                dato[0] = ptr.getInfo().getNombre();
                dato[1] = String.valueOf(ptr.getInfo().getDni());
                dato[2] = String.valueOf(ptr.getInfo().getEdad());
                modelo.addRow(dato);
                ptr = ptr.getSiguiente();
            }            
        } catch (Exception e) {
        }
    }
    
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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JButton DeleteFlightButton;
    private javax.swing.JButton DeletePassengerButton;
    private javax.swing.JLabel FlightInfoLabel;
    private javax.swing.JTextPane FlightInfoTextPane;
    private javax.swing.JComboBox<String> FlightListComboBox;
    private javax.swing.JLabel FlightNameLabel;
    private javax.swing.JTextField FlightNumberTextField;
    private javax.swing.JLabel FlightSeatsLabel;
    private javax.swing.JComboBox<String> FlightSeatsNumberComboBox;
    private javax.swing.JTextField PassengerDNIDeleteTextField;
    private javax.swing.JLabel PassengerDNILabel;
    private javax.swing.JTextField PassengerDNITextField;
    private javax.swing.JLabel PassengerNameLabel;
    private javax.swing.JLabel PassengerNameLabel1;
    private javax.swing.JTextField PassengerNameTextField;
    private javax.swing.JTable PassengerTable;
    private javax.swing.JLabel SelectFlightLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
