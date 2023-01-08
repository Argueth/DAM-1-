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
public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[2];
        
        System.out.print("Introduce los números del array: ");
        
        for (int i = 0; i < numeros.length; i++) {            
            numeros[i] = entrada.nextInt();
        }
        
        System.out.print("Los núemros del array son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        } 
        System.out.println();
    }
}
