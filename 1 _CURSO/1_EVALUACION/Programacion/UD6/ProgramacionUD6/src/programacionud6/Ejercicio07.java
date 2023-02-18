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
public class Ejercicio07 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int P, Q;
        
        do {
            System.out.print("Introduce el primer valor del array: ");
            P = entrada.nextInt();
        
            System.out.print("Introduce el último valor del array: ");
            Q = entrada.nextInt();
        
            if (Q<P) {
                System.out.print("Q debe ser mayor que P.");
            }
        } while (Q<=P);
        
        
        int array[] = new int[Q-P+1];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = P+i;
            System.out.print(array[i] + " ");
        }
        
        entrada.close();
    }
}
