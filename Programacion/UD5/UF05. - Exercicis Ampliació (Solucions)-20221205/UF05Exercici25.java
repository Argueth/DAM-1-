/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 25: Determinar si un número introduït per teclat és capicua.
 */
public class UF05Exercici25 {

    public static void main(String[] args) {
        
        // Declaració de variables
        long numero, auxiliar, reves;
        Scanner entrada = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix un número enter positiu: ");
        numero=entrada.nextLong();

        // Girem el número per a comprovar després si és igual al original.
        reves = 0;
        auxiliar = numero;
        while (auxiliar>0){
            reves = (reves*10) + (auxiliar%10);     // Extrau digit més baix i el posa com el més alt en reves
            auxiliar = auxiliar/10;                 // Llevem el digit més baix i procesem la resta del número
        }

        // Mostrem si és o no capicua
        if (numero == reves) {
        System.out.println("El número " + numero + " es capicua");
        } else {
        System.out.println("El número " + numero + " no es capicua");
        }
        entrada.close();
    }
    
}
