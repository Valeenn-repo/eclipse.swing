/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Salon_Princesa;

import javax.swing.JOptionPane;

/**
 *
 * @author sanva
 */
public class Salon extends javax.swing.JFrame {

    /**
     * Creates new form Salon
     */
    public Salon() {
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

        jPanelSalonPrincesa = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jSpinnerFecha = new javax.swing.JSpinner();
        jLabelFecha = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelAsistentes = new javax.swing.JLabel();
        jSpinnerAsistentes = new javax.swing.JSpinner();
        jLabelCocina = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListCocina = new javax.swing.JList<>();
        jLabelDiasCong = new javax.swing.JLabel();
        jSpinnerDiasCong = new javax.swing.JSpinner();
        jCheckBoxHabi = new javax.swing.JCheckBox();
        jButtonCerrar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salón Princesa");

        jPanelSalonPrincesa.setBackground(new java.awt.Color(204, 204, 255));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(51, 51, 51));
        jLabelNombre.setText("Nombre:");

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTelefono.setText("Teléfono:");

        jTextFieldNombre.setToolTipText("Nombre del usuario");

        jTextFieldTelefono.setToolTipText("Teléfono del usuario");

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFecha.setToolTipText("Fecha del evento");

        jLabelFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(51, 51, 51));
        jLabelFecha.setText("Fecha del evento:");

        jLabelTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(51, 51, 51));
        jLabelTipo.setText("Tipo:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banquete", "Jornada", "Congreso" }));
        jComboBoxTipo.setToolTipText("Tipo de celebración");
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });

        jLabelAsistentes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAsistentes.setForeground(new java.awt.Color(51, 51, 51));
        jLabelAsistentes.setText("Número de asistentes:");

        jSpinnerAsistentes.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerAsistentes.setToolTipText("Número de asistentes");

        jLabelCocina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCocina.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCocina.setText("Tipo de cocina:");

        jListCocina.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bufé", "Carta", "Cita Chef", "No precisa" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListCocina.setToolTipText("Tipo de cocina");
        jScrollPane1.setViewportView(jListCocina);

        jLabelDiasCong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDiasCong.setForeground(new java.awt.Color(51, 51, 51));
        jLabelDiasCong.setText("nº dias:");
        jLabelDiasCong.setEnabled(false);

        jSpinnerDiasCong.setToolTipText("Dias de reserva");
        jSpinnerDiasCong.setEnabled(false);

        jCheckBoxHabi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBoxHabi.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBoxHabi.setText("¿Requiere habitaciones?");
        jCheckBoxHabi.setToolTipText("Requiere habitaciones");
        jCheckBoxHabi.setEnabled(false);

        jButtonCerrar.setBackground(new java.awt.Color(255, 204, 204));
        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrar.png"))); // NOI18N
        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jButtonAceptar.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas.png"))); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jLabelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        jLabelTitulo.setText("Reserva Salón Princesa");

        javax.swing.GroupLayout jPanelSalonPrincesaLayout = new javax.swing.GroupLayout(jPanelSalonPrincesa);
        jPanelSalonPrincesa.setLayout(jPanelSalonPrincesaLayout);
        jPanelSalonPrincesaLayout.setHorizontalGroup(
            jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalonPrincesaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSalonPrincesaLayout.createSequentialGroup()
                        .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelSalonPrincesaLayout.createSequentialGroup()
                                .addComponent(jLabelTipo)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addComponent(jCheckBoxHabi, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(jLabelDiasCong)
                                .addGap(18, 18, 18))
                            .addGroup(jPanelSalonPrincesaLayout.createSequentialGroup()
                                .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelSalonPrincesaLayout.createSequentialGroup()
                                        .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTelefono)
                                            .addComponent(jLabelNombre))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanelSalonPrincesaLayout.createSequentialGroup()
                                            .addComponent(jLabelAsistentes)
                                            .addGap(18, 18, 18)
                                            .addComponent(jSpinnerAsistentes))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSalonPrincesaLayout.createSequentialGroup()
                                            .addComponent(jLabelCocina)
                                            .addGap(18, 18, 18)
                                            .addComponent(jScrollPane1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSalonPrincesaLayout.createSequentialGroup()
                                            .addComponent(jLabelFecha)
                                            .addGap(18, 18, 18)
                                            .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSpinnerDiasCong, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSalonPrincesaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSalonPrincesaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(184, 184, 184))
        );
        jPanelSalonPrincesaLayout.setVerticalGroup(
            jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalonPrincesaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelTitulo)
                .addGap(44, 44, 44)
                .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTelefono)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTipo)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerDiasCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxHabi)
                    .addComponent(jLabelDiasCong))
                .addGap(26, 26, 26)
                .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAsistentes)
                    .addComponent(jSpinnerAsistentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSalonPrincesaLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabelCocina))
                    .addGroup(jPanelSalonPrincesaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanelSalonPrincesaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelSalonPrincesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelSalonPrincesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Evento que controla la visibilidad de parámetros si el item "Congreso" está selecionado
    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        if(jComboBoxTipo.getSelectedItem().equals("Congreso")){
            jCheckBoxHabi.setEnabled(true);
            jLabelDiasCong.setEnabled(true);
            jSpinnerDiasCong.setEnabled(true);
        }else{
            jCheckBoxHabi.setEnabled(false);
            jLabelDiasCong.setEnabled(false);
            jSpinnerDiasCong.setEnabled(false);
        }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed
    
    //Evento que al clickar el botón cerrar cierra el formulario
    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    //Evento que al clickar el botón aceptar abre un mensaje
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        JOptionPane.showMessageDialog(this, "Reserva realizada", "Registro", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JCheckBox jCheckBoxHabi;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelAsistentes;
    private javax.swing.JLabel jLabelCocina;
    private javax.swing.JLabel jLabelDiasCong;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JList<String> jListCocina;
    private javax.swing.JPanel jPanelSalonPrincesa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerAsistentes;
    private javax.swing.JSpinner jSpinnerDiasCong;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
