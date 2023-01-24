/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosUD7;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio21 {
    
    public static void main(String[] args) {
        
        double r = 0;
        int opcion = 0; 
        
        opcion = menu();
        r = demanaRadi();
        
        if (opcion == 1) {
            System.out.printf("La circunferencia es %.2f", circunferencia(r));
        }else {
            System.out.printf("El área es %.2f", area(r));
        }
    }
    
    public static int menu(){
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        boolean valido = false;
        
        do {
            System.out.println("Elige la opción deseada:");
            System.out.println("1. Circunferencia");
            System.out.println("2.¨Área");
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
            }
            if (opcion>0 && opcion<3) {
               valido = true;
               break;
            }
            System.out.println("ERROR");
        } while (valido == false);
        
        return opcion;
    }
    
    public static double demanaRadi() {
        
        Scanner entrada = new Scanner(System.in);
        
        double r = 0;
        boolean valido = false;
        
        while (!valido) {
            System.out.println("Introduce el radio");
            if (entrada.hasNextDouble()) {
                r = entrada.nextDouble();
                valido = true;
            }else {
                entrada.nextLine();
            }
        }
        
        return r;
    }
    
    public static double area (double r) {
        
        double a;
        
        a = Math.PI * Math.pow(r, 2);
        
        return a;        
    }
    
    public static double circunferencia (double r) {
        
        double circun;
        
        circun = 2 * Math.PI * r;
        
        return circun;
    }
}
