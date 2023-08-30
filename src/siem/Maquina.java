/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siem;

/**
 *
 * @author gabo-
 */
//Se crea la calse MAQUINA:
public class Maquina {
    
   //Se define el tipo de visibilidad y el tipo de datos para los atributos:  
    public int idMaquina; //Atributo publico de tipo entero.
    public String nombreMaquina; //Atributo publico de tipo texto.
    public String molinosUtilizados; //Atributo publico de tipo texto.

    //Se crea el metodo constructor:
    public Maquina(int idMaquina, String nombreMaquina, String molinosUtilizados) {
        this.idMaquina = idMaquina;
        this.nombreMaquina = nombreMaquina;
        this.molinosUtilizados = molinosUtilizados;
    }

    //Se crea los metodos getter and setter:
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
