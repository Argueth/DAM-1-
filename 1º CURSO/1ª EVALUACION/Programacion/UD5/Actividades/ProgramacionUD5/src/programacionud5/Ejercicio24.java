/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud5;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio24 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        long n, aux, reves;
        int longi, i, digito, suma;
        
        System.out.println("Introduce un número positivo.");
        n = entrada.nextLong();
        
        aux = n;
        longi = 0;
        reves = 0;
        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux = aux / 10;
            longi++;
        }
        
        System.out.print("Dígitos pares: ");
        
        suma = 0;
        for (i = 0; i < longi; i++) {
            digito = (int) (reves % 10);
            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                suma = suma + digito;
            }
            reves = reves / 10;
        }
        
        System.out.println();
        System.out.println("La suma de los dígitos pares es : " + suma);
    }
}
