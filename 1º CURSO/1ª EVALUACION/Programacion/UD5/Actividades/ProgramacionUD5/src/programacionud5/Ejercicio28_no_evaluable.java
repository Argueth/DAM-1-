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
public class Ejercicio28_no_evaluable {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n;
        
        do {
            System.out.println("Introduce el número entero positivo mayor que 1 desde el que quieres comenzar la sucsión: ");
            n = entrada.nextInt();
        } while (n < 1);
        
        System.out.print(n + ", ");
        
        while (n > 2) {
            if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + ", ");
            }else{
                n = (n * 3) + 1;
                System.out.print(n + ", ");
            }
        }
        System.out.println("1.");
    }
}
