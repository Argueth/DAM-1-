/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici C 03: Programa que cree una matriu de grandària NxM (grandària introduïda per teclat) i
 * introduïsca en ella NxM valors (també introduïts per teclat). Després haurà de recórrer la
 * matriu i al final mostrar per pantalla quants valors són majors que zero, quants són menors
 * que zero i quants són igual a zero
 */
public class UF06ExerciciC03 {

    public static void main(String[] args) {

        // Declaració de variables
        int n, m, i, j, menors=0, majors=0, zero=0;
        Scanner entrada = new Scanner(System.in);

        // Petició de dades i creació de la matriu
        System.out.print("Introdueix el nombre de files: ");
        n = entrada.nextInt();
        System.out.print("Introdueix el nombre de columnes: ");
        m = entrada.nextInt();
        int matriu[][] = new int[n][m];        

        // Carregar dades en la matriu i calcula els resultats
        for (i = 0; i < matriu.length; i++) {
            for (j = 0; j < matriu[i].length; j++) {
                System.out.print("Introdueix valor de fila " + (i + 1) + " columna " + (j + 1) + ": ");
                matriu[i][j] = entrada.nextInt();
                if (matriu[i][j] < 0) {
                    menors++;
                } else {
                    if (matriu[i][j] > 0) {
                        majors++;
                    } else {
                        zero++;
                    }
                }
            }
        }

        // Mostrar els resultats
        System.out.println(" Números majors que zero: " + majors);
        System.out.println(" Números menors que zero: " + menors);
        System.out.println(" Números iguals a zero: " + zero);
    }
}
