/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcronometro;

import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Cronometro extends JLabel implements Serializable {

    private boolean estado;

    int seg;
    int min;
    int hor;
    String segundos;
    String minutos;
    String hora;

    public Cronometro() {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                if (estado) {
                    seg++;
                    if (seg == 60) {
                        seg = 0;
                        min++;
                        if (min == 60) {
                            hor++;
                        }
                    }
                }
                if (seg < 10) {
                    segundos = "0" + seg;
                } else {
                    segundos = "" + seg;
                }
                if (min < 10) {
                    minutos = "0" + min;
                } else {
                    minutos = "" + min;
                }
                if (hor < 10) {
                    hora = "0" + hor;
                } else {
                    hora = "" + hor;
                }
                setText("" + hora + "h: " + minutos + "' : " + segundos + "\"");
            }
        }, 0, 1000);
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getHor() {
        return hor;
    }

    public void setHor(int hor) {
        this.hor = hor;
    }

}
