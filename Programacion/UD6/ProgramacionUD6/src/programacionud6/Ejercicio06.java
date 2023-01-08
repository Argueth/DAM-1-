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
public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int N, M;
        
        System.out.print("Introduzca el tamaño de larray");
        N = entrada.nextInt();
        
        int numeros[] = new int[N];
        
        System.out.print("Introduce el valor con el que quieres llenar el array.");
        M = entrada.nextInt();
        
        Arrays.fill(numeros,M);
        
        System.out.println();
        
        for (int i = 0; i < N; i++) {
            System.out.print(numeros[i]);
        }
    }
}
