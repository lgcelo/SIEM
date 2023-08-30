/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siem;

/**
 *
 * @author gabo-
 */
//Se crea la clase Aforo:
public class Aforo { 
    //Se define el tipo de visibilidad y el tipo de datos para los atributos:
    public int idAforo; //Atributo publico de tipo entero.
    public int tiempoDeSiloLleno; //Atributo publico de tipo entero.
    public int kgXmin; //Atributo publico de tipo entero.
    
//Se crea el metodo constructor:
    public Aforo(int idAforo, int tiempoDeSiloLleno, int kgXmin) {
        this.idAforo = idAforo;
        this.tiempoDeSiloLleno = tiempoDeSiloLleno;
        this.kgXmin = kgXmin;
    }
    
//Se crean los metodos getter and setter:
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
