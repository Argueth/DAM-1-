/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 19: Demana un número i escriu tants "*" com el valor del número.
 * Si és negatiu sols escriu un "*"
 */
public class UF05Exercici19 {
    
     public static void main(String[] args) {

        // Declaració de variables 
        int numero;
        Scanner entrada = new Scanner(System.in);

        // Petició de dades
        System.out.print("Introdueix un número: ");
        numero = entrada.nextInt();
        
        // Mostrar els "*"
        for (int i = 1; i <= numero; i++) {
            System.out.print("* ");
        }
        System.out.println("");

        if (numero < 0) {
            System.out.println("*");
        }
        entrada.close();
     }
}
