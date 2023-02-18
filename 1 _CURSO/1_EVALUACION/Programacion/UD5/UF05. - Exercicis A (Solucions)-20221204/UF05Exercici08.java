/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 8: Llig números fins que s'introdueix el 0 i ens diu si hi ha alguno negatiu,
 *                  quants són positius i quants són negatius.
 */
public class UF05Exercici08 {
    
    public static void main (String[] args){
        
        // Declaració de variables
        int numero, positius=0, negatius=0;
        Scanner entrada = new Scanner (System.in);

        // Processar dades        
        System.out.print("Introdueix un número (0 per a acabar): ");
        numero = entrada.nextInt();
        
        while (numero!=0) {
            if (numero<0){
                negatius++;
            } else {
                positius++;
            }
            System.out.print("Introdueix un número (0 per a acabar): ");
            numero = entrada.nextInt();
        }
        
        // Mostrar resultats
        if (negatius>0) System.out.println("S'han introduït números negatius.");
        System.out.println("S'han introduït " + positius + " número/s positiu/s.");
        System.out.println("S'han introduït " + negatius + " número/s negatiu/s.");
    }
}
