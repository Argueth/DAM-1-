/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 1: Introdueix 10 números reals per teclat emmagatzema'ls en un array i mostra'ls després.
 */
public class UF06ExerciciA01 {
    public static void main (String[] args){
        
        // Declaració de variables
        final int MAXIM=10;
        double valors[] = new double [MAXIM];
        int i;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades i emmagatzematge en un array
        for (i=0; i<MAXIM; i++){
            System.out.print("Introdueix l'element " + (i+1) + " del vector: ");
            valors[i]=entrada.nextDouble();
        }
                
        // Mostrar contingut de l'array
        System.out.println ("Els valors introduïts són:");
        for (i=0; i<MAXIM; i++){
            System.out.println ("Valor " + (i+1) + ": " + valors[i]);
        }
        entrada.close();
                
    }
    
}
