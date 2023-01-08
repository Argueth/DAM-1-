/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio20 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[1000];
        int valor, posicion, suma;
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100);
        }
        
        System.out.print("Introduce un valor entre 0 y 99 para buscar: ");
        Arrays.sort(vector);
        valor = entrada.nextInt();
        
        posicion = Arrays.binarySearch(vector, valor);
        
        if (posicion>=0) {
            suma = 0;
            for (int i = posicion; i < vector.length; i++) {
                if (vector[i] == valor) {
                    suma++;
                }
            }
            System.out.println("El valor " + valor + " aparece " + suma + " veces.");
        }else {
            System.out.println("El valor indicado no existe en el vector.");
        }
    }
}
