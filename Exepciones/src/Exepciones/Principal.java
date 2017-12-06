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
        double var=0, va=0;
        int num_alumnno = 4;
        int contador = 1;
        Estudiante lista[] = new Estudiante[4];
        double[] notas_matematicas = new double[4]; 
        double[] notas_sociales = new double[4]; 
        
        while(contador<4) {
            
            System.out.println("Ingrese el nombre:");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el apellido:");
            String apellido = sc.nextLine();
            Estudiante es = new Estudiante(nombre, apellido);
            
                       
            System.out.println("Ingrese su nota en la meteria de matematicas");
            String mat = sc.nextLine();
            
            System.out.println("Ingrese su nota en la materia de sociales");
            String soc = sc.nextLine();
            
            try {
                var = Double.parseDouble(mat);
                va = Double.parseDouble(soc);
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
            
            
            
            Asignacion asig = new Asignacion(lista, notas_matematicas, notas_sociales);
            System.out.println(asig);
            
        }
    }
    

}
