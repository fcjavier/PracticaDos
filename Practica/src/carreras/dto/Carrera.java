package carreras.dto;

import corredores.dto.Corredor;
import corredores.dto.Participante;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Carrera implements Serializable {

    //Atributos
    private String nomCarrera;
    private String fechaCarrera;
    private String lugar;
    private int maxParticipantes;
    private boolean iniciada;
    private List<Participante> listaParticipantes;
    private List<Integer> listaDorsales;
    private List<Corredor> inscritos;

    //Constructores
    public Carrera() {
    }

    public Carrera(String nomCarrera, String fechaCarrera, String lugar, int maxParticipantes) {
        this.nomCarrera = nomCarrera;
        this.fechaCarrera = fechaCarrera;
        this.lugar = lugar;
        this.maxParticipantes = maxParticipantes;
        this.iniciada = false;
        this.listaParticipantes = new ArrayList<Participante>();
        this.inscritos = new ArrayList<Corredor>();
        this.cargarDorsales(maxParticipantes);
    }

    //Método que crea una lista de dorsales para asignar a los corredores.
    public void cargarDorsales(int total) {
        this.listaDorsales = new ArrayList<>();
        for (int i = 0; i < total; i++) {
            listaDorsales.add((i + 100));
        }
    }

    //Getters and Setters
    public String getNomCarrera() {
        return nomCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public String getFechaCarrera() {
        return fechaCarrera;
    }

    public void setFechaCarrera(String fechaCarrera) {
        this.fechaCarrera = fechaCarrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }

    public boolean isIniciada() {
        return iniciada;
    }

    public void setEstado(boolean estado) {
        this.iniciada = estado;
    }

    public List<Participante> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(List<Participante> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    public List<Integer> getListaDorsales() {
        return listaDorsales;
    }

    public List<Corredor> getInscritos() {
        return inscritos;
    }

    public void setInscritos(List<Corredor> inscritos) {
        this.inscritos = inscritos;
    }

    @Override
    public String toString() {
        return "Carrera: nombre= " + nomCarrera + ", fechaCarrera= " + fechaCarrera
                + ", lugar= " + lugar + ", maxParticipantes= " + maxParticipantes
                + ", estado= " + iniciada;
    }

}
