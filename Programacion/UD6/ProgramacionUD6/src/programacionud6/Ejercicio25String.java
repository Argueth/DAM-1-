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
public class Ejercicio25String {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String oracion, reves;
        
        System.out.println("Introduce la oración: ");
        oracion = entrada.nextLine();
        
        oracion = oracion.replace(" ","");
        oracion = oracion.toUpperCase();
        char vector[] = new char[oracion.length()];
        
        for (int i = 0; i < oracion.length(); i++) {
            vector[oracion.length()-i-1] = oracion.charAt(i);
        }
        
        reves = String.valueOf(vector);
        
        if (oracion.equals(reves)) {
            System.out.println("La oracion es un palíndromo.");
        }else {
            System.out.println("La oración no es un palíndromo.");
        }
    }
}
