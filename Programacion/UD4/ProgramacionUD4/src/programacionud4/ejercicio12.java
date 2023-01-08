/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud4;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ejercicio12 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        float numero1;
        
        System.out.println("Introduce un número.");
        numero1 = entrada.nextFloat();
        
        if(numero1 >= 0){
            System.out.println("El número " + numero1 + " es positivo.");
        }
        else{
            System.out.println("El número " + numero1 + " es negativo.");
        }
    }
}
