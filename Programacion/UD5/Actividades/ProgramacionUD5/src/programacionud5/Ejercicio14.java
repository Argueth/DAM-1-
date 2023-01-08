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
public class Ejercicio14 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int cantidad, b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, resto = 0;
        
        do {                    
            System.out.println("Introduce una cantidad de euros que sea múltiplo de 5");
            cantidad = entrada.nextInt();        
        } while (cantidad % 5 != 0);
        
        resto = cantidad;
        
        System.out.println("La cantidad " + cantidad + " será entregada con:");
        
        while (resto > 0 && resto > 500) {
            b500 = b500 + 1;
            resto = resto - 500;
        }
        
        System.out.println(b500 + " billetes de 500€");
        
        while (resto >0 && resto > 200) {
            b200 = b200 + 1;
            resto = resto - 200;
        }
        
        System.out.println(b200 + " billetes de 200€");
        
        while (resto > 0 && resto > 100) {
            b100 = b100 + 1;
            resto = resto - 100;
        }
        
        System.out.println(b100 + " billetes de 100€");
        
        while (resto > 0 && resto > 50) {
            b50 = b50 +1;
            resto = resto - 50;
        }
        
        System.out.println(b50 + " billetes de 50€");
        
        while (resto > 0 && resto >20) {
            b20 = b20 + 1;
            resto = resto - 20;
        }
        
         System.out.println(b20 + " billetes de 20€");
        
        while (resto > 0 && resto > 10) {
            b10 = b10 + 1;
            resto = resto - 10;
        }
        
        System.out.println(b10 + " billetes de 10€");
        
        while (resto > 0 && resto > 5) {
            b5 = b5 + 1;
            resto = resto - 5;
        }
        
        System.out.println(b5 + " billetes de 5€");                      
    }
}
