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
public class Ejercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double a, b;
        
        System.out.print("Introduce el primer números: ");
        a = entrada.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        b = entrada.nextDouble();
        
        System.out.println("El resultado de la multiplicación es: " + multiplica (a, b));
    }
    
    public static double multiplica (double a, double b) {
        
        double resultado = a * b;
        
        return resultado;
    }
}
