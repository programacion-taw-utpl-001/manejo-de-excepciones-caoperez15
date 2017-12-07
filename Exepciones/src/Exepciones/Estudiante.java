/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

/**
 *
 * @author Chris
 */
public class Estudiante {

    private String nombre;
    private String apellido;

    public Estudiante() {
    }

    public Estudiante(String n, String a) {
        setNombre(n);
        setApellido(a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    @Override
    public String toString() {
        return String.format("%s %s",
                getNombre(),
                getApellido());
    }

}
