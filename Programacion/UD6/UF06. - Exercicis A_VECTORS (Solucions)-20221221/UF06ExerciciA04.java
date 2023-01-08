/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 4: Introdueix 20 números reals per teclat emmagatzema'ls en un array i mostra la suma
 * dels positius i dels negatius per separat.
 */
public class UF06ExerciciA04 {
    public static void main (String[] args){
        
        // Declaració de variables
        final int MAXIM=20;
        double valors[] = new double [MAXIM];
        int i;
        double sumapos, sumaneg;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades i emmagatzematge en un array
        for (i=0; i<MAXIM; i++){
            System.out.print("Introdueix l'element " + (i+1) + " del vector: ");
            valors[i]=entrada.nextDouble();
        }
                
        // Mostrar la suma dels elements de l'array
        sumapos=0;
        sumaneg=0;
        for (i=0; i<MAXIM; i++){
            if (valors[i]>0){
                sumapos=sumapos+valors[i];
            } else {
                sumaneg=sumaneg+valors[i];
            }
        }
        System.out.println ("La suma dels valors positius introduïts és: " + sumapos);
        System.out.println ("La suma dels valors negatius introduïts és: " + sumaneg);
        entrada.close();
    }
}
