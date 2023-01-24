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
public class Ejercicio13 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int num = 50;
        char resp;
        boolean encontrado = false;
        System.out.println("Piensa un número entre el 1 y el 100 e intentaré averiguarlo.");
        System.out.println("Tan solo guíame y dime si el número que te muestre es mayor o menor que el que has pensado.");
        
        do {
            System.out.println(num + " ¿Es este el número?");
            
            resp = entrada.next().charAt(0);
            
            switch (resp) {
                case '>':
                    num = num + 1;
                    break;
                case '<':
                    num = num - 1;
                    break;
                case '=':
                    encontrado = true;
            }
        } while (encontrado==false);
        
        System.out.println("¡Lo sabía! LO ENCONTRE!!!");
    }
}
