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
public class Ejercicio17 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a[] = new int[10];
        int b[] = new int[10];
        
        System.out.print("Introduce 20 numeros entero: ");
        
        for (int i = 0; i < a.length; i++) {
            a[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < b.length; i++) {
            b[i] = entrada.nextInt();
        }
        
        if (Arrays.equals(a, b)) {
            System.out.println("Son iguales");
        }else {
            System.out.println("No son iguales");
        }
        entrada.close();
    }
}
