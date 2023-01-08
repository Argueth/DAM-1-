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
public class Ejercicio13 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int valor, incremento, n;
        
        System.out.print("Introduzca el valor inicial: ");
        valor = entrada.nextInt();
        
        System.out.print("Introduzca el incremento de la serie: ");
        incremento = entrada.nextInt();
        
        System.out.print("Introduzca el número de valores a crear: ");
        n = entrada.nextInt();
        
        int a[] = new int[n];
        
        for (int i = 0; i < a.length; i++) {
            a[i] = valor + (i * incremento);
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        entrada.close();
    }
}
