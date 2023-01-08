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
public class ejercicio15 {
    public static void main(String[] args){
        
        Scanner entrada =new Scanner(System.in);
        
        float numero1, numero2, numero3;
        
        System.out.println("Introduzca tres números.");
        
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
        numero3=entrada.nextFloat();
        
        if(numero1==numero2){
            System.out.println(numero1 + " y " + numero2 + "son iguales.");
        }
        else{
            if(numero1>numero2){
                if(numero1==numero3){
                   System.out.println(numero1 + " y " + numero3 + "son iguales.");
                }
                else{
                    if(numero1>numero3){
                        System.out.println(numero1 + " es el mayor de los 3.");
                    }
                    else{
                        System.out.println(numero3 + " es el mayor de los 3.");
                    }
                }
            }
            else{
                if(numero2==numero3){
                    System.out.println(numero2 + " y " + numero3 + "son iguales.");
                }
                else{
                    if(numero2>numero3){
                        System.out.println(numero2 + " es el mayor de los 3.");
                    }
                    else{
                        System.out.println(numero3 + " es el mayor de los 3.");
                    }
                }
            }
        }
    }
}
