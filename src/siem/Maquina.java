/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siem;

/**
 *
 * @author gabo-
 */
public class Maquina {
    
    public int idMaquina;
    public String nombreMaquina;
    public String molinosUtilizados;

    public Maquina(int idMaquina, String nombreMaquina, String molinosUtilizados) {
        this.idMaquina = idMaquina;
        this.nombreMaquina = nombreMaquina;
        this.molinosUtilizados = molinosUtilizados;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getNombreMaquina() {
        return nombreMaquina;
    }

    public void setNombreMaquina(String nombreMaquina) {
        this.nombreMaquina = nombreMaquina;
    }

    public String getMolinosUtilizados() {
        return molinosUtilizados;
    }

    public void setMolinosUtilizados(String molinosUtilizados) {
        this.molinosUtilizados = molinosUtilizados;
    }
    
    
    
}
