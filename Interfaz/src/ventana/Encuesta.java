/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ventana;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sanva
 */
public class Encuesta extends javax.swing.JDialog {

    /**
     * Creates new form Encuesta
     * @param parent
     * @param modal
     */
    public Encuesta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo = new javax.swing.ButtonGroup();
        jprofe = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jedad = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        jlher = new javax.swing.JLabel();
        Spinner = new javax.swing.JSpinner();
        ck1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        List1 = new javax.swing.JList<>();
        jcual = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jaficion = new javax.swing.JLabel();
        jlcompras = new javax.swing.JLabel();
        jlvertele = new javax.swing.JLabel();
        jlcine = new javax.swing.JLabel();
        slcine = new javax.swing.JSlider();
        baceptar = new javax.swing.JButton();
        bcancelar = new javax.swing.JButton();
        jpsexo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        rdb2 = new javax.swing.JRadioButton();
        rdb1 = new javax.swing.JRadioButton();
        slcompras = new javax.swing.JSlider();
        slvertele = new javax.swing.JSlider();
        lsexo = new javax.swing.JLabel();
        ledad = new javax.swing.JLabel();
        ldeporte = new javax.swing.JLabel();
        lcine = new javax.swing.JLabel();
        llista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encuesta");

        jprofe.setText("Profesión");

        tf1.setToolTipText("profesión");

        jedad.setText("Edad");

        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entre 18 y 30 años", "Entre 30 y 60 años", "Más de 60 años" }));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        jlher.setText("Nº Hermanos");

        Spinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinnerStateChanged(evt);
            }
        });
        Spinner.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                SpinnerPropertyChange(evt);
            }
        });

        ck1.setText("¿Practica algún deporte?");
        ck1.setToolTipText("");
        ck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ck1ActionPerformed(evt);
            }
        });

        List1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Fútbol", "Tenis", "Tenis de mesa", "Baloncesto", "Padel", "Surf" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        List1.setEnabled(false);
        List1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                List1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List1);

        jcual.setText("¿Cúal?");

        jaficion.setText("Marque de 1 a 10 su grado de afición a:");

        jlcompras.setText("Compras:");

        jlvertele.setText("Ver la televisión:");

        jlcine.setText("Ir al cine:");

        slcine.setMajorTickSpacing(1);
        slcine.setMaximum(10);
        slcine.setMinorTickSpacing(1);
        slcine.setPaintLabels(true);
        slcine.setPaintTicks(true);
        slcine.setValue(5);
        slcine.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slcineStateChanged(evt);
            }
        });

        baceptar.setText("ACEPTAR");
        baceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baceptarActionPerformed(evt);
            }
        });

        bcancelar.setText("CANCELAR");
        bcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcancelarActionPerformed(evt);
            }
        });

        jpsexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Sexo");

        Grupo.add(rdb2);
        rdb2.setText("MUJER");
        rdb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb2ActionPerformed(evt);
            }
        });

        Grupo.add(rdb1);
        rdb1.setText("HOMBRE");
        rdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpsexoLayout = new javax.swing.GroupLayout(jpsexo);
        jpsexo.setLayout(jpsexoLayout);
        jpsexoLayout.setHorizontalGroup(
            jpsexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpsexoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(rdb1)
                .addGap(18, 18, 18)
                .addComponent(rdb2)
                .addGap(41, 41, 41))
        );
        jpsexoLayout.setVerticalGroup(
            jpsexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpsexoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpsexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpsexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdb1)
                        .addComponent(rdb2))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        slcompras.setMajorTickSpacing(1);
        slcompras.setMaximum(10);
        slcompras.setMinorTickSpacing(1);
        slcompras.setPaintLabels(true);
        slcompras.setPaintTicks(true);
        slcompras.setValue(5);

        slvertele.setMajorTickSpacing(1);
        slvertele.setMaximum(10);
        slvertele.setMinorTickSpacing(1);
        slvertele.setPaintLabels(true);
        slvertele.setPaintTicks(true);
        slvertele.setValue(5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jprofe)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jedad)
                                .addGap(18, 18, 18)
                                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlher)
                                        .addGap(18, 18, 18)
                                        .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(llista, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jpsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ck1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(124, 124, 124)
                                                .addComponent(jcual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 32, Short.MAX_VALUE)))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(ledad, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 105, Short.MAX_VALUE))
                            .addComponent(ldeporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jaficion)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlcompras)
                            .addComponent(jlvertele)
                            .addComponent(jlcine))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(slcompras, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slvertele, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(baceptar)
                                .addGap(53, 53, 53)
                                .addComponent(bcancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slcine, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lcine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jprofe)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jedad)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ledad, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlher)
                            .addComponent(Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(llista))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jpsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ck1)
                                    .addComponent(jcual)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ldeporte, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jaficion)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jlcompras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(slcompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(baceptar)
                            .addComponent(jlvertele)
                            .addComponent(bcancelar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jlcine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lcine, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(slvertele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(slcine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
       ledad.setText("Edad: " + cb1.getSelectedItem().toString());
    }//GEN-LAST:event_cb1ActionPerformed

    private void ck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ck1ActionPerformed
        if(ck1.isSelected()){
            List1.setEnabled(true);
        }else{
            List1.setEnabled(false);
        }
    }//GEN-LAST:event_ck1ActionPerformed

    private void baceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baceptarActionPerformed
        // Declarar un StringBuilder para construir el resumen
    StringBuilder resumenRespuestas = new StringBuilder();

    // Agregar la profesión
    String profesion = tf1.getText();
    resumenRespuestas.append("Profesión: ").append(profesion).append("\n");

    // Agregar la edad seleccionada
    String edad = cb1.getSelectedItem().toString();
    resumenRespuestas.append("Edad: ").append(edad).append("\n");

    // Agregar el número de hermanos
    int numHermanos = (int) Spinner.getValue();
    resumenRespuestas.append("Número de Hermanos: ").append(numHermanos).append("\n");

    // Agregar el género seleccionado
    String genero = rdb1.isSelected() ? "HOMBRE" : (rdb2.isSelected() ? "MUJER" : "");
    resumenRespuestas.append("Género: ").append(genero).append("\n");

    // Agregar los deportes seleccionados
    if (ck1.isSelected()) {
        List<String> deportesSeleccionados = List1.getSelectedValuesList();
        if (!deportesSeleccionados.isEmpty()) {
            resumenRespuestas.append("Deportes: ");
            for (String deporte : deportesSeleccionados) {
                resumenRespuestas.append(deporte).append("\n");
            }
        }
    }

    // Agregar el grado de afición a actividades
    int aficionCompras = slcine.getValue();
    int aficionTV = slcompras.getValue();
    int aficionCine = slvertele.getValue();

    resumenRespuestas.append("Grado de Afición:\n");
    resumenRespuestas.append("Compras: ").append(aficionCompras).append("/10\n");
    resumenRespuestas.append("Ver la televisión: ").append(aficionTV).append("/10\n");
    resumenRespuestas.append("Ir al cine: ").append(aficionCine).append("/10\n");

    // Mostrar el JOptionPane con el resumen de respuestas
    JOptionPane.showMessageDialog(this, resumenRespuestas.toString(), "Resumen de Respuestas", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_baceptarActionPerformed

    private void bcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bcancelarActionPerformed

    private void rdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ActionPerformed
        if(rdb1.isSelected()){
            lsexo.setText("Has seleccionado " + rdb1.getText());
        } else{
            lsexo.setText("");        
        }
    }//GEN-LAST:event_rdb1ActionPerformed

    private void rdb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb2ActionPerformed
        if(rdb2.isSelected()){
            lsexo.setText("Has seleccionado " + rdb2.getText());
        } else{
            lsexo.setText("");        
        }
    }//GEN-LAST:event_rdb2ActionPerformed

    private void List1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_List1ValueChanged
        if (!evt.getValueIsAdjusting()) {
        List<String> selectedItems = List1.getSelectedValuesList();

            // Comprobar si se ha seleccionado al menos un elemento
            if (!selectedItems.isEmpty()) {
                // Convertir la lista de elementos seleccionados a una cadena de texto
                StringBuilder selectedItemsText = new StringBuilder();
                for (String selectedItem : selectedItems) {
                    selectedItemsText.append(selectedItem);
                }

                // Actualizar el texto del JLabel
                ldeporte.setText("Selecciones: " + selectedItemsText.toString());
            }
        }
    }//GEN-LAST:event_List1ValueChanged

    private void slcineStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slcineStateChanged
        lcine.setText("El valor del slider es: " +slcine.getValue());
    }//GEN-LAST:event_slcineStateChanged

    private void SpinnerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_SpinnerPropertyChange
        
    }//GEN-LAST:event_SpinnerPropertyChange

    private void SpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinnerStateChanged
        llista.setText("El valor del spinner es: " + Spinner.getValue());
    }//GEN-LAST:event_SpinnerStateChanged

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
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Encuesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Encuesta dialog = new Encuesta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo;
    private javax.swing.JList<String> List1;
    private javax.swing.JSpinner Spinner;
    private javax.swing.JButton baceptar;
    private javax.swing.JButton bcancelar;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JCheckBox ck1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jaficion;
    private javax.swing.JLabel jcual;
    private javax.swing.JLabel jedad;
    private javax.swing.JLabel jlcine;
    private javax.swing.JLabel jlcompras;
    private javax.swing.JLabel jlher;
    private javax.swing.JLabel jlvertele;
    private javax.swing.JLabel jprofe;
    private javax.swing.JPanel jpsexo;
    private javax.swing.JLabel lcine;
    private javax.swing.JLabel ldeporte;
    private javax.swing.JLabel ledad;
    private javax.swing.JLabel llista;
    private javax.swing.JLabel lsexo;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    private javax.swing.JSlider slcine;
    private javax.swing.JSlider slcompras;
    private javax.swing.JSlider slvertele;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}