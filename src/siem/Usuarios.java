/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package siem;

/**
 *
 * @author gabo-
 */
//Se crea la clase USUARIOS:
public class Usuarios {
    
    //Se define el tipo de visibilidad y el tipo de datos para los atributos:
    public int idUsuario; //Atributo publico de tipo entero.
    public String contrasenaUsuario; //Atributo publico de tipo entero.

    //Se crea el metodo constructor:
    public Usuarios(int idUsuario, String contrasenaUsuario) {
        this.idUsuario = idUsuario;
        this.contrasenaUsuario = contrasenaUsuario;
    }
    
    //Se crea los metodos getter and setter:
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }
    
    
    
}
