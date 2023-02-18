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
public class Ejercicio28matrices {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n, m, valor;
        int suma_cero, suma_pos, suma_neg;
        
        System.out.print("Introduce el número de columnas que quieres  que tenga la matriz: ");
        n = entrada.nextInt();
        
        System.out.print("Introduce el número de columnas que quieres que tenga la matriz: ");
        m = entrada.nextInt();
        
        int matriz[][] = new int[n][m];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Introduce el valor " + i + "-" + j);
                valor = entrada.nextInt();
                matriz[i][j] = valor;
            }
        }
        suma_pos = 0;
        suma_neg = 0;
        suma_cero = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    suma_neg++;
                }else if (matriz[i][j] > 0) {
                    suma_pos++;
                }else {
                    suma_cero++;
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("En la matriz hay " + suma_cero + " ceros " + ", " + suma_pos + " números positivos y " + suma_neg + " números negativos.");
    }
}
