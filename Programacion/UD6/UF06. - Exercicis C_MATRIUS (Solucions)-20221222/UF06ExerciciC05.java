/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 5: Necessitem crear un programa per a registrar sous de dones i homes d'una empresa i
 * detectar si existeix bretxa salarial entre tots dos. El programa demanarà per teclat la
 * informació de N persones diferents (valor també introduït per teclat). Per a cada persona,
 * demanarà el seu gènere (0 per a home i 1 per a dona) i el seu sou. Aquesta informació ha
 * de guardar-se en una única matriu. Després es mostrarà per pantalla el sou mitjà de cada
 * gènere.
 */
public class UF06ExerciciC05 {
    public static void main(String[] args) {
        
        // Declaració de variables
        int persones, i, j, nhomes=0, ndones=0;
        float sumah=0, sumad=0;
        Scanner entrada = new Scanner(System.in);
        
        // Petició del número de persones a introduir sou
        System.out.print("Introdueix el nombre de persones: ");
        persones = entrada.nextInt();
        
        // Definir la matriu
        float sous[][] = new float[persones][2];        
        
        // Demanar dades
        for (i = 0; i < sous.length; i++) {
            // Per cada persona demanem el gènere i el sou
            for (j = 0; j < sous[0].length; j++) {
                if (j == 0) {
                    System.out.print("Indica el gènero (0 per a home y 1 per a dona) de la persona " + (i + 1) + ": ");
                    sous[i][j] = entrada.nextFloat();
                }
                if (j == 1) {
                    System.out.print("Indica el sou: ");
                    sous[i][j] = entrada.nextFloat();
                }
            }
        }    
        
        // Mostrem la matriu amb els gèneres i sous
        for (i = 0; i < sous.length; i++) {
            for (j = 0; j < sous[0].length; j++) {
                System.out.print(sous[i][j] + " ");
            }
            System.out.println("");
        }
        
        // Calculem la mitjana per gènere i mostrem resultats
        for (i = 0; i < sous.length; i++) {
            if (sous[i][0] == 0.0) {
                nhomes++;
                sumah += sous[i][1];
            }
            if (sous[i][0] == 1.0) {
                ndones++;
                sumad += sous[i][1];
            }
        }
        System.out.println("El sueldo medio de los varones es: " + (sumah / nhomes));
        System.out.println("El sueldo medio de las mujeres es: " + (sumad / ndones));        
    }
}
