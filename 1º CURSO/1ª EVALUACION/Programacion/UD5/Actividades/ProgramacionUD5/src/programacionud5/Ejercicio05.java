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
public class Ejercicio05 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int fac = 1, num;
        
        System.out.print("Introduzca un número entero: ");
        num = entrada.nextInt();
           
        while (num > 0){
                fac = fac * num;
                num--;
        }   
        System.out.println("El factorial del número " + num + " es " + fac + ".");
    }
}
