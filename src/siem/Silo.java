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
public class Silo {
    
    public int idSilo;
    public Date fecha;
    public int cantidadKg;
    public Date desgasificacion;
    public String nombreMolinero;
    public String observaciones;
    public Date horaInicio;
    public Date horaFinal;
    public int velocidadRotativa;

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
