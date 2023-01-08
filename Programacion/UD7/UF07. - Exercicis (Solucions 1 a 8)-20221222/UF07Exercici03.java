/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf07exercicis;
import java.util.Scanner;
/**
 * UF07 Exercici 3:  Programa que demane dos nombres enters per teclat i mostre per pantalla quin és el mínim,
 * utilitzant una funció.
 */
public class UF07Exercici03 {

    //*****************************
    // DECLARACIÓ DE FUNCIONS
    //*****************************
    
    public static int minim(int a, int b) {
        
        int resultat=0;
        
        if (a < b) {
            resultat=a;
        } else {
            resultat=b;
        }
        
        return resultat;
    }

    //*****************************
    // PROCEDIMENT PRINCIPAL
    //*****************************
    
    public static void main(String[] args) {
        
        // Declaració de variables
        int x, y, min;
        Scanner entrada = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix un número enter: ");
        x = entrada.nextInt();
        System.out.print("Introdueix un número enter: ");
        y = entrada.nextInt();
        
        // Processar les dades
        min=minim(x, y);
        System.out.println("El mínim és: " + min);
        entrada.close();
    }
}
