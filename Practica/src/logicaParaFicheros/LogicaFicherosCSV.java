package logicaParaFicheros;

import carreras.dto.Carrera;
import corredores.dto.Corredor;
import corredores.dto.Participante;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.text.FieldView;
import org.openide.util.Exceptions;

/**
 *
 * @author USER
 */
public class LogicaFicherosCSV {

    //Atributos
    private List<Corredor> lista;
    private List<Carrera> carreras;
    private List<Participante> participantes;
    /**
     * Método que abre un fichero de caracteres para su escritura. Recibe dos
     * parámetros un String con el nombre del fichero en el que se quiere
     * escribir y otro con una lista de corredores de tipo List.
     *
     * @param fichero
     * @param lista
     * @return boolean
     */
    public boolean abrirFicheroCSVEscrituraCorredor(String fichero, List<Corredor> lista) {
        boolean correcto = true;
        FileWriter fw = null;
        try {
            BufferedWriter escribe = new BufferedWriter(new FileWriter(fichero));
            for (Corredor c : lista) {
                try {
                    escribe.write(c.getNombre() + "," + c.getDni() + "," + c.getFechaNacimiento() + ","
                            + c.getDireccion() + "," + c.getTelefono() + "\r\n");
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
            escribe.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
            correcto = false;
        }
        return correcto;
    }

    /**
     * Método que abre un fichero de caracteres para su escritura. Recibe dos
     * parámetros un String con el nombre del fichero en el que se quiere
     * escribir y otro con una lista de carreras de tipo List.
     *
     * @param fichero
     * @param carreras
     * @return boolean
     */
    public boolean abrirFicheroCSVEscrituraCarrera(String fichero, List<Carrera> carreras) {
        boolean correcto = true;
        FileWriter fw = null;
        try {
            BufferedWriter escribe = new BufferedWriter(new FileWriter(fichero));
            for (Carrera c : carreras) {
                try {
                    escribe.write(c.getNomCarrera() + "," + c.getFechaCarrera() + "," + c.getLugar() + ","
                            + c.getMaxParticipantes() + "\r\n");
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
            escribe.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
            correcto = false;
        }
        return correcto;
    }

    /**
     * Método para la lectura de un fichero de caracteres. Recibe un parámetro
     * con el nombre del fichero y guardando los datos en una colección de tipo
     * List.
     *
     * @param fichero con el nombre del fichero a leer.
     * @return List de corredores.
     */
    public List<Corredor> abrirFicheroCSVLecturaCorredor(String fichero) {
        lista = new ArrayList<>();
        FileReader fr = null;
        try {
            BufferedReader leer = new BufferedReader(new FileReader(fichero));
            String linea = leer.readLine();
            while (linea != null) {
                lista.add(tokenizarCorredor(linea));
                linea = leer.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return lista;
    }

    /**
     * Método para la lectura de un fichero de caracteres. Recibe un parámetro
     * con el nombre del fichero y guardando los datos en una colección de tipo
     * List.
     *
     * @param fichero con el nombre del fichero a leer.
     * @return List de carreras.
     */
    public List<Carrera> abrirFicheroCSVLecturaCarrera(String fichero) {
        carreras = new ArrayList<>();
        FileReader fr = null;
        try {
            BufferedReader leer = new BufferedReader(new FileReader(fichero));
            String linea = leer.readLine();
            while (linea != null) {
                carreras.add(tokenizarCarrera(linea));
                linea = leer.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return carreras;
    }
        public boolean abrirFicheroCSVEscrituraParticipantes(String fichero, List<Participante> participante) {
        boolean correcto = true;
        FileWriter fw = null;
        try {
            BufferedWriter escribe = new BufferedWriter(new FileWriter(fichero));
            for (Participante p : participante) {
                try {
                    escribe.write(p.getNomParticipante() + "," + p.getDorsal() + "," + p.getTiempo() + "\r\n");
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
            escribe.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
            correcto = false;
        }
        return correcto;
    }

         public List<Participante> abrirFicheroCSVLecturaParticipantes(String fichero) {
        participantes = new ArrayList<>();
        FileReader fr = null;
        try {
            BufferedReader leer = new BufferedReader(new FileReader(fichero));
            String linea = leer.readLine();
            while (linea != null) {
                participantes.add(tokenizarParticipante(linea));
                linea = leer.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return participantes;
    }
         public static void grabarCSVCarreraFilalizada(String fichero,String linea){
        try {
            File f = new File(fichero);
            BufferedWriter escribe = new BufferedWriter(new FileWriter(f, true));
            escribe.write(linea);
            escribe.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
         }
    /**
     * Método que extrae los tokens existentes, en una cadena de caracteres.
     * Recibe un String con la cadena a tokenizar.
     *
     * @param cadena
     * @return un corredor tipo (object).
     */
    private Corredor tokenizarCorredor(String cadena) {
        Corredor c = null;
        StringTokenizer st = new StringTokenizer(cadena, ",");
        while (st.hasMoreTokens()) {
            String nombre = st.nextToken();
            String dni = st.nextToken();
            String fecha = st.nextToken();
            String direccion = st.nextToken();
            String telefono = st.nextToken();
            c = new Corredor(nombre, dni, fecha, direccion, telefono);
        }
        return c;
    }

    /**
     * Método que extrae los tokens existentes en una cadena de caracteres.
     * Recibe un String con la cadena a tokenizar.
     *
     * @param cadena
     * @return una carrera tipo (object).
     */
    private Carrera tokenizarCarrera(String linea) {
        Carrera c = null;
        StringTokenizer st = new StringTokenizer(linea, ",");
        while (st.hasMoreTokens()) {
            String nombre = st.nextToken();
            String fecha = st.nextToken();
            String lugar = st.nextToken();
            int max = Integer.parseInt(st.nextToken());
            c = new Carrera(nombre, fecha, lugar, max);
        }
        return c;
    }
 
     private Participante tokenizarParticipante(String linea) {
        Participante p = null;
        StringTokenizer st = new StringTokenizer(linea, ",");
        while (st.hasMoreTokens()) {
            String nombre = st.nextToken();
            String dorsal = st.nextToken();
            String tiempo = st.nextToken();
            int max = Integer.parseInt(st.nextToken());
            p = new Participante();
            p.setNombre(nombre);
            p.setDorsal(dorsal);
            p.setTiempo(tiempo);
        }
        return p;
    }
}
