package carreras.tableModel;

import carreras.dto.Carrera;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class CarrerasTableModel extends AbstractTableModel {
    
    private String[] cabeceras ={"Nombre","Fecha","Lugar","Max Corredores","Estado"};
    private List<Carrera> listaCarreras = new ArrayList<Carrera>();
    public CarrerasTableModel(List<Carrera> lista){
        this.listaCarreras=lista;
    }

    @Override
    public int getRowCount() {
       return listaCarreras.size();
    }

    @Override
    public int getColumnCount() {
     return cabeceras.length;
    }

    @Override
    public Object getValueAt(int row, int colum) {
          switch(colum){
              case 0:
                  return listaCarreras.get(row).getNomCarrera();
              case 1:
                  return listaCarreras.get(row).getFechaCarrera();
              case 2:
                  return listaCarreras.get(row).getLugar();
              case 3:
                  return listaCarreras.get(row).getMaxParticipantes();
              case 4:
                  if(listaCarreras.get(row).isIniciada()){
                      return "Finalizada";
                  }else
                      return "Sin iniciar";
          }
          return null;
    }

    @Override
    public String getColumnName(int colum) {
        return cabeceras[colum];  
    }
     
    
}
