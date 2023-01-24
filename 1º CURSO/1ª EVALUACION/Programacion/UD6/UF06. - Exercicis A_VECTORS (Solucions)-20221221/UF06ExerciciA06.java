/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 6: Introdueix 2 números enters per teclat N i M, crea una array de grandaria N,
 * emmagatzema el valor M en totes les posicions i les mostra.
 */
public class UF06ExerciciA06 {
    public static void main (String[] args){
        
        // Declaració de variables
        int i, n, m;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades
        System.out.print("Inrodueix el tamany del vector: ");
        n=entrada.nextInt();
        System.out.print("Introdueix el valor a emmagatzemar: ");
        m=entrada.nextInt();
        
        // Construir l'array
        int valors[]=new int[n];
        for (i=0; i<n; i++){
            valors[i]=m;
        }
                
        // Mostrar els elements de l'array
        for (i=0; i<n; i++){
            System.out.print (valors[i] + " ");
        }
        entrada.close();
    }
}
