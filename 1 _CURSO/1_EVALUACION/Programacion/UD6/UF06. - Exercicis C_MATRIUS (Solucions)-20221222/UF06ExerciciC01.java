/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;

/**
 * UF06 Exercici C 01: Programa que cree una matriu de grandària 5x5 que emmagatzeme els números
 * de l'1 al 25 i després mostre la matriu per pantalla.
 */
public class UF06ExerciciC01 {

    public static void main(String[] args) {

        // Declaració de variables
        int valor = 1;
        int matriu[][] = new int[5][5];
        
        // Carrega de dades en la matriu
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = valor++;
                System.out.printf("%4d", matriu[i][j]);
            }
            System.out.println("");

        }

    }
    
}
