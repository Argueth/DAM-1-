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
public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double numeros[] = new double[20];
        double suma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el valor " + (i+1) + " para hacer la media: ");
            numeros[i] = entrada.nextDouble();
            suma += numeros[i];
        }
        
        System.out.println("La media es " + (suma/numeros.length) + ".");
    }
}
