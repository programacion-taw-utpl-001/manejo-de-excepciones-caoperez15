/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo1;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class Principal {
    public static void main(String[] args) {
        String nombre;
        int edad;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        
        
        
        System.out.printf("Su nombre es: %s",nombre);
        System.out.printf("Su nombre es: %d",edad);
        
    }
}
