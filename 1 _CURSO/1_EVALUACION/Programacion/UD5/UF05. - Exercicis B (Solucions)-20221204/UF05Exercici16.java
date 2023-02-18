/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 16: Comprovar si un número introduït per teclat és primer
 */
public class UF05Exercici16 {

    public static void main (String[] args){
        
        // Declaració de variables
        int numero,j;
        boolean esPrimer=true;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades
        System.out.print("Introdueix un número enter: ");
        numero = entrada.nextInt();
        
        // Processar número
        j=2;
        while ((j<=numero/2) && (esPrimer)) {
            if (numero%j == 0){
                esPrimer=false;
            }
            j++;
        }
        
        // Mostrar el resultat
        if (esPrimer) {
            System.out.printf ("El número %d és primer.", numero);
        } else {
            System.out.printf ("El número %d no és primer.", numero);
        }
        entrada.close();
    }
    
}
