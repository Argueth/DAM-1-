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
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad;
        System.out.println("¿Qué edad tienes?");
        edad = entrada.nextInt();
        if (edad>=18){
            System.out.println("Eres mayor de edad.");
        }
    }
}
