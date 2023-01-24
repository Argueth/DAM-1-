/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
import java.util.Arrays;
/**
 * UF06 Exercici B 5: Programa que llig una frase per teclat i indica si la frase és un palíndrom o no
 * (ignorant espais i sense diferenciar entre majúscules i minúscules). 
 */
public class UF06ExerciciB05 {

    public static void main(String[] args) {
        
        // Declaració de variables
        int i;
        String frase, reves;
        Scanner entrada = new Scanner(System.in);

        // Petició de dades
        System.out.print("Introdueix la frase: ");
        frase =  entrada.nextLine();
        frase = frase.replace(" ", "");
        frase = frase.toUpperCase();
        char vector[] = new char[frase.length()];
      
        // Generem la frase del reves i comparem
        for (i=0; i<frase.length(); i++){
            vector[frase.length()-i-1]=frase.charAt(i);
        }
        reves = String.valueOf(vector);
        
        if (frase.equals(reves)){
            System.out.println("La frase és palindrom.");
        } else {
            System.out.println("La frase no és palindrom.");
        }
    }
}
