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
public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n, m;
        
        System.out.print("Introduce el tamaño que deseas para el array: ");
        n = entrada.nextInt();
        
        System.out.print("Introduce el valor que deseas que tengan todos sus componentes: ");
        m = entrada.nextInt();
        
        int a[] = new int[n];
        
        Arrays.fill(a, m);
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        entrada.close();
    }
}
