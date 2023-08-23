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
public class Empaque {
    
    public int idEmpaque;
    public Date fecha;
    public Date hora;

    public Empaque(int idEmpaque, Date fecha, Date hora) {
        this.idEmpaque = idEmpaque;
        this.fecha = fecha;
        this.hora = hora;
    }

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
