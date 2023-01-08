/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud6;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio12 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int a[] = new int[10];
        int valor, posicion;
        boolean continuar=true;
        String opcion;
        
        while (continuar) {
            
            System.out.println("MENU PRINCIPAL");
            System.out.println("Escoge una opción:");
            System.out.println("a: Mostras valortes");
            System.out.println("b: Introducir valor");
            System.out.println("c: salir");
            
            opcion = entrada.nextLine();
            
            switch (opcion) {
                
                case "a":
                    for (int i = 0; i < a.length; i++) {
                        System.out.print(a[i] + " ");
                    }
                    break;
                    
                case "b":
                    System.out.println("Introduce el valor deseado: ");
                    valor = entrada.nextInt();
                    System.out.println("Introduce la posición deseada: ");
                    posicion = entrada.nextInt();
                    if (posicion<0 || posicion>a.length) {
                        System.out.println("Posición no válida");
                    }else
                    a[posicion] = valor;
                    entrada.nextLine();
                    break;
                    
                case "c":
                    System.out.println("Fin del programa. ");
                    continuar=false;
                    break;
                    
                default:
                    System.out.println("Opción no válida. ");
            }
        }
        entrada.close();       
    }
}
