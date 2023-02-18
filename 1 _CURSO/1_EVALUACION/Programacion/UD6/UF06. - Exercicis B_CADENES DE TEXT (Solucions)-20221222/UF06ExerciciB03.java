/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;

/**
 * UF06 Exercici B 3: Programa que demana per teclat tres cadenes de text: nom i dos cognoms.
 * Després mostrarà un codi d'usuari (en majúscules) format per la concatenació de les tres
 * primeres lletres de cadascun d'ells.
 */
public class UF06ExerciciB03 {

    public static void main(String[] args) {
        
        // Declaració de variables
        String nom, cognom1, cognom2, codi;        
        Scanner entrada = new Scanner(System.in);

        // Petició de dades
        System.out.print("Introdueix el nom: ");
        nom = entrada.nextLine();
        System.out.print("Introdueix el primer cognom: ");
        cognom1 = entrada.nextLine();
        System.out.print("Introdueix el segundo cognom: ");
        cognom2 = entrada.nextLine();
        
        // Processar les cadenes i mostrar resultats
        codi = nom.substring(0, 3) + cognom1.substring(0, 3) + cognom2.substring(0, 3);
        System.out.println("El codi és " + codi.toUpperCase());

    }
    
}
