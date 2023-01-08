/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 4: Mostra els primers 20 números naturals
 */
public class UF05Exercici04 {

    public static void main (String[] args){
        
        // Declaració de variables
        int i, numero;
        Scanner entrada = new Scanner(System.in);
        
        //Petició de dades
        System.out.print("Fins a quin número vols llistar? ");
        numero = entrada.nextInt();
        
        // Processar les dades
        for (i=1; i<=numero; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
