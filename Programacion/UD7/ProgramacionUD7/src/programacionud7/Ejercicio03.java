/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud7;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a, b;
        
        System.out.print("Introduce un número: ");
        a = entrada.nextInt();
        
        System.out.print("Introduce otro número: ");
        b = entrada.nextInt();
        
        System.out.println("El menor de los dos es " + minimo(a, b));
    }
    
    public static int minimo(int a, int b) {
        
        int min;
        
        if (a < b) {
            min = a;
        }else {
            min = b;
        }
        
        return min;
    }
}
