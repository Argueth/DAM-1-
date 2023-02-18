/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf07exercicis;
import java.util.Scanner;
/**
 * UF07 Exercici 2:  Programa que demana l'edat per teclat i mostra per pantalla si eres major d'edat o
 * no, utilitzant una funció.
 */
public class UF07Exercici02 {

    //*****************************
    // DECLARACIÓ DE FUNCIONS
    //*****************************
    
    public static boolean esMajorEdat(int a) {
        
        boolean majorEdat=false;
        
        if (a >= 18) {
            majorEdat=true;
        }
        
        return majorEdat;
    }

    //*****************************
    // PROCEDIMENT PRINCIPAL
    //*****************************
    
    public static void main(String[] args) {
        
        // Declaració de variables
        int x;
        Scanner entrada = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix la teua edat: ");
        x = entrada.nextInt();
        
        // Processar les dades
        if (esMajorEdat(x)) {
            System.out.println("Eres major d'edat.");
        } else {
            System.out.println("No eres major d'edad");
        }
        entrada.close();
    }
}
