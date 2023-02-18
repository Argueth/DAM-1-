/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 15: Mostrar i contar números multiples de 3 des de l'1 fins al número introduït per pantalla.
 */
public class UF05Exercici15 {

    public static void main (String[] args){
        
        // Declaració de variables
        int numero, contador;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades
        System.out.print ("Introdueix el número fins al que vols arribar: ");
        numero=entrada.nextInt();
        
        // Processar les dades
        contador = 0;
        for (int i = 3; i <= numero; i = i + 3){
            System.out.print(i + ", ");
            contador++;
        }
        System.out.println ("en total els multiples de 3 són: " + contador);
        entrada.close();
    }
    
}
