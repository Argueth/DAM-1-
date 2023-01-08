/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud4;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Introduce el primer número.");
        int primer_numero = numero1.nextInt();
        System.out.println("Introduce el segundo número.");
        int segundo_numero = numero2.nextInt();
        int suma = primer_numero + segundo_numero;
        System.out.println("La suma de " + primer_numero + " y " + segundo_numero + " es " + suma);
          
    } 
}
