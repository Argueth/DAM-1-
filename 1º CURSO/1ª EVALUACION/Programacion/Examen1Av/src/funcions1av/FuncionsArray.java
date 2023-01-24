/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcions1av;

import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class FuncionsArray {
    
    
    public static void mostrarMatriu(int matriu[][]) {
        
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void ordenarFiles(int matriu[][]) {
        
        System.out.println("DESORDENADA");
        mostrarMatriu(matriu);
        
        System.out.println("");
        
        for (int i = 0; i < matriu.length; i++) {
            Arrays.sort(matriu[i]);
        }
        System.out.println("ORDENADA");
        mostrarMatriu(matriu);
    }
    
    public static void traspostaMatriu(int matriu[][]) {
        
        int trasposta[][] = new int [matriu[0].length][matriu.length];
        
        System.out.println("ORIGINAL");
        mostrarMatriu(matriu);
        System.out.println("");
        
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                trasposta[i][j] = matriu[j][i];
            }
        }
        
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = trasposta[i][j];
            }
        }
        
        System.out.println("TRASPOSTA");
        mostrarMatriu(matriu);
    }
}
