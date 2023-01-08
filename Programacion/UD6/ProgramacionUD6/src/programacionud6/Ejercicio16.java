/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud6;

import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class Ejercicio16 {
    
    public static void main(String[] args) {
        
        final int MAXIM = 10;
        int elementos, posicion;
        
        elementos = 0;
        for (int i = 0; i < MAXIM; i++) {
            elementos += i;
        }
        
       int vector[] = new int[elementos];
       
       posicion = 0;
       
        for (int i = 1; i < 10; i++) {
            Arrays.fill(vector, posicion, posicion+i, i);  
            posicion += i;
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
