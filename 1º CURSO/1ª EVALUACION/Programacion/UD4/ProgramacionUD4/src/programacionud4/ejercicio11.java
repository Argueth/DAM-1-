/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud4;

import java.util.Scanner;


public class ejercicio11 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        float numero1, numero2;
        
        System.out.println("Introduce el primer número");
        numero1 = entrada.nextFloat();
        
        System.out.println("Introduce el segundo número");
        numero2 = entrada.nextFloat();
        
        if(numero1 > numero2){
            
            System.out.println("El mayor número es " + numero1);
        }
        else{
            System.out.println("El mayor número es " + numero2);
        }
    }
}
