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
public class Ejercicio12 {
    
   public static void main(String[] args) {
       
       Scanner entrada = new Scanner(System.in);
       
        int base, exp,potencia = 1;
       
        System.out.println("Introduz<ca la base de la poteencia que quiere calcular: ");
        base = entrada.nextInt();
       
        System.out.println("Ahora introduzca el exponente: ");
        exp = entrada.nextInt();
       
        if (exp < 1){
            potencia = 1;
        }
        
        for (int i = 1; i <= exp; i++){
            potencia = potencia * base;
        }
        
        System.out.println(base + " elevado a " + exp + " = " + potencia);
    }
}

