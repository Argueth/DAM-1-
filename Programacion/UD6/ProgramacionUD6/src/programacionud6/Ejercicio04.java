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
public class Ejercicio04 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[20];
        int suma_positivos = 0;
        int suma_negativos = 0;
        
        System.out.println("Introduce " + numeros.length + " números.");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el elemento " + (i+1) + " del array: ");
            numeros[i] = entrada.nextInt();
            if (numeros[i] > 0) {
                suma_positivos += numeros[i];
            }else {
                suma_negativos += numeros[i];
            }
        }
        
        System.out.println("La suma de los números positivos es " + suma_positivos);
        System.out.println("La suma de los números negativos es " + suma_negativos);
    }
}
