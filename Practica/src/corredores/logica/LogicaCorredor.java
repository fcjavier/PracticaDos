package corredores.logica;

import carreras.dto.Carrera;
import corredores.dto.Corredor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class LogicaCorredor {

    private static List<Corredor> listaCorredores = new ArrayList<Corredor>();

    public void agregarCorredor(Corredor corredor) {
        listaCorredores.add(corredor);
    }

    public static List<Corredor> getListaCorredores() {
        return listaCorredores;
    }
     /**
     * Método que crea una colección de corredores. Recibe un parámetro de tipo
     * List.
     *
     * @param lista
     */
    public void cargarListaCorredor(List<Corredor> lista) {
        listaCorredores = lista;
    }
    /**
     * Método que comprueba que la longitud del dni sea la correcta y que esté
     * compuesta de ocho números y una letra mayúscula.
     *
     * @param dni Recibe un parámetro en forma de String con el valor del dni.
     * @return boolean
     */
     public boolean comprobarDNI(String dni) {
        boolean control = true;
        if (dni.length() != 9) {
            control = false;
        }
        if (control == true) {
            for (int i = 0; i < dni.length() - 1; i++) {
                if (dni.codePointAt(i) >= 48 && dni.codePointAt(i) <= 57) {
                } else {
                    control = false;
                }
            }
            if (dni.codePointAt(dni.length() - 1) >= 65 && dni.codePointAt(dni.length() - 1) <= 90) {
            } else {
                control = false;
            }
        }
        return control;
    }
     /**
     * Método para comprobar que el número de teléfono tiene 9 dígitos.
     *
     * @param tlf Recibe un String con el valor del teléfono.
     * @return boolean.
     */
    public boolean comprobarTelefono(String tlf) {
        boolean control = true;
        if (tlf.length() != 9) {
            control = false;
        }
        for (int i = 0; i < tlf.length(); i++) {
            if (tlf.codePointAt(i) < 48 || tlf.codePointAt(i) > 57) {
                control = false;
            }
        }
        return control;
    }
     /**
     * Método para dar de baja un corredor.
     *
     * @param c Parámetro de tipo (object) con los datos del corredor.
     * @return boolean.
     */
    public boolean bajaCorredor(Corredor c) {
        return listaCorredores.remove(c);
    }
    /*
    public static void agregarCarreraACorredor(Carrera carrera,Corredor corredor){
        corredor.getInscripciones().add(carrera);
    }*/
}
