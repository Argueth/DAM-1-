/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici B 1: Programa que demane una cadena de text per teclat i després mostra cada paraula
 * de la cadena en una línia diferent.
 */
public class UF06ExerciciB01 {
    public static void main(String[] args){
        
        // Declaració de variables
        int i;
        String frase;
        String paraulesFrase[];
        Scanner entrada = new Scanner (System.in);
        
        // Demana la cadena de text
        System.out.println("Introdueix una frase");
        frase = entrada.nextLine();
        
        // Dividir la frase en paraules i mostrar-la
        paraulesFrase = frase.split(" ");
        
        for (i=0; i<=paraulesFrase.length; i++){
            System.out.println (paraulesFrase[i]);
        }
        
    }
    
}
