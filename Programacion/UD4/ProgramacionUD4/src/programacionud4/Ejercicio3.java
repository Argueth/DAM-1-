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
public class Ejercicio3 {
     public static void main(String[] args) {
         int lado;
         Scanner teclado = new Scanner (System.in);
         System.out.println("Introduce la longitud de lado del cuadrado");
         lado = teclado.nextInt();
         int area = lado * lado;
         System.out.println("El área del cuadrado de lado " + lado + " es " + area);  
    }
    
}

