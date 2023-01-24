/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici B 2: Programa que demana dues cadenes de text per teclat i després indica si són
 * iguals, a més de si són iguals sense diferenciar entre majúscules i minúscules.
 */
public class UF06ExerciciB02 {
    public static void main (String[] args){
        
        // Declaració de variables
        String frase1, frase2;
        Scanner entrada = new Scanner (System.in);
        
        // Demana les frases
        System.out.print ("Introdueix la primera frase: ");
        frase1=entrada.nextLine();
        System.out.print ("Introdueix la segona frase: ");
        frase2=entrada.nextLine();
        
        // Comprovació de les frases
        if (frase1.equals(frase2)){
            System.out.println("Les dos frases són iguals.");
        } else { if (frase1.equalsIgnoreCase(frase2)){
                        System.out.println("Les dos frases són iguals sense diferenciar majúscules i minúscules.");
                } else {
                        System.out.println("Les dos frases són diferents.");
                }
        }
    }
}
