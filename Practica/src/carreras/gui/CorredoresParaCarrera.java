package carreras.gui;

import carreras.dto.Carrera;
import corredores.dto.Corredor;
import corredores.dto.Participante;
import corredores.logica.LogicaCorredor;
import corredores.tableModel.CorredoresTableModel;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import logicaParaFicheros.LogicaFicherosCSV;
import run.PaginaPrincipal;

/**
 *
 * @author USER
 */
public class CorredoresParaCarrera extends javax.swing.JDialog {

    CorredoresTableModel ctm;
    TableRowSorter<CorredoresTableModel> sorter;
    PaginaPrincipal paginaPrincipal;
    Carrera carrera;
    LogicaFicherosCSV lf = new LogicaFicherosCSV();

    /**
     * Creates new form CorredoresParaCarrera
     *
     * @param parent
     * @param modal
     * @param carrera
     */
    public CorredoresParaCarrera(java.awt.Frame parent, boolean modal, Carrera carrera) {
        super(parent, modal);
        paginaPrincipal = (PaginaPrincipal) parent;
        initComponents();
        this.setTitle("CORREDORES");
        cargarTableModelCorredoresParaCarrera();
        this.carrera = carrera;
        this.setTitle("CORREDORES PARA  " + carrera.getNomCarrera().toUpperCase());
    }

    public void cargarTableModelCorredoresParaCarrera() {
        ctm = new CorredoresTableModel(LogicaCorredor.getListaCorredores());
        jTableCorredorParaCarrera.setModel(ctm);
        sorter = new TableRowSorter<>(ctm);
        jTableCorredorParaCarrera.setRowSorter(sorter);
        List<RowSorter.SortKey> sortkeys = new ArrayList<RowSorter.SortKey>();
        sortkeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortkeys);
    }

    /**
     * Método para comprobar si el corredor ya está inscrito en la carrera.
     *
     * @param carrera
     * @param corredor
     * @return boolean
     */
    public boolean comprobarInscripcion(Carrera carrera, Corredor corredor) {
        boolean existe = false;
        for (Participante p : carrera.getListaParticipantes()) {
            if (p.getCorredor().getDni().equals(corredor.getDni())) {
                existe = true;
            }
        }
        return existe;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredorParaCarrera = new javax.swing.JTable();
        jComboBoxFiltrar = new javax.swing.JComboBox<>();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jButtonAgregarCorredor = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jTableCorredorParaCarrera.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCorredorParaCarrera);

        jComboBoxFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Nombre", "DNI" }));

        jTextFieldFiltrar.setText(org.openide.util.NbBundle.getMessage(CorredoresParaCarrera.class, "CorredoresParaCarrera.jTextFieldFiltrar.text")); // NOI18N

        jButtonAgregarCorredor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAgregarCorredor.setText(org.openide.util.NbBundle.getMessage(CorredoresParaCarrera.class, "CorredoresParaCarrera.jButtonAgregarCorredor.text")); // NOI18N
        jButtonAgregarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCorredorActionPerformed(evt);
            }
        });

        jButtonSalir.setText(org.openide.util.NbBundle.getMessage(CorredoresParaCarrera.class, "CorredoresParaCarrera.jButtonSalir.text")); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonFiltrar.setText(org.openide.util.NbBundle.getMessage(CorredoresParaCarrera.class, "CorredoresParaCarrera.jButtonFiltrar.text")); // NOI18N
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAgregarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxFiltrar, 0, 134, Short.MAX_VALUE)
                            .addComponent(jTextFieldFiltrar)
                            .addComponent(jButtonFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregarCorredor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFiltrar)
                .addContainerGap())
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

    private void jButtonAgregarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCorredorActionPerformed
        try {
            int seleccion = jTableCorredorParaCarrera.convertRowIndexToModel(jTableCorredorParaCarrera.getSelectedRow());
            Corredor corredor = LogicaCorredor.getListaCorredores().get(seleccion);
            if (carrera.getListaParticipantes().size() == carrera.getMaxParticipantes()) {
                JOptionPane.showMessageDialog(this, "La carrera está completa\nno se pueden agregar corredores");
            } else {
                //Participante participante = new Participante(corredor);
                // if (!carrera.getListaParticipantes().contains(participante)) {
                if (!comprobarInscripcion(carrera, corredor)) {
                    // LogicaCorredor.agregarCarreraACorredor(carrera, corredor);
                    Participante participante = new Participante(corredor);
                    int dor = carrera.getListaDorsales().get(0);
                    carrera.getListaDorsales().remove(0);
                    participante.setDorsal(String.valueOf(dor));
                    carrera.getListaParticipantes().add(participante);
                    JOptionPane.showMessageDialog(this, "Asignado dorsal: " + dor);
                    String ruta = "ficheros" + File.separator + "participantes" + File.separator + carrera.getNomCarrera() + ".csv";
                    lf.abrirFicheroCSVEscrituraParticipantes(ruta, carrera.getListaParticipantes());
                    corredor.getInscripciones().add(carrera);
                } else {
                    JOptionPane.showMessageDialog(this, "El corredor ya está inscrito", "", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado corredor");
        }
        jTableCorredorParaCarrera.clearSelection();
    }//GEN-LAST:event_jButtonAgregarCorredorActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        if (jComboBoxFiltrar.getSelectedItem().equals("Nombre")) {
            RowFilter<CorredoresTableModel, Integer> rf = RowFilter.regexFilter(jTextFieldFiltrar.getText(), 0);
            sorter.setRowFilter(rf);
        }
        if (jComboBoxFiltrar.getSelectedItem().equals("DNI")) {
            RowFilter<CorredoresTableModel, Integer> rf1 = RowFilter.regexFilter(jTextFieldFiltrar.getText(), 1);
            sorter.setRowFilter(rf1);
        }
        jTextFieldFiltrar.setText("");
    }//GEN-LAST:event_jButtonFiltrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarCorredor;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxFiltrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredorParaCarrera;
    private javax.swing.JTextField jTextFieldFiltrar;
    // End of variables declaration//GEN-END:variables
}
