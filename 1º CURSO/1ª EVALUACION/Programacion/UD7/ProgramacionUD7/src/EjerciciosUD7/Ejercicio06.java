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
public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        double precio, precioFinal;
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce el precio del artículo " + (i+1) + ": ");
            precio = entrada.nextFloat();
            precioFinal = precioConIVA(precio);
            System.out.println("El precio con IVA del artículo " + (i+1) + " es de " + precioFinal + "€.");
        }
    }
    
    public static double precioConIVA(double precio) {
        
        return (precio * 1.21);
    }
}
