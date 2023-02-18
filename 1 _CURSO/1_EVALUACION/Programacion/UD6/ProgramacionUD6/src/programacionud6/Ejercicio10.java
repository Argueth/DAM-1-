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
public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n;
        float max = Float.MIN_VALUE;
        float min = Float.MAX_VALUE;
        float suma = 0;
        
        System.out.print("Introduce cuántas alturas queires almacenar: ");
        n = entrada.nextInt();
        
        float alturas[] = new float[n];
        
        for (int i = 0; i < alturas.length; i++) {
            System.out.println("Introduce la nueva altura: ");
            alturas[i] = entrada.nextFloat();
            suma += alturas[i];
            if (alturas[i] < min) {
                min = alturas[i];
            }else if (alturas[i] > max) {
                max = alturas[i];
            }
        }
        
        float media = suma / alturas.length;
        int altas = 0, bajas = 0;
        
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] > media) {
                altas++;
            }else if (alturas[i] < media) {
                bajas++;
            }
        }
        
        System.out.println("La altura máxima es " + max + ", la altura míniuma es " + min + " y la media es " + media + ".");
        System.out.println("Hay " + altas + " personas por encima de la media y " + bajas + " por debajo de la media. ");
    }
}
