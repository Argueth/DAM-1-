/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf07exercicis;
import java.util.Scanner;
/**
 * UF07 Exercici 4:  Programa que demana un nombre enter per teclat i mostra per pantalla si és positiu,
 * negatiu o zero, utilitzant una funció.
 */
public class UF07Exercici04 {

    //*****************************
    // DECLARACIÓ DE FUNCIONS
    //*****************************
    
    public static int dimeSigne(int a) {
        
        int resultat;
        
        if (a == 0) {
            resultat = 0;
        } else { if (a > 0){
                resultat = 1;
                } else {
                    resultat = -1;
                }
            }
        
        return resultat;
    }

    //*****************************
    // PROCEDIMENT PRINCIPAL
    //*****************************
    
    public static void main(String[] args) {
        
        // Declaració de variables
        int x, signe;
        Scanner entrada = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix un número enter: ");
        x = entrada.nextInt();
        
        // Processar les dades
        signe=dimeSigne(x);
        switch (signe) {
                case 0:
                    System.out.println("El número és cero.");
                    break;
                case 1:
                    System.out.println("El número és positiu.");
                    break;
                case -1:
                    System.out.println("El número és negatiu.");
        }         
        entrada.close();
    }
}
