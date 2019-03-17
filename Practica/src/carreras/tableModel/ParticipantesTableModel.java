package carreras.tableModel;

import corredores.dto.Participante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class ParticipantesTableModel extends AbstractTableModel {

    public List<Participante> lista = new ArrayList<>();
    public String[] cabeceras = {"Nombre", "Dorsal", "Tiempo"};

    public ParticipantesTableModel(List<Participante> listaParticipantes) {
        this.lista = listaParticipantes;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return cabeceras.length;
    }

    @Override
    public Object getValueAt(int row, int colum) {
        switch (colum) {
            case 0:
                return lista.get(row).getNomParticipante();
            case 1:
                return lista.get(row).getDorsal();
            case 2:
                return lista.get(row).getTiempo();
        }
        return null;
    }

    @Override
    public String getColumnName(int colum) {
        return cabeceras[colum];
    }

}
