package corredores.dto;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Participante implements Serializable {

    //Atributos
    private Corredor corredor;
    private String nombre;
    private String dorsal;
    private String tiempo;

    //Cosntructores
    public Participante() {
    }

    public Participante(Corredor corredor) {
        this.corredor = corredor;
        this.dorsal = "";
        this.tiempo = "";
    }

    //Getters and Setters
    public String getNomParticipante() {
        return corredor.getNombre();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public Corredor getCorredor() {
        return corredor;
    }

    public void setCorredor(Corredor corredor) {
        this.corredor = corredor;
    }

}
