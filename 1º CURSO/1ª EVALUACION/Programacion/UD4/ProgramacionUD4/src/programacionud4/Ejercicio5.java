/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud4;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner (System.in);
       double radio, longitud, area_esfera, volumen_esfera;     
       System.out.println("Introduce el radio de la circunferencia en cnetímetros.");
       radio = entrada.nextDouble();
       longitud = 2 * Math.PI * radio;
       area_esfera = Math.PI * Math.pow(radio, 2);
       volumen_esfera = (4/3) * Math.PI * Math.pow(radio,3);
       System.out.println("Dado el radio indicado: " + radio + "cm, la logitud de la circunferencia es " + longitud + "cm, el área del círculo es " + area_esfera + "cm y el volumen de la esfera es " + volumen_esfera + "cm.");          
    }
}
