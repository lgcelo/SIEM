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
//Se crea la clase SILO:
public class Silo {
    //Se define el tipo de visibilidad y el tipo de datos para los atributos: 
    public int idSilo; //Atributo publico de tipo entero.
    public Date fecha; //Atributo publico de tipo fecha.
    public int cantidadKg; //Atributo publico de tipo entero.
    public Date desgasificacion; //Atributo publico de tipo fecha.
    public String nombreMolinero; //Atributo publico de tipo texto.
    public String observaciones; //Atributo publico de tipo texto.
    public Date horaInicio; //Atributo publico de tipo fecha.
    public Date horaFinal; //Atributo publico de tipo fecha.
    public int velocidadRotativa; //Atributo publico de tipo entero.
    
    //Se crea el metodo constructor:
    public Silo(int idSilo, Date fecha, int cantidadKg, Date desgasificacion, String nombreMolinero, String observaciones, Date horaInicio, Date horaFinal, int velocidadRotativa) {
        this.idSilo = idSilo;
        this.fecha = fecha;
        this.cantidadKg = cantidadKg;
        this.desgasificacion = desgasificacion;
        this.nombreMolinero = nombreMolinero;
        this.observaciones = observaciones;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
        this.velocidadRotativa = velocidadRotativa;
    }

    //Se crea los metodos setter and getter:
    public int getIdSilo() {
        return idSilo;
    }

    public void setIdSilo(int idSilo) {
        this.idSilo = idSilo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidadKg() {
        return cantidadKg;
    }

    public void setCantidadKg(int cantidadKg) {
        this.cantidadKg = cantidadKg;
    }

    public Date getDesgasificacion() {
        return desgasificacion;
    }

    public void setDesgasificacion(Date desgasificacion) {
        this.desgasificacion = desgasificacion;
    }

    public String getNombreMolinero() {
        return nombreMolinero;
    }

    public void setNombreMolinero(String nombreMolinero) {
        this.nombreMolinero = nombreMolinero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getVelocidadRotativa() {
        return velocidadRotativa;
    }

    public void setVelocidadRotativa(int velocidadRotativa) {
        this.velocidadRotativa = velocidadRotativa;
    }
    
    
    
}
