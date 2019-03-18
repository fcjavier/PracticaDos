package run;

import carreras.gui.CarrerasFinalizadas;
import carreras.gui.GestionCarreras;
import carreras.logica.LogicaCarreras;
import corredores.gui.GestionCorredores;
import corredores.logica.LogicaCorredor;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.help.HelpSetException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import logicaParaFicheros.LogicaFicherosCSV;
import logicaParaFicheros.LogicaFicherosObjetos;
import org.openide.util.Exceptions;
import timersavedata.SaveListener;

/**
 *
 * @author USER
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    LogicaCorredor lc = new LogicaCorredor();
    LogicaFicherosCSV lf = new LogicaFicherosCSV();
    LogicaFicherosObjetos lfo = new LogicaFicherosObjetos();
    LogicaCarreras logCarrera = new LogicaCarreras();
    final String CORREDORES = "ficheros" + File.separator + "corredores.dat";
    final String CARRERAS = "ficheros" + File.separator + "carreras.dat";
    final String FINALIZADAS = "ficheros" + File.separator + "finalizadas.dat";

    /**
     * Creates new form PaginaPrincipal
     */
    public PaginaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarFicheros();
        ponerAyuda();
        cambiarLookAndFeel();
        cerrar();
        timerData1.addSaveListener(new SaveListener() {
            @Override
            public void guardarDatos() {
                guardarDatos();
            }
        });
    }

    public void cambiarLookAndFeel() {
        DefaultComboBoxModel dbm = new DefaultComboBoxModel();
        for (LookAndFeelInfo lfi : UIManager.getInstalledLookAndFeels()) {
            dbm.addElement(lfi.getName());
        }
        jComboBoxLookAndFeel.setModel(dbm);
        jComboBoxLookAndFeel.setVisible(false);
    }

    public void cargarFicheros() {
        File fCorredores = new File(CORREDORES);
        File fCarreras = new File(CARRERAS);
        File fFinalizadas = new File(FINALIZADAS);
        if (fCorredores.exists()) {
            lc.cargarListaCorredor(lfo.abrirFicheroLecturaCorredores(CORREDORES));
        }
        if (fCarreras.exists()) {
            logCarrera.cargarListaCarreras(lfo.abrirFicheroLecturaObjetos(CARRERAS));
        }
        if (fFinalizadas.exists()) {
            LogicaCarreras.cargarFinalizadas(lfo.abrirFicheroLecturaObjetos(FINALIZADAS));
        }
    }

    public void guardarDatos() {
        lf.abrirFicheroCSVEscrituraCorredor("ficheros" + File.separator + "corredor.csv", LogicaCorredor.getListaCorredores());
        lf.abrirFicheroCSVEscrituraCarrera("ficheros" + File.separator + "carreras.csv", LogicaCarreras.getListaCarreras());
        lfo.abrirFicheroObjetosEscrituraCarreras(CARRERAS, LogicaCarreras.getListaCarreras());
        lfo.abrirFicheroObjetosEscrituraCorredores(CORREDORES, LogicaCorredor.getListaCorredores());
        lfo.abrirFicheroObjetosEscrituraCarreras(FINALIZADAS, LogicaCarreras.getListaCarrerasFinalizadas());
    }

    public void cerrar() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent event) {
                    confirmarSalida();
                }
            });
            this.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmarSalida() {
        int opcion = JOptionPane.showConfirmDialog(this, "GUARDAR DATOS ANTES DE SALIR", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
            guardarDatos();
            JOptionPane.showMessageDialog(this, "SE HAN GUARDADO");
            System.exit(0);
        } else {
            System.exit(0);
        }
    }

    private void ponerAyuda() {
        try {
            File fichero = new File("JavaHelpCarreraDos" + File.separator + "src" + File.separator + "Help" + File.separator + "help_set.hs");
            URL hsURL = fichero.toURI().toURL();
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();
            hb.enableHelpOnButton(jMenuItemAyuda, "aplicacion", helpset);
            hb.enableHelpKey(getRootPane(), "aplicacion", helpset);
            hb.enableHelpKey(jButtonGestionarCorredores, "ventana_corredores", helpset);
            hb.enableHelpKey(jButtonGestionarCarreras, "ventana_carreras", helpset);
            hb.enableHelpKey(jButtonFinalizadas, "ver_informe", helpset);
        } catch (MalformedURLException ex) {
            Exceptions.printStackTrace(ex);
        } catch (HelpSetException ex) {
            Exceptions.printStackTrace(ex);
        }
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
        jLabelGestionCorredores = new javax.swing.JLabel();
        jLabel2GestionCarreras = new javax.swing.JLabel();
        jComboBoxLookAndFeel = new javax.swing.JComboBox<>();
        jButtonGestionarCorredores = new javax.swing.JButton();
        jButtonGestionarCarreras = new javax.swing.JButton();
        timerData1 = new timersavedata.TimerData();
        jLabel1 = new javax.swing.JLabel();
        jButtonFinalizadas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemModificarLookAndFeel = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(594, 390));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabelGestionCorredores.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabelGestionCorredores.setText("Gestionar Corredores");

        jLabel2GestionCarreras.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2GestionCarreras.setText("Gestionar Carreras");

        jComboBoxLookAndFeel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxLookAndFeel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxLookAndFeelItemStateChanged(evt);
            }
        });
        jComboBoxLookAndFeel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLookAndFeelActionPerformed(evt);
            }
        });

        jButtonGestionarCorredores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGestionarCorredores.setText("SELECCIONAR");
        jButtonGestionarCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarCorredoresActionPerformed(evt);
            }
        });

        jButtonGestionarCarreras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGestionarCarreras.setText("SELECCIONAR");
        jButtonGestionarCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionarCarrerasActionPerformed(evt);
            }
        });

        timerData1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timerData1.setFormato24h(true);
        timerData1.setSalvar(new timersavedata.Save(0,false));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Informe Carrera Finalizada");

        jButtonFinalizadas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonFinalizadas.setText("SELECCIONAR");
        jButtonFinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxLookAndFeel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timerData1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(61, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonGestionarCarreras)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2GestionCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelGestionCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jButtonGestionarCorredores))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonFinalizadas)))))
                        .addGap(0, 84, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonFinalizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(timerData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxLookAndFeel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGestionCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGestionarCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2GestionCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGestionarCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        timerData1.getAccessibleContext().setAccessibleName("reloj");

        jMenuAyuda.setText("Ayuda    ");
        jMenuAyuda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenuItemAyuda.setText("Sistema de ayuda...  ");
        jMenuAyuda.add(jMenuItemAyuda);

        jMenuBar1.add(jMenuAyuda);

        jMenu2.setText("LookAndFeel");

        jMenuItemModificarLookAndFeel.setText("   Modificar");
        jMenuItemModificarLookAndFeel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarLookAndFeelActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemModificarLookAndFeel);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxLookAndFeelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLookAndFeelActionPerformed
        LookAndFeelInfo lookAndFeel = UIManager.getInstalledLookAndFeels()[jComboBoxLookAndFeel.getSelectedIndex()];
        try {
            UIManager.setLookAndFeel(lookAndFeel.getClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Throwable ex) {

        }
    }//GEN-LAST:event_jComboBoxLookAndFeelActionPerformed

    private void jButtonGestionarCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarCorredoresActionPerformed
        GestionCorredores gestionCorredores = new GestionCorredores(this, true);
        gestionCorredores.setVisible(true);
    }//GEN-LAST:event_jButtonGestionarCorredoresActionPerformed

    private void jButtonGestionarCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionarCarrerasActionPerformed
        GestionCarreras gestionCarreras = new GestionCarreras(this, true);
        gestionCarreras.setVisible(true);
    }//GEN-LAST:event_jButtonGestionarCarrerasActionPerformed

    private void jButtonFinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizadasActionPerformed
        CarrerasFinalizadas carrerasFinalizadas = new CarrerasFinalizadas(this, true);
        carrerasFinalizadas.setVisible(true);
    }//GEN-LAST:event_jButtonFinalizadasActionPerformed

    private void jMenuItemModificarLookAndFeelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarLookAndFeelActionPerformed
        jComboBoxLookAndFeel.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarLookAndFeelActionPerformed

    private void jComboBoxLookAndFeelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxLookAndFeelItemStateChanged
        jComboBoxLookAndFeel.setVisible(false);
    }//GEN-LAST:event_jComboBoxLookAndFeelItemStateChanged

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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFinalizadas;
    private javax.swing.JButton jButtonGestionarCarreras;
    private javax.swing.JButton jButtonGestionarCorredores;
    private javax.swing.JComboBox<String> jComboBoxLookAndFeel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2GestionCarreras;
    private javax.swing.JLabel jLabelGestionCorredores;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JMenuItem jMenuItemModificarLookAndFeel;
    private javax.swing.JPanel jPanel1;
    private timersavedata.TimerData timerData1;
    // End of variables declaration//GEN-END:variables
}
