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
public class Ejercicio21a {
    
    public static void main(String[] args) {
        
        double r = 0;
        int opcion = 0; 
        
        opcion = menu();
        r = demanaRadi();
        
        switch (opcion) {
            case 1:
                System.out.printf("La circunferencia es %.2f", circunferencia(r));
                break;
            case 2:
                System.out.printf("El área es %.2f", area(r));
                break;
            case 3:
                System.out.printf("El volumen es %.2f", volumen(r));
                break;
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
            System.out.println("3. Volumen");
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
            }
            if (opcion>0 && opcion<4) {
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
    
    public static double volumen (double r) {
        
        double volumen;
        
        volumen = (4/3) * Math.PI * Math.pow(r, 3);
        
        return volumen;
    }
}
