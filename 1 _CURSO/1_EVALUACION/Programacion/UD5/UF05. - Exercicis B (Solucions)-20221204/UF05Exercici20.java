/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 20: A partir d'un número entre 0 i 20 introuït per teclat es mostren el números
 * del 1 fins al n un en cada línia i tantes vegades com el seu valor.
 */
public class UF05Exercici20 {
    
    public static void main (String[] args){
        
        // Declaració de variables
        int i, j, numero;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades
        System.out.print("Introdueix un número del 0 al 20: ");
        numero = entrada.nextInt();
        
        // Mostrar les dades
        for (i=1; i<=numero; i++){
            for (j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        entrada.close();
    }
    
}
