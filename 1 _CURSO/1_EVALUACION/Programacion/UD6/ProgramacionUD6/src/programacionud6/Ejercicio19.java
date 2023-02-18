/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio19 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int puntuaciones[] = new int[8];
        
        System.out.print("Introduce las puntuaciones del os jugadores: ");
        for (int i = 0; i < puntuaciones.length; i++) {
            puntuaciones[i] = entrada.nextInt();
        }
        
        Arrays.sort(puntuaciones);
        
        int descend[] = new int[8];
        
        for (int i = 0; i < puntuaciones.length; i++) {
            descend[i] = puntuaciones[puntuaciones.length - i - 1];
        }
        
        for (int i = 0; i < descend.length; i++) {
            System.out.print(descend[i] + " ");
        }
    }
}
