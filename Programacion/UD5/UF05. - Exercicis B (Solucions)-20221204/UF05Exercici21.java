/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 21: Demana dos números enters A i B, el segon major que el primer i 
 * mostra la llista de números que hi ha entre ells i ens diu quants són parells.
 */
public class UF05Exercici21 {

    public static void main (String[] args){
        
        // Declaració de variables
        int a, b, i, parells=0;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades
        System.out.print ("Introdueix un número: ");
        a=entrada.nextInt();
        System.out.print ("Introdueix altre número major que el primer: ");
        b=entrada.nextInt();
        
        // Processar dades i mostrar resultats
        for (i=a; i<=b; i++){
            System.out.print(i + " ");
            if (i%2==0) parells++;
        }
        System.out.printf("\nHi ha %d números parells.", parells);
        entrada.close();
    }
    
}
