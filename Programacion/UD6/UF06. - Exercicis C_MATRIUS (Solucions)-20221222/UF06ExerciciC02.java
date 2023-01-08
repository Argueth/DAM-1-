/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;

/**
 * UF06 Exercici C 02: Programa que cree una matriu de 10x10 i introduïsca els valors de les taules de
 * multiplicar de l'1 al 10 (cada taula en una fila). Després mostrarà la matriu per pantalla.
 */
public class UF06ExerciciC02 {

    public static void main(String[] args) {

        // Declaració de variables
        int matriu[][] = new int[10][10];
        
        // Processar les taules de multiplicar
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", matriu[i][j]);
            }
            System.out.println("");

        }

    }
    
}
