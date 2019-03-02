package corredores.dto;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Participante implements Serializable {

    //Atributos
    private String nomParticipante;
    private String dorsal;
    private String tiempo;

    //Cosntructores
    public Participante() {
    }

    public Participante(String nomParticipante) {
        this.nomParticipante = nomParticipante;
        this.dorsal = "";
        this.tiempo = "";
    }

    //Getters and Setters
    public String getNomParticipante() {
        return nomParticipante;
    }

    public void setNomParticipante(String nomParticipante) {
        this.nomParticipante = nomParticipante;
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

    @Override
    public String toString() {
        return "Participante: nombre= " + nomParticipante + ", dorsal= " + dorsal + ", tiempo= " + tiempo;
    }

}
