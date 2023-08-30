/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siem;

/**
 *
 * @author gabo-
 */
//Se crea la clase MAQUINA:
public class Matricula {
    //Se define el tipo de visibilidad y el tipo de datos para los atributos:
    public int idMatricula; //Atributo publico de tipo entero.
    public String referencia; //Atributo publico de tipo texto.

    //Se crea el metodo constructor:
    public Matricula(int idMatricula, String referencia) {
        this.idMatricula = idMatricula;
        this.referencia = referencia;
    }

    //Se crea los metodos setter and getter:
    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    
    
    
}
