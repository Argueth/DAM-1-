/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud6;

/**
 *
 * @author pablo
 */
public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        final int MAXIM = 10;
        int elementos, posicion;
        
        elementos = 0;
        for (int i = 1; i < MAXIM; i++) {
            elementos += i;
        }
        
        int vector[] = new int[elementos];
        posicion = 0;
        
        for (int i = 1; i <= 10; i++) {
            
            for (int j = 1; j < i; j++) {
                vector[posicion] = i;
                posicion++;
            }
        }
        System.out.println("Valores: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
