/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timersavedata;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Save implements Serializable {

    private int tiempo;
    private boolean activo = false;

    public Save(int tiempo, boolean activo) {
        this.tiempo = tiempo;
        this.activo = activo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
