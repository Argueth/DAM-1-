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
public class Ejercicio19 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Introduce un número entero.");
        numero = entrada.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            System.out.print("* ");
        }
        if (numero < 0) {
            System.out.println("");
        }
    }
}
