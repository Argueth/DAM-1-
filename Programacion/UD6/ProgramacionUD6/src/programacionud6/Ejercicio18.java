/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud6;

/**
 *
 * @author pablo
 */
public class Ejercicio18 {
    
    public static void main(String[] args) {
        
        int vector[] = new int[30];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*10);
        }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
