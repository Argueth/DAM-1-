/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud4;

import java.util.Scanner;


public class Ejercicio6 {
     
     
    public static void main (String[] args) {
      Scanner entrada = new Scanner(System.in);
      float precio_inicial, precio_venta, descuento;
      System.out.println("Introduce el precio inicial");
      precio_inicial = entrada.nextFloat();
      System.out.println("Introduce el precio de venta");
      precio_venta = entrada.nextFloat();
      descuento = ((precio_inicial - precio_venta) * 100) / precio_inicial;
      System.out.println("El descuento en este producto es de un " + descuento + "%");                                 
    }
    
}
