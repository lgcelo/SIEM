/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siem;

/**
 *
 * @author gabo-
 */
public class Aforo {
    
     public int idAforo;
    public int tiempoDeSiloLleno;
    public int kgXmin;

    public Aforo(int idAforo, int tiempoDeSiloLleno, int kgXmin) {
        this.idAforo = idAforo;
        this.tiempoDeSiloLleno = tiempoDeSiloLleno;
        this.kgXmin = kgXmin;
    }

    public int getIdAforo() {
        return idAforo;
    }

    public void setIdAforo(int idAforo) {
        this.idAforo = idAforo;
    }

    public int getTiempoDeSiloLleno() {
        return tiempoDeSiloLleno;
    }

    public void setTiempoDeSiloLleno(int tiempoDeSiloLleno) {
        this.tiempoDeSiloLleno = tiempoDeSiloLleno;
    }

    public int getKgXmin() {
        return kgXmin;
    }

    public void setKgXmin(int kgXmin) {
        this.kgXmin = kgXmin;
    }
    
    
}
