/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siem;

import java.util.Date;

/**
 *
 * @author gabo-
 */
//Se crea la clase EMPAQUE:
public class Empaque {
    //Se define el tipo de visibilidad y el tipo de datos para los atributos:
    public int idEmpaque; //Atributo publico de tipo entero.
    public Date fecha; //Atributo publico de tipo fecha.
    public Date hora; //Atributo publico de tipo fecha.

    // Se crea el metodo constructor:
    public Empaque(int idEmpaque, Date fecha, Date hora) {
        this.idEmpaque = idEmpaque;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    //Se crea los metodos getter and setter:
    public int getIdEmpaque() {
        return idEmpaque;
    }

    public void setIdEmpaque(int idEmpaque) {
        this.idEmpaque = idEmpaque;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }
    
    
    
}
