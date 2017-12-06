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
public class Asignacion {

    Estudiante[] lista_persona;
    double[] notas_matematicas;
    double[] notas_sociales;

    public Asignacion() {
    }

    public Asignacion(Estudiante[] li_pe, double[] no_ma, double[] no_so) {
        setLista_persona(li_pe);
        setNotas_matematicas(no_ma);
        setNotas_sociales(no_so);
    }

    public Estudiante[] getLista_persona() {
        return lista_persona;
    }

    public void setLista_persona(Estudiante[] li_pe) {
        lista_persona = li_pe;
    }

    public double[] getNotas_matematicas() {

        return notas_matematicas;
    }

    public void setNotas_matematicas(double[] no_ma) {
        notas_matematicas = no_ma;
    }

    public double[] getNotas_sociales() {
        return notas_sociales;
    }

    public void setNotas_sociales(double[] no_so) {
        notas_sociales = no_so;
    }

    public void lista() {
        String lista = "";
        for (int i = 0; i < 4; i++) {
            lista = lista_persona[i].toString() + notas_matematicas[i] + notas_sociales[i];
        }

    }

    public double promedio_por_estudiante() {
        double prom = 0, suma = 0;
        double n, n2;
        for (int i = 0; i < 4; i++) {
            n = notas_matematicas[i];
            n2 = notas_sociales[i];
            suma = n + n2;
        }
        prom = suma / 2;
        return prom;
    }

    public void promedio_general_por_materia() {
        double sumaM = 0, promM = 0, promE = 0, sumaE = 0;
        for (int i = 0; i < notas_matematicas.length; i++) {
            sumaM = sumaM + notas_matematicas[i];
        }
        promM = sumaM / 4;
        for (int i = 0; i < notas_sociales.length; i++) {
            sumaE = sumaE + notas_sociales[i];
        }
        promE = sumaE / 4;
        System.out.println("Promedio Matematicas: " + promM);
        System.out.println("Promedio Sociales: " + promE);
    }

    @Override
    public String toString() {
        return String.format("%s\n"
                + "Notas Mate: %s\n"
                + "Notas Sociales: %s\n"
                + "Promedio Estudiante: %.2f",
                getLista_persona(),getNotas_matematicas(), getNotas_sociales(),promedio_por_estudiante());
    }

}
