/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf07exercicis;
import java.util.Scanner;
/**
 * UF07 Exercici 7:  Programa que demane l'ample i alt d'un rectangle i mostre per pantalla la seua àrea i
 * el seu perímetre, utilitzant funcions.
 */
public class UF07Exercici07 {

    //*****************************
    // DECLARACIÓ DE FUNCIONS
    //*****************************
    
    public static double areaRectangle(double ample, double alt) {
        
        return ample * alt;
        
    }

    public static double perimetreRectangle(double ample, double alt) {
        
        return (2 * (ample + alt));
        
    }

    //*****************************
    // PROCEDIMENT PRINCIPAL
    //*****************************
    
    public static void main(String[] args) {
        
        // Declaració de variables
        double ample, alt;
        Scanner entrada = new Scanner(System.in);

        // Petició de dades per pantalla
        System.out.print("Introdueix ample: ");
        ample = entrada.nextDouble();
        System.out.print("Introdueix alt: ");
        alt = entrada.nextDouble();        
        
        // Mostrar resultats
        System.out.println("Perímetre: " + perimetreRectangle(ample, alt));
        System.out.println("Àrea: " + areaRectangle(ample, alt)); 
        entrada.close();
    }
}
