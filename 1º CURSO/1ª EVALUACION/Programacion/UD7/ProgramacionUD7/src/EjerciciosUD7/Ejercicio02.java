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
public class Ejercicio02 {
    
    public static boolean esMayorEdad(int a) {
        
         boolean mayorEdad = false;
        
        if (a >= 18) {
            mayorEdad = true;
        }
        
        return mayorEdad;
    }
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a;
        
        System.out.println("Introduce tu edad: ");
        a = entrada.nextInt();
        
        if (esMayorEdad(a)) {
            System.out.println("Eres mayor de edad.");
        }else {
            System.out.println("No eres menor de edad.");
        }
    }
    
    
}
