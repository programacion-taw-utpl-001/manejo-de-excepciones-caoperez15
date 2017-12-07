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

    private Estudiante[] lista_estudiante;
    private double[] notas_matematicas;
    private double[] notas_sociales;
    private double[] promedios;

    public Asignacion() {
    }

    public Asignacion(Estudiante[] li_es, double[] no_ma, double[] no_so) {
        setLista_estudiante(li_es);
        setNotas_matematicas(no_ma);
        setNotas_sociales(no_so);
    }

    public Estudiante[] getLista_estudiante() {
        return lista_estudiante;
    }

    public void setLista_estudiante(Estudiante[] li_es) {
        lista_estudiante = li_es;
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

    public double promedio_matematicas() {
        double promedio_mate = 0.0;

        for (double notas_matematica : getNotas_matematicas()) {
            promedio_mate += notas_matematica;

        }
        return promedio_mate / getNotas_matematicas().length;
    }

    public double promedio_sociales() {
        double promedio_sociales = 0.0;

        for (double notas_social : getNotas_sociales()) {
            promedio_sociales += notas_social;

        }

        return promedio_sociales / getNotas_sociales().length;
    }

    public double[] promedios_alumnos() {

        promedios = new double[4];
        for (int i = 0; i < this.promedios.length; i++) {
            promedios[i] = ((getNotas_matematicas()[i] + getNotas_sociales()[i]) / 2);

        }

        return promedios;
    }

    public String Estudiantes() {
        String cadena = "";
        for (int i = 0; i < getLista_estudiante().length; i++) {
            cadena += String.format("%s\n"
                    + "\tMatematicas: %.1f\n"
                    + "\tSociales: %.1f\n"
                    + "\tPromedio: %.1f\n\n",
                    getLista_estudiante()[i],
                    getNotas_matematicas()[i],
                    getNotas_sociales()[i],
                    promedios_alumnos()[i]);

        }

        return cadena;
    }

    @Override
    public String toString() {

        return String.format("Lista De Estudiantes\n"
                + "%s\n"
                + "Promedios Generales\n"
                + "Promedios de matematicas: %.1f\n"
                + "Promedio de sociales: %.1f\n",
                Estudiantes(),
                promedio_matematicas(),
                promedio_sociales());

    }

}
