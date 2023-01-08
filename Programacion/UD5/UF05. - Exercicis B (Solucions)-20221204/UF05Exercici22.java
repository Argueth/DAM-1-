/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 22: Dibuixar una piràmide amb "*"
 */
public class UF05Exercici22 {

    public static void main (String[] args){
        
        // Declaració de variables
        int numero, i, j, k, estreles;     
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades
        System.out.print("Introdueix un número per a fer la piràmide: ");
        numero = entrada.nextInt();
        
        // Dibuixar la piràmide
        estreles=1;
        for (i=1; i<=numero; i++){
            for (j=1; j<=numero-i; j++){
                System.out.print(" ");
            }
            for (k=1; k<=estreles; k++){
                System.out.print ("*");
            }
            System.out.println (" ");
            estreles += 2;
        }
        entrada.close();
    }
    
}
