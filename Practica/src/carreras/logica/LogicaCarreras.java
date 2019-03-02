package carreras.logica;

import carreras.dto.Carrera;
import java.util.ArrayList;
import java.util.List;
import logicaParaFicheros.LogicaFicherosObjetos;

/**
 *
 * @author USER
 */
public class LogicaCarreras {

    LogicaFicherosObjetos lfo = new LogicaFicherosObjetos();
    private static List<Carrera> listaCarreras = new ArrayList<Carrera>();

    public boolean agregarCarrera(Carrera carrera) {
        return listaCarreras.add(carrera);
    }

    public static List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void cargarListaCarreras(List<Carrera> lista) {
        this.listaCarreras = lista;
    }

    
}
