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
public class Ejercicio26 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n, aux, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, cantidad=0, suma=0;
        boolean primo=true;
        
        do {
            System.out.print("Introduce un número: ");
            if (entrada.hasNextInt()) {
                n = entrada.nextInt();
                
                primo = true;
                aux = 2;
                while ((aux <= n/2) && (primo)) {
                    if (n % aux == 0) {
                        primo = false;
                    }
                    aux++;
                }
                
                if (!primo) {
                    suma = suma + n;
                    max = n > max ? n : max;
                    min = n < min ? n : min;
                    cantidad++;
                }
            }
        } while (!primo);
        
        System.out.println("Has introducido " + cantidad + " números.");
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + (double)suma / cantidad);
    }
}
