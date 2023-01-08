/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;

/**
 * Crea un programa que cree dos arrays d'enters de grandària 10. Després introduirà en el
 * primer array tots els valors de l'1 al 10. Finalment, haurà de copiar tots els valors del
 * primer array al segon array en ordre invers, i mostrar tots dos per pantalla.
 */
public class UF06ExerciciA11 {
    public static void main (String[] args){
        
        // Declaració de variables
        final int MAXIM=10;
        int i, j;
        int vector1[] = new int[MAXIM];
        int vector2[] = new int[MAXIM];
        
        // Carrega de dades en el primer vector
        for (i=0; i<vector1.length; i++){
            vector1[i]=i+1;
        }
        
        // Copia de dades en sentit inver en el segon vector
        for (i=0; i<vector1.length; i++){
            vector2[i]=vector1[vector1.length-i-1];
        }
        
        // Mostrar informació per pantalla
        System.out.print("Vector 1: ");
        for (i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.println();
        
        System.out.print("Vector 2: ");
        for (i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.println();
    }
}
