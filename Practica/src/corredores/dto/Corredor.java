package corredores.dto;

import carreras.dto.Carrera;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Corredor implements Serializable {

    //Atributos
    private String nombre;
    private String dni;
    private String fechaNacimiento;
    private String direccion;
    private String telefono;
    private List<Carrera> inscripciones;

    //Constructores
    public Corredor() {
    }

    public Corredor(String nombre, String dni, String fechaNacimiento, String direccion, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.inscripciones = new ArrayList<Carrera>();
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Carrera> getInscripciones() {
        return inscripciones;
    }

    public void setInscripciones(List<Carrera> inscripciones) {
        this.inscripciones = inscripciones;
    }

}
