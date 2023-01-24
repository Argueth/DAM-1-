/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Arrays;
import java.util.Scanner;
/**
 * UF06 Exercici 17: Programa que demana a l'usuari 20 valors enters i introdueix els 10 primers en
 * un array i els 10 últims en un altre array. Finalment, compararà tots dos arrays i li diu
 * a l'usuari si són iguals o no
 */
public class UF06ExerciciA17 {
        
    public static void main(String[] args) {
        
        // Declaració de variables
        final int TAMANY=10;
        int i;        
        int v1[] = new int[TAMANY];
        int v2[] = new int[TAMANY];
        Scanner entrada = new Scanner(System.in);

        // Petició de dades
        for (i = 0; i < v1.length; i++) {
            System.out.print("Introdueix el valor " + (i+1) + " del vector 1: ");
            v1[i] = entrada.nextInt();
        }
        for (i = 0; i < v2.length; i++) {
            System.out.print("Introdueix el valor " + (i+1) + " del vector 2: ");
            v2[i] = entrada.nextInt();
        }

        // Comparem si són iguales
        if (Arrays.equals(v1, v2)) {
            System.out.println("Són iguals");
        } else {
            System.out.println("No són iguals");
        }

    }

    
}
