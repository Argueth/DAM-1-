/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 12: Calcula la potència d' A elevat a B sense utilitzar la funció ^
 */
public class UF05Exercici12 {

    public static void main (String[] args){
        
        // Declaració de variables
        int i, baseA, exponentB, resultat;
        Scanner entrada = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix la base A: ");
        baseA = entrada.nextInt();
        System.out.print("Introdueix l'exponent B: ");
        exponentB = entrada.nextInt();
        
        // Realitzar càlculs
        if (exponentB<0) exponentB *= -1;
       
        resultat = 1;
        
        // Si l'exponent és 0 no entrarà en el bucle i ens dona resultat=1
        
        for (i=1; i<=exponentB; i++){
            resultat = resultat * baseA;
         }
        
        // Mostrar resultats
        System.out.println( baseA + " elevat a " + exponentB + " = " + resultat);

    }
}
