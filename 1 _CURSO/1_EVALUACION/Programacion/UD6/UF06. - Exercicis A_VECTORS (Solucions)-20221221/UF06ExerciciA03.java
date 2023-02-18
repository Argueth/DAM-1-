/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 3: Introdueix 10 números reals per teclat emmagatzema'ls en un array i mostra el màxim i el mínim.
 */
public class UF06ExerciciA03 {
    public static void main (String[] args){
        
        // Declaració de variables
        final int MAXIM=10;
        double valors[] = new double [MAXIM];
        int i;
        double maxim=Double.MIN_VALUE, minim=Double.MAX_VALUE;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades i emmagatzematge en un array
        for (i=0; i<MAXIM; i++){
            System.out.print("Introdueix l'element " + (i+1) + " del vector: ");
            valors[i]=entrada.nextDouble();
        }
                
        // Càlcul del màxim i el mínim
        for (i=0; i<MAXIM; i++){
            if (valors[i]>maxim){
                maxim=valors[i];
            }
            if (valors[i]<minim){
                minim=valors[i];
            }
        }
        System.out.println ("El màxim dels valors introduïts és: " + maxim);
        System.out.println ("El mínim dels valors introduïts és: " + minim);
        entrada.close();
    }
}
