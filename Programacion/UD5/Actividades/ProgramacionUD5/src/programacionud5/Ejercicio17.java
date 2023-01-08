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
public class Ejercicio17 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2 = 1, fallos = 0, ntotal = 1;
        
        System.out.println("Introduzca un número entero.");
        n1 = entrada.nextInt();
        
        do{
            System.out.println("Introduzca otro número");
            n2 = entrada.nextInt();
            if (n2 < n1) {
                System.out.println("FALLO, es menor.");
                fallos++;
            }
            ntotal++;
        } while (n2 != 0);
        
        System.out.println("Total de número introducidos: " + ntotal);
        System.out.println("Números fallados: " + fallos);
    }    
}
