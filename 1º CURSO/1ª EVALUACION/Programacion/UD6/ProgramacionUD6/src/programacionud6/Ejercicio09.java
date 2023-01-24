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
public class Ejercicio09 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int valores[] = new int[100];
        int n;
        
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (1+Math.random()*10);
        }
        
        do {
            System.out.print("Introduce qué valor quieres que busque: ");
        n = entrada.nextInt();
        } while (n<1 || n>10);
        
        
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == n) {
                System.out.print(i + " ");
            }
        }
    }
}
