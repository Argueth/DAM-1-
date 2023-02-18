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
public class Ejercicio21String {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String cadena;
        String palabras[];
        
        System.out.println("Introduce la oración que desses: ");
        cadena = entrada.nextLine();
        
        palabras = cadena.split(" ");
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}
