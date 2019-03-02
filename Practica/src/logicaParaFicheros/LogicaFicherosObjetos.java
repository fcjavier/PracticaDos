package logicaParaFicheros;

import carreras.dto.Carrera;
import corredores.dto.Corredor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.openide.util.Exceptions;

/**
 *
 * @author USER
 */
public class LogicaFicherosObjetos {

    public void abrirFicheroObjetosEscrituraCarreras(String fichero, List<Carrera> obj) {
        File f = new File(fichero);
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
            for (Carrera o : obj) {
                salida.writeObject(o);
            }
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    public List<Carrera> abrirFicheroLecturaObjetos(String fichero) {
        List<Carrera> lista = new ArrayList<>();
        File f = new File(fichero);
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(f));
            Carrera obj = (Carrera) entrada.readObject();
            while (obj != null) {
                lista.add(obj);
                obj = (Carrera) entrada.readObject();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            System.out.println("Final del fichero.\nFichero cargado correctamente.");
        } catch (ClassNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
        return lista;
    }

    public void abrirFicheroObjetosEscrituraCorredores(String fichero, List<Corredor> obj) {
        File f = new File(fichero);
        try {
            ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(f));
            for (Corredor o : obj) {
                salida.writeObject(o);
            }
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    public List<Corredor> abrirFicheroLecturaCorredores(String fichero) {
        List<Corredor> lista = new ArrayList<>();
        File f = new File(fichero);
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(f));
            Corredor obj = (Corredor) entrada.readObject();
            while (obj != null) {
                lista.add(obj);
                obj = (Corredor) entrada.readObject();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            System.out.println("Final del fichero.\nFichero cargado correctamente");
        } catch (ClassNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }
        return lista;
    }

}
