/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud7;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio04 {
    
    public static void main(String[] args) {
        
        int a;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce un numero entero: ");
        a = entrada.nextInt();
        
        switch (dimeSigno(a)) {
            case 1:
                System.out.println("El número es positivo.");
                break;
            case 0:
                System.out.println("el número es igual a cero.");
                break;
            case -1:
                System.out.println("El número es negativo.");
                break;
        }       
    }
    
    public static int dimeSigno(int a) {
        
        int resultado;
        
        if (a == 0) {
            resultado = 0;
        }else if (a > 0) {
            resultado = 1;
        }else {
            resultado = -1;
        }
        
        return resultado;
    }
}
