/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici C 04: Programa per a emmagatzemar les notes de 4 estudiants (anomenats
 * “Estudiant 1”, “Estudiant 2”, etc.) i 5 assignatures. L'usuari introduirà les notes per teclat i
 * després el programa mostrarà la nota mínima, màxima i mitjana de cada estudiant
 */
public class UF06ExerciciC04 {

    public static void main(String[] args) {

        // Declaració de variables
        final int ESTUDIANTS=4, ASSIGNATURES=5;
        int i, j;
        float minima, maxima, suma;
        float notes[][] = new float[ESTUDIANTS][ASSIGNATURES];
        Scanner entrada = new Scanner(System.in);

        // Petició de dades i creació de la matriu
        for (i = 0; i < notes.length; i++) {
            System.out.println("Introdueix les notes de l'estudiant " + (i+1));
            minima=10;
            maxima=0;
            suma=0;
            for (j = 0; j < notes[i].length; j++) {
                System.out.print("Nota assignatura " + (j+1) + ": ");
                notes[i][j] = entrada.nextFloat();
                suma += notes[i][j];
                if (notes[i][j]>maxima) maxima=notes[i][j];
                if (notes[i][j]<minima) minima=notes[i][j];
            }
            System.out.println("La nota mínima de l'alumne "+(i+1)+" és: " + minima);
            System.out.println("La nota màxima de l'alumne "+(i+1)+" és: " + maxima);
            System.out.println("La nota mitjana de l'alumne "+(i+1)+" és: " + suma/ASSIGNATURES);
        }
    }
}
