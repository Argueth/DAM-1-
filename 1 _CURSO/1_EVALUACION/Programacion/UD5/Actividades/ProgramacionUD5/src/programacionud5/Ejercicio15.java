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
public class Ejercicio15 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int cant, mult = 0;
        
        System.out.println("Introduzca un número entero.");
        cant = entrada.nextInt();
        
        while (cant >= 3) {
            if (cant % 3 == 0) {
                mult++;                
            }
            cant--;
        }
        
        System.out.println("Cantidad de múltiplos de 3: " + mult);
    }
}
