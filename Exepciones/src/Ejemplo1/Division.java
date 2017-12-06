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
public class Division {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerador, denominador, div;
        boolean opc = true;

        do {

            try {

                System.out.println("Ingrese el denominador: ");

                numerador = sc.nextInt();
                System.out.println("Ingrese el denominador: ");
                denominador = sc.nextInt();
                div = numerador / denominador;
                System.out.println("La division es: " + div);

                opc = false;

            } catch (Exception e) {
                System.err.println(e);
                System.out.println("Ingrese un numero mayor a: 0");

            }

        } while (opc);

    }

}
