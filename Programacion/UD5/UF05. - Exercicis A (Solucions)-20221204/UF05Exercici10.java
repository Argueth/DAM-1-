/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 10: Llig notes entre 0 i 10 fins que s'introdueix un -1 i ens diu si hi ha o no algun 10
 */
public class UF05Exercici10 {
    
    public static void main (String[] args){
        
        // Declaració de variables
        int numero;
        boolean deu=false;
        Scanner entrada = new Scanner (System.in);

        //Petició i processament de dades
        System.out.print("Introdueix una nota entre o i 10 (-1 per a acabar): ");
        numero = entrada.nextInt();

        while (numero!=-1) {
            if (numero==10) deu=true;
            System.out.print("Introdueix una nota entre o i 10 (-1 per a acabar): ");
            numero = entrada.nextInt();
        }
        if (deu)
            System.out.println("S'ha introduït al menys un deu.");
        else
            System.out.println("No s'ha introduït cap deu." );
    }
}
