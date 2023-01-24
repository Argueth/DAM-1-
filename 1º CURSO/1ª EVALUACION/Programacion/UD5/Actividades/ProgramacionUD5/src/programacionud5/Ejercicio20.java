/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud5;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio20 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, i = 1, j = 1;
        
        System.out.println("Introduce un número entero.");
        numero = entrada.nextInt();
        
        while (j <= numero){    
            for (i = 1; i <= j; i++) {
                System.out.print(i + (" "));
            }
            if (numero < 0) {
                System.out.println("");
            }
            System.out.println();
            j++;
        }
    }
}
