/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timersavedata;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class TimerData extends JLabel implements Serializable {

    private boolean formato24h;
    private Save salvar;
    private int cont;

    private SimpleDateFormat form24h = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat form12h = new SimpleDateFormat("hh:mm:ss a");

    private SaveListener saveListener;

    public TimerData() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Date horaActual = new Date();
                if (formato24h) {
                    setText(form24h.format(horaActual));
                } else {
                    setText(form12h.format(horaActual));
                }
                if (salvar != null) {
                    if (salvar.isActivo() && tiempoPaso(salvar.getTiempo())) {
                        if (saveListener != null) {
                            saveListener.guardarDatos();
                        }
                    }
                }
            }
        }, 0, 1000);

    }

    public boolean isFormato24h() {
        return formato24h;
    }

    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }

    public Save getSalvar() {
        return salvar;
    }

    public void setSalvar(Save salvar) {
        this.salvar = salvar;
    }

    public void setSaveListener(SaveListener saveListener) {
        this.saveListener = saveListener;
    }

    public void addSaveListener(SaveListener saveListener) {
        this.saveListener = saveListener;
    }

    public boolean tiempoPaso(int tiempoEspera) {
        cont++;
        if (cont == tiempoEspera * 60) {
            cont = 0;
            return true;
        } else {
            return false;
        }
    }
}
