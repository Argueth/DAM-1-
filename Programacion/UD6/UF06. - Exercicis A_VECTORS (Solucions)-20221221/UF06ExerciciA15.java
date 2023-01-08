/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Arrays;
import java.util.Scanner;
/**
 * UF06 Exercici 15: Programa que demana a l’usuari dos valors N i M i després crea un array de
 * grandària N que conté M en totes les seues posicions. Després es mostra l'array per pantalla
 */
public class UF06ExerciciA15 {

    public static void main(String[] args) {
        
        // Declaració de variables
        int n, m;
        String vectorString;
        Scanner entrada = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix tamany del vector: ");
        n = entrada.nextInt();
        System.out.print("Introdueix valor que contindrá: ");
        m = entrada.nextInt();

        // Creació de l'array
        int vector[] = new int[n];
        
        // Inserir el valor en totes les posicions
        Arrays.fill(vector, m);

        // Mostrem l'array
        vectorString = Arrays.toString(vector);
        System.out.println("Vector: " + vectorString);
    }
}
