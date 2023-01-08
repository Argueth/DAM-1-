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
public class Ejercicio04 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int max;
        
        System.out.print("Introduzca un número entero: ");
        max = entrada.nextInt();
        
        for (int i = 1; i <= max; i++){
            System.out.println(i);
        }
    }
}
