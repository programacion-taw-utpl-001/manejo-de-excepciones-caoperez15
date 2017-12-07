/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Estudiante[] lista_estudiantes = new Estudiante[4];
        double[] notas_mate = new double[4];
        double[] notas_soci = new double[4];

        int cont = 0;
        while (cont < 4) {
            Estudiante es = new Estudiante();
            try {
                System.out.println("Ingreso De Estudiantes\n"
                        + "Estudiante Actual  " + cont);
                System.out.println("\nIngrese el nombre del Estudiante: ");
                es.setNombre(sc.nextLine());

                System.out.println("Ingrese el apellido del Estudiante: ");
                es.setApellido(sc.nextLine());
                lista_estudiantes[cont] = es;

                System.out.println("Ingrese la nota de matematicas: ");

                notas_mate[cont] = Double.parseDouble(sc.nextLine());

                System.out.println("Ingrese la nota de sociales: ");
                notas_soci[cont] = Double.parseDouble(sc.nextLine());;

                cont++;

            } catch (NumberFormatException numberFormatException) {
                System.out.println("La nota debe ser un numero ");
            } catch (Exception e) {
                System.err.println(e);

            }

        }
        Asignacion a = new Asignacion(lista_estudiantes, notas_mate, notas_soci);
        System.out.println(a);

    }

}
