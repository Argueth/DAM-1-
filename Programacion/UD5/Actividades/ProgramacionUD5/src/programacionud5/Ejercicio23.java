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
public class Ejercicio23 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n;
        
        //pidiendo los datos
        do {
            System.out.println("Introduzca el número de pisos que quiere que tenga su pirámide.");
            n = entrada.nextInt();
            if (n < 0 || n > 9) {
                System.out.println("El número no es correcto.");
            }
        } while (n < 0 || n > 9);
        
        //montando la pirámide
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            for (int k = i-1; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.println(" ");
        }
    }
}
