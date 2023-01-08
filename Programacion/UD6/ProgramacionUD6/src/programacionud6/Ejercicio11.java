/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud6;

/**
 *
 * @author pablo
 */
public class Ejercicio11 {
    
    public static void main(String[] args) {
        
        int a[] = new int[10];
        int b[] = new int[10];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        
        for (int i = 0; i<a.length; i++) {
            b[i] = a[a.length - i -1];
        }
        
        for (int i = 0; i < a.length; i++) {
           System.out.print(a[i] + " "); 
        }
        
        System.out.println();
        
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        
    }    
}
