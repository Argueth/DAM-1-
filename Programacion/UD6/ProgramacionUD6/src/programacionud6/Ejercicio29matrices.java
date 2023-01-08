/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud6;

import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ejercicio29matrices {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float notas[][] = new float[4][5];
        float suma, max, min;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Introduce las notas del alumno " + (i+1));
            suma = 0;
            min = 10;
            max = 0;
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("nota de la asignatura" + (j+1) + ": ");
                notas[i][j] = entrada.nextFloat(); 
                suma += notas[i][j];
                if (notas[i][j] > max) max = notas[i][j];
                if (notas[i][j] < min) min = notas[i][j];
            }
            System.out.println("La nota máxima del alumno " + (i+1) + " es: " + max);
            System.out.println("La nota mínima del alumno " + (i+1) + " es: " + min);
            System.out.println("La nota media del alumno " + (i+1) + " es: " + (suma/notas[i].length));
        }
        
    }
}
