/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 12: Programa que permet a l'usuari emmagatzemar en un array del tamany que vulga
 * una seqüència aritmètica donant un valor inicial i un increment i després mostrar-la.
 */
public class UF06ExerciciA13 {
    
   public static void main(String[] args) {
              
       // Declaració de variables
       int i, vinicial, increment, tamany;
       Scanner entrada = new Scanner(System.in);
       
       // Petició de dades
       System.out.print("Introdueix el valor inicial: ");
       vinicial = entrada.nextInt();
       System.out.print("Introdueix l'increment: ");
       increment = entrada.nextInt();
       System.out.print("Introdueix quants elements vols: ");
       tamany = entrada.nextInt();

       // Creació del vector i càrrega de la seqüencia
       int vector[] = new int[tamany];
       for (i = 0; i < tamany; i++) {
            vector[i] = vinicial + (i * increment);
       }

       // Mostrem la seqüencia
       System.out.print("Seqüencia: ");
       for (i = 0; i < tamany; i++) {
           System.out.print(vector[i] + " ");
       }
       entrada.close();
    } 
}
