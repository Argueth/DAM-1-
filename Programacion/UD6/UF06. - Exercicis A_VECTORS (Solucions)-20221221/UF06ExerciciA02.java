/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 2: Introdueix 10 números reals per teclat emmagatzema'ls en un array i mostra la suma.
 */
public class UF06ExerciciA02 {
    public static void main (String[] args){
        
        // Declaració de variables
        final int MAXIM=10;
        double valors[] = new double [MAXIM];
        int i;
        double suma;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades i emmagatzematge en un array
        for (i=0; i<MAXIM; i++){
            System.out.print("Introdueix l'element " + (i+1) + " del vector: ");
            valors[i]=entrada.nextDouble();
        }
                
        // Mostrar la suma dels elements de l'array
        suma=0;
        for (i=0; i<MAXIM; i++){
            suma=suma+valors[i];
        }
        System.out.println ("La suma dels valors introduïts és: " + suma);
        entrada.close();
    }
}
