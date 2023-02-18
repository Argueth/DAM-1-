/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;

/**
 * UF05 Exercici 9: Programa que calcula la suma i el producte dels 10 primers números naturals.
 */
public class UF05Exercici09 {

    public static void main (String[] args){
        
        // Declaració de variables
        final int MAX=10;
        int i, suma=0, producte=1;

        // Processar dades
        for (i=1; i<=MAX; i++){
            suma += i;
            producte *= i;
        }
        
        // Mostrar resultats
        System.out.println("La suma dels " + MAX + " primers números és: " + suma);
        System.out.println("El producte dels " + MAX + " primers números és: " + producte);
    }
}
