package carreras.logica;

import carreras.dto.Carrera;
import corredores.dto.Corredor;
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
    private static List<Carrera> carrerasFinalizadas = new ArrayList<Carrera>();
    private static List<Corredor> listaCorredores = new ArrayList<Corredor>();

    public boolean agregarCarrera(Carrera carrera) {
        return listaCarreras.add(carrera);
    }

    public static List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void cargarListaCarreras(List<Carrera> lista) {
        LogicaCarreras.listaCarreras = lista;
    }

    public void eliminarCarrera(Carrera carrera) {
        if (listaCarreras.contains(carrera)) {
            listaCarreras.remove(carrera);
        }
    }

    public static boolean agregarCarreraFinalizada(Carrera carrera) {
        return carrerasFinalizadas.add(carrera);
    }

    public static void cargarFinalizadas(List<Carrera> finalizadas) {
        LogicaCarreras.carrerasFinalizadas = finalizadas;
    }

    public static List<Carrera> getListaCarrerasFinalizadas() {
        return carrerasFinalizadas;
    }

    public static List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public static void setListaCorredores(List<Corredor> listaCorredores) {
        LogicaCarreras.listaCorredores = listaCorredores;
    }

}
