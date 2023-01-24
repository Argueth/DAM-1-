/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 5: Introdueix 20 números reals per teclat emmagatzema'ls en un array i mostra la mitjana.
 */
public class UF06ExerciciA05 {
    public static void main (String[] args){
        
        // Declaració de variables
        final int MAXIM=20;
        double valors[] = new double [MAXIM];
        int i;
        double suma, mitjana;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades i emmagatzematge en un array
        for (i=0; i<MAXIM; i++){
            System.out.print("Introdueix l'element " + (i+1) + " del vector: ");
            valors[i]=entrada.nextDouble();
        }
                
        // Mostrar la mitjana dels elements de l'array
        suma=0;
        for (i=0; i<MAXIM; i++){
            suma=suma+valors[i];
        }
        mitjana=suma/MAXIM;
        System.out.println ("La mitjana dels valors introduïts és: " + mitjana);
        entrada.close();
    }
}
