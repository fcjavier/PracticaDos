package corredores.tableModel;

import corredores.dto.Corredor;
import corredores.logica.LogicaCorredor;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class CorredoresTableModel extends AbstractTableModel {

    LogicaCorredor lc = new LogicaCorredor();
    private List<Corredor> listaCorredores = new ArrayList<Corredor>();
    private String[] nomColumnas = {"Nombre", "DNI", "Fecha Nacimiento", "Dirección", "Telefono"};

    public CorredoresTableModel(List<Corredor> lista) {
        this.listaCorredores = lista;
    }

    @Override
    public int getRowCount() {
        return listaCorredores.size();
    }

    @Override
    public int getColumnCount() {
        return nomColumnas.length;
    }

    @Override
    public Object getValueAt(int row, int colum) {
        switch (colum) {
            case 0:
                return listaCorredores.get(row).getNombre();
            case 1:
                return listaCorredores.get(row).getDni();
            case 2:
                return listaCorredores.get(row).getFechaNacimiento();
            case 3:
                return listaCorredores.get(row).getDireccion();
            case 4:
                return listaCorredores.get(row).getTelefono();           
        }
        return null;
    }

    @Override
    public String getColumnName(int colum) {
        return nomColumnas[colum];
    }

}
