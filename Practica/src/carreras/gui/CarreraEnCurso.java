package carreras.gui;

import carreras.dto.Carrera;
import carreras.logica.LogicaCarreras;
import carreras.tableModel.ParticipantesTableModel;
import corredores.dto.Participante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class CarreraEnCurso extends javax.swing.JDialog {

    Carrera carrera;
    Carrera carreraAux;
    ParticipantesTableModel ptm;
    TableRowSorter<ParticipantesTableModel> sorter;
    int cont;

    /**
     * Creates new form CarreraEnCurso
     *
     * @param parent
     * @param modal
     * @param carrera
     */
    public CarreraEnCurso(java.awt.Frame parent, boolean modal, Carrera carrera) {
        super(parent, modal);
        initComponents();
        this.carrera = carrera;
        cargarTable();
        anularOpciones();
    }

    public void cargarTable() {
        ptm = new ParticipantesTableModel(carrera.getListaParticipantes());
        jTableCarreraIniciada.setModel(ptm);
        sorter = new TableRowSorter<>(ptm);
        jTableCarreraIniciada.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }

    public void anularOpciones() {
        jButtonDetener.setEnabled(false);
        jButtonReiniciar.setEnabled(false);
        jButtonFinal.setEnabled(false);
        
    }
    private boolean finDeCarrera(int n){
        boolean fin = false;
        if(n==carrera.getMaxParticipantes()){
            fin = true;
            jButtonDetener.setEnabled(true);
            jButtonReiniciar.setEnabled(true);
            jButtonFinal.setEnabled(true);
        }
        return fin;
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
        timerData1 = new timersavedata.TimerData();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarreraIniciada = new javax.swing.JTable();
        cronometro = new jcronometro.Cronometro();
        jLabelTiempoCorredor = new javax.swing.JLabel();
        jButtonIniciar = new javax.swing.JButton();
        jButtonDetener = new javax.swing.JButton();
        jButtonReiniciar = new javax.swing.JButton();
        jButtonFinal = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        timerData1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        timerData1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTableCarreraIniciada.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCarreraIniciada);

        cronometro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cronometro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cronometro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cronometroMouseClicked(evt);
            }
        });

        jLabelTiempoCorredor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTiempoCorredor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTiempoCorredor.setText(org.openide.util.NbBundle.getMessage(CarreraEnCurso.class, "CarreraEnCurso.jLabelTiempoCorredor.text")); // NOI18N
        jLabelTiempoCorredor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabelTiempoCorredor.setMinimumSize(new java.awt.Dimension(79, 27));
        jLabelTiempoCorredor.setOpaque(true);

        jButtonIniciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonIniciar.setText(org.openide.util.NbBundle.getMessage(CarreraEnCurso.class, "CarreraEnCurso.jButtonIniciar.text")); // NOI18N
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jButtonDetener.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonDetener.setText(org.openide.util.NbBundle.getMessage(CarreraEnCurso.class, "CarreraEnCurso.jButtonDetener.text")); // NOI18N
        jButtonDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetenerActionPerformed(evt);
            }
        });

        jButtonReiniciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonReiniciar.setText(org.openide.util.NbBundle.getMessage(CarreraEnCurso.class, "CarreraEnCurso.jButtonReiniciar.text")); // NOI18N
        jButtonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReiniciarActionPerformed(evt);
            }
        });

        jButtonFinal.setText(org.openide.util.NbBundle.getMessage(CarreraEnCurso.class, "CarreraEnCurso.jButtonFinal.text")); // NOI18N
        jButtonFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalir.setText(org.openide.util.NbBundle.getMessage(CarreraEnCurso.class, "CarreraEnCurso.jButtonSalir.text")); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timerData1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelTiempoCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDetener, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(timerData1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonIniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDetener)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonReiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTiempoCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButtonFinal)
                .addGap(30, 30, 30)
                .addComponent(jButtonSalir)
                .addGap(30, 30, 30))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cronometroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cronometroMouseClicked
        try {
            if(!finDeCarrera(cont)){
            boolean correcto = false;
            String tiempo = cronometro.getText();
            jLabelTiempoCorredor.setText(tiempo);
            while (!correcto) {
                String llegada = JOptionPane.showInputDialog(this, "DORSAL PARTICIPANTE", "ASIGNAR DORSAL", JOptionPane.QUESTION_MESSAGE);
                int n = Integer.valueOf(llegada);
                if ((n > 99) && (n < (carrera.getMaxParticipantes() + 100))) {
                    for (Participante p : carrera.getListaParticipantes()) {
                        if (llegada.equalsIgnoreCase(p.getDorsal()) && p.getTiempo().equals("")) {
                            p.setTiempo(tiempo);
                            ptm.fireTableDataChanged();
                            correcto = true;
                            cont++;
                        } else {
                            if (llegada.equals(p.getDorsal()) && !p.getTiempo().equals("")) {
                                JOptionPane.showMessageDialog(this, "El corredor con ese dorsal\nya tiene tiempo.");
                                correcto = false;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "DORSAL INCORRECTO");
                }
            }
            finDeCarrera(cont);
            }else{
                JOptionPane.showMessageDialog(this, "TODOS LOS CORREDORES\nHAN LLEGADO A META");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El dorsal no existe");
        }
        
        
    }//GEN-LAST:event_cronometroMouseClicked

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        carreraAux = carrera;
        cronometro.setEstado(true);
        carrera.setEstado(true);
        //LogicaCarreras.getListaCarrerasFinalizadas().add(carrera);

    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jButtonDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetenerActionPerformed
        cronometro.setEstado(false);
    }//GEN-LAST:event_jButtonDetenerActionPerformed

    private void jButtonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReiniciarActionPerformed
        cronometro.setHor(0);
        cronometro.setMin(0);
        cronometro.setSeg(0);
    }//GEN-LAST:event_jButtonReiniciarActionPerformed

    private void jButtonFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalActionPerformed

        boolean agregada = LogicaCarreras.getListaCarrerasFinalizadas().add(carrera);
        if (agregada) {
            boolean cambiar = LogicaCarreras.getListaCarreras().remove(carreraAux);
            if (cambiar) {
                JOptionPane.showMessageDialog(this, "Carrera guardada como finalizada.", "", JOptionPane.PLAIN_MESSAGE);
            }
        }
        jButtonFinal.setEnabled(false);
    }//GEN-LAST:event_jButtonFinalActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
         dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private jcronometro.Cronometro cronometro;
    private javax.swing.JButton jButtonDetener;
    private javax.swing.JButton jButtonFinal;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonReiniciar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelTiempoCorredor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarreraIniciada;
    private timersavedata.TimerData timerData1;
    // End of variables declaration//GEN-END:variables
}
