/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud4;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       float distancia_millas, distancia_metros;
       float equi = 1852.0F;
       System.out.println("Introduce la distancia en millas marinas");
       distancia_millas = entrada.nextFloat();
       distancia_metros = distancia_millas * equi;
       System.out.println ("La distancia es de " + distancia_metros + "m");
    }
    
}
