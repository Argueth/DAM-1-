/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 5: Calcula el factorial d'un número introduït pel teclat
 */
public class UF05Exercici05 {

    public static void main (String[] args){

        // Declaració de variables        
        int i, numero, factorial;
        Scanner entrada = new Scanner(System.in);

        //Petició de dades        
        System.out.print("Introdueix un número per a calcular el factorial: ");
        numero = entrada.nextInt();

        // Càlcul del factorial
        factorial=1;
        for (i=numero; i>1; i--){
            factorial=factorial*i;
        }
        System.out.println("El factoria de " + numero + " és " + factorial);
    }
}
