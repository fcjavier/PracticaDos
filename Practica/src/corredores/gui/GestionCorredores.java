package corredores.gui;

import corredores.logica.LogicaCorredor;
import corredores.tableModel.CorredoresTableModel;
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
public class GestionCorredores extends javax.swing.JDialog {
 
    LogicaFicherosCSV lf = new LogicaFicherosCSV();
    CorredoresTableModel ctm;
    TableRowSorter<CorredoresTableModel> sorter;
    PaginaPrincipal paginaPrincipal;
    /**
     * Creates new form GestionCorredores
     * @param parent
     * @param modal
     */
    public GestionCorredores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        paginaPrincipal = (PaginaPrincipal) parent;
        initComponents();
        this.setTitle("GESTIÓN DE CORREDORES");
        CargarTableModelCorredores();
    }
    //Método que rellena el listado de corredores
    public void CargarTableModelCorredores(){
        ctm = new CorredoresTableModel(LogicaCorredor.getListaCorredores());
        jTableCorredores.setModel(ctm);
        sorter = new TableRowSorter<>(ctm);
        jTableCorredores.setRowSorter(sorter);
        List<SortKey>sortkeys = new ArrayList<SortKey>();
        sortkeys.add(new SortKey(0, SortOrder.ASCENDING));
        sorter.setSortKeys(sortkeys);       
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
        jTableCorredores = new javax.swing.JTable();
        jToggleButtonNuevoCorredor = new javax.swing.JToggleButton();
        jToggleButtonBaja = new javax.swing.JToggleButton();
        jToggleButtonModificar = new javax.swing.JToggleButton();
        jComboBoxFiltrar = new javax.swing.JComboBox<>();
        jTextFieldFiltrar = new javax.swing.JTextField();
        jToggleButtonFiltrar = new javax.swing.JToggleButton();
        jToggleButtonCarrerasCorredor = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCorredores);

        jToggleButtonNuevoCorredor.setText("NUEVO CORREDOR");
        jToggleButtonNuevoCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonNuevoCorredorActionPerformed(evt);
            }
        });

        jToggleButtonBaja.setText("BAJA CORREDOR");
        jToggleButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonBajaActionPerformed(evt);
            }
        });

        jToggleButtonModificar.setText("MODIFICAR ");
        jToggleButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonModificarActionPerformed(evt);
            }
        });

        jComboBoxFiltrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtrar por...", "Nombre", "DNI" }));

        jToggleButtonFiltrar.setText("FILTRAR");
        jToggleButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonFiltrarActionPerformed(evt);
            }
        });

        jToggleButtonCarrerasCorredor.setText("VER  CARRERAS  CORREDOR");
        jToggleButtonCarrerasCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCarrerasCorredorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButtonNuevoCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jToggleButtonBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jToggleButtonCarrerasCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldFiltrar)
                    .addComponent(jComboBoxFiltrar, 0, 127, Short.MAX_VALUE)
                    .addComponent(jToggleButtonFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonNuevoCorredor)
                    .addComponent(jComboBoxFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButtonCarrerasCorredor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonBaja)
                    .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonModificar)
                    .addComponent(jToggleButtonFiltrar))
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void jToggleButtonNuevoCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonNuevoCorredorActionPerformed
        DatosCorredor datosCorredor = new DatosCorredor(paginaPrincipal, true);
        datosCorredor.setVisible(true);
        ctm.fireTableDataChanged();
    }//GEN-LAST:event_jToggleButtonNuevoCorredorActionPerformed

    private void jToggleButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonBajaActionPerformed
             try {
            int seleccion = jTableCorredores.convertRowIndexToModel(jTableCorredores.getSelectedRow());
            int opcion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar al corredor?", "BORRADO", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                LogicaCorredor.getListaCorredores().remove(seleccion);
                lf.abrirFicheroCSVEscrituraCorredor("ficheros/corredor.csv", LogicaCorredor.getListaCorredores());
                JOptionPane.showMessageDialog(this, "Corredor eliminado", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                ctm.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar", "ERROR", JOptionPane.ERROR);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado corredor", "", JOptionPane.INFORMATION_MESSAGE);
        }
             jTableCorredores.clearSelection();
    }//GEN-LAST:event_jToggleButtonBajaActionPerformed

    private void jToggleButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonModificarActionPerformed
           try {
            int seleccion = jTableCorredores.convertRowIndexToModel(jTableCorredores.getSelectedRow());
            ModificarDatos modificarDatos = new ModificarDatos(paginaPrincipal,
                    true, LogicaCorredor.getListaCorredores().get(seleccion));
            modificarDatos.setVisible(true);
            lf.abrirFicheroCSVEscrituraCorredor("ficheros/corredor.csv", LogicaCorredor.getListaCorredores());
            ctm.fireTableDataChanged();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado corredor", "", JOptionPane.INFORMATION_MESSAGE);
        }
           jTableCorredores.clearSelection();
    }//GEN-LAST:event_jToggleButtonModificarActionPerformed

    private void jToggleButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonFiltrarActionPerformed
         if(jComboBoxFiltrar.getSelectedItem().equals("Nombre")){
             RowFilter<CorredoresTableModel, Integer> rf = RowFilter.regexFilter(jTextFieldFiltrar.getText(), 0);
        sorter.setRowFilter(rf);
         }else if(jComboBoxFiltrar.getSelectedItem().equals("DNI")){
             RowFilter<CorredoresTableModel, Integer> rf1 = RowFilter.regexFilter(jTextFieldFiltrar.getText(), 1);
        sorter.setRowFilter(rf1);
         }
         jTextFieldFiltrar.setText("");
    }//GEN-LAST:event_jToggleButtonFiltrarActionPerformed

    private void jToggleButtonCarrerasCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCarrerasCorredorActionPerformed
         try{
             int seleccion = jTableCorredores.convertRowIndexToModel(jTableCorredores.getSelectedRow());
             CarrerasDelCorredor carrerasDelCorredor = new CarrerasDelCorredor(paginaPrincipal, true,
                     LogicaCorredor.getListaCorredores().get(seleccion));
             carrerasDelCorredor.setVisible(true);
         }catch(Exception ex){
             JOptionPane.showMessageDialog(this, "No ha seleccionado corredor", "", JOptionPane.INFORMATION_MESSAGE);
         }
    }//GEN-LAST:event_jToggleButtonCarrerasCorredorActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxFiltrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredores;
    private javax.swing.JTextField jTextFieldFiltrar;
    private javax.swing.JToggleButton jToggleButtonBaja;
    private javax.swing.JToggleButton jToggleButtonCarrerasCorredor;
    private javax.swing.JToggleButton jToggleButtonFiltrar;
    private javax.swing.JToggleButton jToggleButtonModificar;
    private javax.swing.JToggleButton jToggleButtonNuevoCorredor;
    // End of variables declaration//GEN-END:variables
}
