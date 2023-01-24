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
public class Ejercicio21b {
    public static void main(String[] args) {
        
        double r = 0;
        int opcion = 0; 
        
        do {
            opcion = menu();
            if (opcion !=5) {
                switch (opcion) {
                    case 1:
                        r = demanaRadi();
                        System.out.printf("La circunferencia es %.2f%n", circunferencia(r));
                        break;
                    case 2:
                        r = demanaRadi();
                        System.out.printf("El área es %.2f%N", area(r));
                        break;
                    case 3:
                        r = demanaRadi();
                        System.out.printf("El volumen es %.2f%n", volumen(r));
                        break;
                    case 4:
                        r = demanaRadi();
                        System.out.printf("La circunferencia es %.2f %nEl área es %.2f %nEl volumen es %.2f%n", circunferencia(r), area(r), volumen(r));
                        break;
                }
            }else {
                System.out.println("ADIOS. GRACIAS POR PARTICIPAR");   
                }
            
            System.out.println("");
        } while (opcion != 5);
            
        
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
            System.out.println("4. Todas");
            System.out.println("5. Salir");
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
            }
            if (opcion>0 && opcion<6) {
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
