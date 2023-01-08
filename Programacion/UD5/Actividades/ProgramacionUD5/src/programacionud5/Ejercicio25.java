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
public class Ejercicio25 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        long n, aux, reves;
        
        System.out.println("Introduzca un númermo entero positivo.");
        n = entrada.nextLong();
        
        aux = n;
        reves = 0;
        while (aux > 0) {
            reves = (reves * 10) + (aux % 10);
            aux = aux / 10;
        }
        
        if (reves == n) {
            System.out.println("El núnmero es capicua.");
        }
        else {
            System.out.println("El número no es capicua.");
        }
    }
}
