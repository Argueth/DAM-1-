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
public class Ejercicio07 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double ancho, alto, area, perimetro;
        
        System.out.print("Introduce el ancho del restángulo: ");
        ancho = entrada.nextDouble();
        
        System.out.print("Introduce el alto del rextángulo: ");
        alto = entrada.nextDouble();
        
        System.out.println("El area del rectándulo es de " + areaCalc(ancho, alto) + "uds y su perímetro es de " + perimetroCalc(ancho, alto) + "uds.");
    }
    
    public static double perimetroCalc(double ancho, double alto) {
        
        double perimetro;
        
        perimetro = (2*ancho) + (2*alto);
        
        return perimetro;
    }
    
    public static double areaCalc(double ancho, double alto) {
        
        double area;
        
        area = ancho * alto;
        
        return area;
    }
}
