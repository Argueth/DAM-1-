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
public class Ejercicio02 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float numeros[] = new float[2];
        float suma = 0;
        
        System.out.print("Introdsucza dos números reales: ");
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextFloat();
            suma += numeros[i];
        }
        
        System.out.println("La suma de los números es " + suma);
    }
}
