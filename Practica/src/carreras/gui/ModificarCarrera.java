/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreras.gui;

import carreras.dto.Carrera;
import carreras.logica.LogicaCarreras;
import javax.swing.JOptionPane;


/**
 *
 * @author USER
 */
public class ModificarCarrera extends javax.swing.JDialog {

    Carrera c;
     

    /**
     * Creates new form ModificarCarrera
     * @param parent
     * @param modal
     * @param carrera
     */
    public ModificarCarrera(java.awt.Frame parent, boolean modal, Carrera carrera) {
        super(parent, modal);
        initComponents();
        this.c = carrera;
        rellenarCasillas();
    }

    /**
     * Método que nos permite cargar los datos de una carrera en las vistas para
     * su posterior modificación.
     */
    public void rellenarCasillas() {
        jTextFieldNombre.setText(c.getNomCarrera());
        jTextFieldFecha.setText(c.getFechaCarrera());
        jTextFieldLugar.setText(c.getLugar());
        jTextFieldMaxParticipantes.setText(String.valueOf(c.getMaxParticipantes()));
    }

    /**
     * Método que crea una carrera con los datos ya modificados.
     *
     * @return carrera(object).
     */
    public Carrera nuevosDatos() {
        String nombre = jTextFieldNombre.getText();
        String fecha = jTextFieldFecha.getText();
        String lugar = jTextFieldLugar.getText();
        int max = Integer.valueOf(jTextFieldMaxParticipantes.getText());
        Carrera datosNuevos = new Carrera(nombre, fecha, lugar, max);
        return datosNuevos;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldLugar = new javax.swing.JTextField();
        jTextFieldMaxParticipantes = new javax.swing.JTextField();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(ModificarCarrera.class, "ModificarCarrera.jLabel1.text")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText(org.openide.util.NbBundle.getMessage(ModificarCarrera.class, "ModificarCarrera.jLabel2.text")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText(org.openide.util.NbBundle.getMessage(ModificarCarrera.class, "ModificarCarrera.jLabel3.text")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(org.openide.util.NbBundle.getMessage(ModificarCarrera.class, "ModificarCarrera.jLabel4.text")); // NOI18N

        jTextFieldNombre.setText(org.openide.util.NbBundle.getMessage(ModificarCarrera.class, "ModificarCarrera.jTextFieldNombre.text")); // NOI18N

        jTextFieldFecha.setText(org.openide.util.NbBundle.getMessage(ModificarCarrera.class, "ModificarCarrera.jTextFieldFecha.text")); // NOI18N

        jTextFieldLugar.setText(org.openide.util.NbBundle.getMessage(ModificarCarrera.class, "ModificarCarrera.jTextFieldLugar.text")); // NOI18N

        jTextFieldMaxParticipantes.setText(org.openide.util.NbBundle.getMessage(ModificarCarrera.class, "ModificarCarrera.jTextFieldMaxParticipantes.text")); // NOI18N

        jButtonModificar.setText(org.openide.util.NbBundle.getMessage(ModificarCarrera.class, "ModificarCarrera.jButtonModificar.text")); // NOI18N
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonModificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFecha)
                            .addComponent(jTextFieldLugar)
                            .addComponent(jTextFieldMaxParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMaxParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        int confirmar = JOptionPane.showConfirmDialog(this, "CONFIRMAR MODIFICACIÓN", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION) {
            int pos = LogicaCarreras.getListaCarreras().indexOf(c);
            LogicaCarreras.getListaCarreras().set(pos, nuevosDatos());
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Cambios cancelados");
            dispose();
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldMaxParticipantes;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

}