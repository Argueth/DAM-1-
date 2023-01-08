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
public class Ejercicio03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float numeros[] = new float[2];
        float min;
        float max;
        
        
        System.out.println("Introduzca dos numeros reales: ");
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextFloat();
        }
        if (numeros[0] < numeros[1]) {
            min =numeros[0];
            max = numeros[1];
        }else {
            min = numeros[1];
            max = numeros[0];
        }
    
        System.out.println("el máximo es " + max + " y el mínimo es " + min + ".");
    }
}
