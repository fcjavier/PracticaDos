/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreras.gui;

import carreras.dto.Carrera;
import carreras.logica.LogicaCarreras;
import carreras.tableModel.CarrerasTableModel;
import corredores.gui.DatosCorredor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import logicaParaFicheros.LogicaFicherosCSV;
import run.PaginaPrincipal;

/**
 *
 * @author USER
 */
public class GestionCarreras extends javax.swing.JDialog {

    CarrerasTableModel ctm;
    CarrerasTableModel ctm1;
    TableRowSorter<CarrerasTableModel> sorter;
    TableRowSorter<CarrerasTableModel> sorter2;
    PaginaPrincipal paginaPrincipal;
    LogicaFicherosCSV lf = new LogicaFicherosCSV();
    // LogicaFicherosObjetos lfo = new LogicaFicherosObjetos();

    /**
     * Creates new form ListaCarreras
     *
     * @param parent
     * @param modal
     */
    public GestionCarreras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        paginaPrincipal = (PaginaPrincipal) parent;
        initComponents();
        this.setTitle(" GESTIÓN DE CARRERAS");
        cargarTableCarreras();
        cargarTableFinalizadas();
        // cargarTableModelCarrerasFinalizadas();
    }

    public void cargarTableCarreras() {
        ctm = new CarrerasTableModel(LogicaCarreras.getListaCarreras());
        jTableCarreras.setModel(ctm);
        sorter = new TableRowSorter<>(ctm);
        jTableCarreras.setRowSorter(sorter);
        List<SortKey> sortKeys = new ArrayList<SortKey>();
        sortKeys.add(new SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
    }

    public void cargarTableFinalizadas() {
        ctm1 = new CarrerasTableModel(LogicaCarreras.getListaCarrerasFinalizadas());
        jTableFinalizadas.setModel(ctm1);
        sorter2 = new TableRowSorter<>(ctm1);
        jTableFinalizadas.setRowSorter(sorter2);
        List<SortKey> sortKeys = new ArrayList<SortKey>();
        sortKeys.add(new SortKey(0, SortOrder.ASCENDING));
        sorter2.setSortKeys(sortKeys);
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
        jTableCarreras = new javax.swing.JTable();
        jComboBoxFiltrar = new javax.swing.JComboBox<>();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableFinalizadas = new javax.swing.JTable();
        jComboBoxTablas = new javax.swing.JComboBox<>();
        jButtonNuevaCarrera = new javax.swing.JButton();
        jButtonBajaCarrera = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonAgregarCorredor = new javax.swing.JButton();
        jButtonAnularCorredor = new javax.swing.JButton();
        jButtonVerParticipantes = new javax.swing.JButton();
        jButtonIniciarCarrera = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jTableCarreras.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCarreras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableCarrerasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTableCarrerasFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCarreras);

        jComboBoxFiltrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Nombre carrera", "Lugar" }));
        jComboBoxFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFiltrarActionPerformed(evt);
            }
        });

        jTextFieldFiltrar.setText(org.openide.util.NbBundle.getMessage(GestionCarreras.class, "GestionCarreras.jTextFieldFiltrar.text")); // NOI18N

        jTableFinalizadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableFinalizadas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTableFinalizadasFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(jTableFinalizadas);

        jComboBoxTablas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar Tabla...", "Sin iniciar", "Finalizadas" }));

        jButtonNuevaCarrera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNuevaCarrera.setText(org.openide.util.NbBundle.getMessage(GestionCarreras.class, "GestionCarreras.jButtonNuevaCarrera.text")); // NOI18N
        jButtonNuevaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaCarreraActionPerformed(evt);
            }
        });

        jButtonBajaCarrera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBajaCarrera.setText(org.openide.util.NbBundle.getMessage(GestionCarreras.class, "GestionCarreras.jButtonBajaCarrera.text")); // NOI18N
        jButtonBajaCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaCarreraActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonModificar.setText(org.openide.util.NbBundle.getMessage(GestionCarreras.class, "GestionCarreras.jButtonModificar.text")); // NOI18N
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonAgregarCorredor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAgregarCorredor.setText(org.openide.util.NbBundle.getMessage(GestionCarreras.class, "GestionCarreras.jButtonAgregarCorredor.text")); // NOI18N
        jButtonAgregarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCorredorActionPerformed(evt);
            }
        });

        jButtonAnularCorredor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAnularCorredor.setText(org.openide.util.NbBundle.getMessage(GestionCarreras.class, "GestionCarreras.jButtonAnularCorredor.text")); // NOI18N
        jButtonAnularCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnularCorredorActionPerformed(evt);
            }
        });

        jButtonVerParticipantes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonVerParticipantes.setText(org.openide.util.NbBundle.getMessage(GestionCarreras.class, "GestionCarreras.jButtonVerParticipantes.text")); // NOI18N
        jButtonVerParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerParticipantesActionPerformed(evt);
            }
        });

        jButtonIniciarCarrera.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonIniciarCarrera.setText(org.openide.util.NbBundle.getMessage(GestionCarreras.class, "GestionCarreras.jButtonIniciarCarrera.text")); // NOI18N
        jButtonIniciarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarCarreraActionPerformed(evt);
            }
        });

        jButtonFiltrar.setText(org.openide.util.NbBundle.getMessage(GestionCarreras.class, "GestionCarreras.jButtonFiltrar.text")); // NOI18N
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonIniciarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonNuevaCarrera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(jButtonBajaCarrera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAnularCorredor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAgregarCorredor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVerParticipantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)
                        .addComponent(jComboBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxFiltrar, 0, 129, Short.MAX_VALUE)
                            .addComponent(jTextFieldFiltrar)
                            .addComponent(jButtonFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNuevaCarrera)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAgregarCorredor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonBajaCarrera))
                    .addComponent(jButtonAnularCorredor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonModificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonFiltrar)
                            .addComponent(jButtonVerParticipantes))))
                .addGap(18, 18, 18)
                .addComponent(jButtonIniciarCarrera)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFiltrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFiltrarActionPerformed

    private void jTableCarrerasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableCarrerasFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCarrerasFocusLost

    private void jTableCarrerasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableCarrerasFocusGained
        jTableFinalizadas.clearSelection();
        jButtonAgregarCorredor.setEnabled(true);
        jButtonAnularCorredor.setEnabled(true);
        jButtonBajaCarrera.setEnabled(true);
        jButtonIniciarCarrera.setEnabled(true);
        jButtonModificar.setEnabled(true);
        jButtonNuevaCarrera.setEnabled(true);
    }//GEN-LAST:event_jTableCarrerasFocusGained

    private void jTableFinalizadasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableFinalizadasFocusGained
        jTableCarreras.clearSelection();
        jButtonAgregarCorredor.setEnabled(false);
        jButtonAnularCorredor.setEnabled(false);
        jButtonBajaCarrera.setEnabled(false);
        jButtonIniciarCarrera.setEnabled(false);
        jButtonModificar.setEnabled(false);
        jButtonNuevaCarrera.setEnabled(false);
    }//GEN-LAST:event_jTableFinalizadasFocusGained

    private void jButtonNuevaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaCarreraActionPerformed
        DatosCarrera datosCarrera = new DatosCarrera(paginaPrincipal, true);
        datosCarrera.setVisible(true);
        ctm.fireTableDataChanged();
    }//GEN-LAST:event_jButtonNuevaCarreraActionPerformed

    private void jButtonBajaCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaCarreraActionPerformed
        try {
            int seleccion = jTableCarreras.convertRowIndexToModel(jTableCarreras.getSelectedRow());
            if (!LogicaCarreras.getListaCarreras().get(seleccion).isIniciada()) {
                int opcion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la carrera?", "BORRADO", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    LogicaCarreras.getListaCarreras().remove(seleccion);
                    lf.abrirFicheroCSVEscrituraCarrera("ficheros/carreras.csv", LogicaCarreras.getListaCarreras());
                    //lfo.abrirFicheroObjetosEscrituraCarreras("ficheros/carreras.dat", LogicaCarreras.getListaCarreras());
                    JOptionPane.showMessageDialog(this, "Carrera eliminada", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                    ctm.fireTableDataChanged();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar", "ERROR", JOptionPane.ERROR);
                }
            } else {
                JOptionPane.showMessageDialog(this, "CARRERA INICIADA O FINALIZADA", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado carrera", "", JOptionPane.INFORMATION_MESSAGE);
        }
        ctm.fireTableDataChanged();
        ctm1.fireTableDataChanged();
        jTableCarreras.clearSelection();
    }//GEN-LAST:event_jButtonBajaCarreraActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        try {
            int seleccion = jTableCarreras.convertRowIndexToModel(jTableCarreras.getSelectedRow());
            if (!LogicaCarreras.getListaCarreras().get(seleccion).isIniciada()) {
                ModificarCarrera modificarCarrera = new ModificarCarrera(paginaPrincipal,
                        true, LogicaCarreras.getListaCarreras().get(seleccion));
                modificarCarrera.setVisible(true);
                lf.abrirFicheroCSVEscrituraCarrera("ficheros/carreras.csv", LogicaCarreras.getListaCarreras());
                //lfo.abrirFicheroObjetosEscrituraCarreras("ficheros/carreras.dat", LogicaCarreras.getListaCarreras());
                ctm.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(this, "CARRERA INICIADA", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado carrera", "", JOptionPane.INFORMATION_MESSAGE);
        }
        jTableCarreras.clearSelection();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAgregarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCorredorActionPerformed
        try {
            int seleccion = jTableCarreras.convertRowIndexToModel(jTableCarreras.getSelectedRow());
            Carrera carrera = LogicaCarreras.getListaCarreras().get(seleccion);
            if (carrera.getListaParticipantes().size() < carrera.getMaxParticipantes()) {
                if (!carrera.isIniciada()) {
                    if (seleccion >= 0) {
                        int opcion = JOptionPane.showConfirmDialog(this, "EXISTE EL CORREDOR", "", JOptionPane.YES_NO_OPTION);
                        if (opcion == JOptionPane.YES_OPTION) {
                            //Carrera carrera = LogicaCarreras.getListaCarreras().get(seleccion);
                            CorredoresParaCarrera cpc = new CorredoresParaCarrera(paginaPrincipal, true, carrera);
                            cpc.setVisible(true);
                        }
                        if (opcion == JOptionPane.NO_OPTION) {
                            DatosCorredor datosCorredor = new DatosCorredor(paginaPrincipal, true);
                            datosCorredor.setVisible(true);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede agregar corredores\n"
                            + "la carrera está iniciada o finalizada", "", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La carrera está completa\nno se pueden agregar corredores");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay selección.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        jTableCarreras.clearSelection();
    }//GEN-LAST:event_jButtonAgregarCorredorActionPerformed

    private void jButtonAnularCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnularCorredorActionPerformed
        try {
            int seleccion = jTableCarreras.convertRowIndexToModel(jTableCarreras.getSelectedRow());
            if (!LogicaCarreras.getListaCarreras().get(seleccion).isIniciada()) {
                Carrera carrera = LogicaCarreras.getListaCarreras().get(seleccion);
                ParticipantesCarrera participantesCarrera = new ParticipantesCarrera(paginaPrincipal, true, carrera, true);
                participantesCarrera.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "No se puede anular corredores\n"
                        + "la carrera está iniciada o finalizada", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay selección.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        jTableCarreras.clearSelection();
    }//GEN-LAST:event_jButtonAnularCorredorActionPerformed

    private void jButtonVerParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerParticipantesActionPerformed
        try {
            if (jTableCarreras.getSelectedRowCount() > 0) {
                int seleccion1 = jTableCarreras.convertRowIndexToModel(jTableCarreras.getSelectedRow());
                Carrera carrera1 = LogicaCarreras.getListaCarreras().get(seleccion1);
                ParticipantesCarrera participantesCarrera = new ParticipantesCarrera(paginaPrincipal, true, carrera1, false);
                participantesCarrera.setVisible(true);
            } else {
                int seleccion2 = jTableFinalizadas.convertRowIndexToModel(jTableFinalizadas.getSelectedRow());
                Carrera carrera2 = LogicaCarreras.getListaCarrerasFinalizadas().get(seleccion2);
                ParticipantesCarrera participantesCarrera = new ParticipantesCarrera(paginaPrincipal, true, carrera2, false);
                participantesCarrera.setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay selección.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        jTableCarreras.clearSelection();
        jTableFinalizadas.clearSelection();
    }//GEN-LAST:event_jButtonVerParticipantesActionPerformed

    private void jButtonIniciarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarCarreraActionPerformed
        try {
            int seleccion = jTableCarreras.convertRowIndexToModel(jTableCarreras.getSelectedRow());
            if (!LogicaCarreras.getListaCarreras().get(seleccion).isIniciada()) {
                Carrera carrera = LogicaCarreras.getListaCarreras().get(seleccion);
                CarreraEnCurso carreraEnCurso = new CarreraEnCurso(paginaPrincipal, true, carrera);
                carreraEnCurso.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "CARRERA YA INICIADA O FINALIZADA", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay selección.", "", JOptionPane.INFORMATION_MESSAGE);
        }
        ctm.fireTableDataChanged();
        ctm1.fireTableDataChanged();
        jTableCarreras.clearSelection();
    }//GEN-LAST:event_jButtonIniciarCarreraActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        if (jComboBoxTablas.getSelectedItem().equals("Sin iniciar")) {
            if (jComboBoxFiltrar.getSelectedItem().equals("Nombre carrera")) {
                RowFilter<CarrerasTableModel, Integer> rf = RowFilter.regexFilter(jTextFieldFiltrar.getText(), 0);
                sorter.setRowFilter(rf);
            } else if (jComboBoxFiltrar.getSelectedItem().equals("Lugar")) {
                RowFilter<CarrerasTableModel, Integer> rf1 = RowFilter.regexFilter(jTextFieldFiltrar.getText(), 2);
                sorter.setRowFilter(rf1);
            }
        }
        if (jComboBoxTablas.getSelectedItem().equals("Finalizadas")) {
            if (jComboBoxFiltrar.getSelectedItem().equals("Nombre carrera")) {
                RowFilter<CarrerasTableModel, Integer> rf = RowFilter.regexFilter(jTextFieldFiltrar.getText(), 0);
                sorter2.setRowFilter(rf);
            } else if (jComboBoxFiltrar.getSelectedItem().equals("Lugar")) {
                RowFilter<CarrerasTableModel, Integer> rf1 = RowFilter.regexFilter(jTextFieldFiltrar.getText(), 2);
                sorter2.setRowFilter(rf1);
            }
        }
        jTextFieldFiltrar.setText("");
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        jTableCarreras.clearSelection();
        jTableFinalizadas.clearSelection();
        jButtonAgregarCorredor.setEnabled(true);
        jButtonAnularCorredor.setEnabled(true);
        jButtonBajaCarrera.setEnabled(true);
        jButtonIniciarCarrera.setEnabled(true);
        jButtonModificar.setEnabled(true);
        jButtonNuevaCarrera.setEnabled(true);
    }//GEN-LAST:event_jPanel1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarCorredor;
    private javax.swing.JButton jButtonAnularCorredor;
    private javax.swing.JButton jButtonBajaCarrera;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonIniciarCarrera;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevaCarrera;
    private javax.swing.JButton jButtonVerParticipantes;
    private javax.swing.JComboBox<String> jComboBoxFiltrar;
    private javax.swing.JComboBox<String> jComboBoxTablas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCarreras;
    private javax.swing.JTable jTableFinalizadas;
    private javax.swing.JTextField jTextFieldFiltrar;
    // End of variables declaration//GEN-END:variables
}
