/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Arrays;
/**
 * UF06 Exercici 16: Programa que crea un array d'enters i introdueix la següent seqüència de valors:
 * 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5 etc. fins a introduir 10 deu vegades, i després ho
 * mostra per pantalla.
 */
public class UF06ExerciciA16 {

    public static void main(String[] args) {
    
        // Declaració de variables
        final int MAXIM=10;
        int elements, i, j, posicioact;
        
        
        // Calculem quants elements ha de tindre el vector
        elements = 0;
        for (i = 1; i <= MAXIM; i++) {
            elements += i;
        }

        // Creació del vector
        int vector[] = new int[elements];
        
        // Índice para recorrer el vector
        posicioact = 0;
        
        // Per a cada número del 1 al 10
        for (i = 1; i <= 10; i++) {
           
        // Omplim les posicions corresponents amb el valor actual
            Arrays.fill(vector,posicioact,posicioact+i,i);    
            posicioact += i;
            
        }
      
        // Mostrem l'array
        System.out.print("Valors: ");
        for (i = 0; i < elements; i++) {
            System.out.print(vector[i] + " ");
        }

    }
    
}
