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
public class Ejercicio08 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double b[] = new double[100];
        double numero;
        double suma;
        
        for (int i = 0; i < b.length; i++) {
            b[i] = Math.random();
        }
        
        System.out.println("Introduce un nçumero entre 0,0 y 1,0: ");
        numero = entrada.nextFloat();
        
        suma = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > numero) {
                suma++;
            }
        }
        System.out.println("Hay " + suma + " números mayores que " + numero + ".");
    }
}
