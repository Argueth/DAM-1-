/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosUD7;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num = 0;
        boolean valido = false;
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%02d x %02d = %02d %n", i, j, (i*j));
                if (j == 10) {
                    System.out.println("");
                }
            }
        }
        do {
           System.out.println("Dime un número entero para mostrarte su tabla de multiplicar");
            if (entrada.hasNextInt()) {
                num = entrada.nextInt();
                valido = true;
            } 
        } while (valido = false);
        
        tabla (num);
    }
    
    public static void tabla (int num) {
        
        for (int i = 1; i < 10; i++) {
            System.out.printf("%02d x %02d = %02d %n", num, i, (num*i));
        }
    }
}
