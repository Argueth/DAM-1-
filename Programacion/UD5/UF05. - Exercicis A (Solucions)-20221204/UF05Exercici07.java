/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 7: Llig 10 números no nuls i ens diu quants són positius i quants negatius
 */
public class UF05Exercici07 {

    public static void main (String[] args){

        // Declaració de variables        
        final int MAX=10;
        int i, numero, positius, negatius;
        boolean negatiu;
        Scanner entrada = new Scanner(System.in);

        // Processar les dades        
        positius=0;
        negatius=0;
        
        for (i=1; i<=MAX; i++){
            System.out.print("Introdueix el número " + i + " de " + MAX + ": ");
            numero = entrada.nextInt();
            if (numero<0){
                negatius++;
            } else {
                positius++;
            }
        }
        
        // Mostrar resultats
        System.out.println("S'han introduït " + positius + " número/s positiu/s.");
        System.out.println("S'han introduït " + negatius + " número/s negatiu/s.");
    }
}
