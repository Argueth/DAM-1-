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
public class Ejercicio16 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int j = 2, numero;
        boolean primo = true;
        
        System.out.println("Introduzca un número entero: ");
        numero = entrada.nextInt();
        
        while (j <= numero/2 && primo == true) {
            if (numero % j == 0){
                primo = false;
            }
            j++;
        }
        
        if (primo == true){
            System.out.println("Es primo.");
        }
        else if (primo == false){
            System.out.println("No es primo.");
        }
    }
}
