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
public class ejercicio14 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        float numero1, numero2;
        
        System.out.println("Introduce los dos números que quieres comparar.");
        
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
        
        if (numero1>=numero2&&numero1<=numero2) {
            System.out.println("Los dos números son iguales.");
        }
        else{
            if(numero1 > numero2){
                System.out.println(numero1 + " es el mayor.");
            }
            else {
                System.out.println(numero2 + " es el mayor.");
            }
        }
    }
}
