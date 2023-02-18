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
public class Ejercicio22 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n, ast = 1;
               
        System.out.println("Introduce el número de pisos que quieres que tenga tu pirámide.");
        n = entrada.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ast; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
            ast += 2;
        }
    }
}
