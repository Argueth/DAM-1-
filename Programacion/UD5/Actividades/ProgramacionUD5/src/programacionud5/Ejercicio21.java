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
public class Ejercicio21 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2 = 0, pares = 0;
        
        System.out.println("Introduce un número.");
        n1 = entrada.nextInt();
        
        while (n2 < n1) {
            System.out.println("Introduce otro número mayor que el anterior");
            n2 = entrada.nextInt();
        }
        
        for (int i = n1; i <= n2; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                pares++;
            }
        }
        System.out.println(" ");
        System.out.println("La cantidad de pares es: " + pares);
    }
}
