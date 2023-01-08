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
public class Ejercicio23String {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre, ape1, ape2, codigo;
        
        System.out.println("Introduce el nombre; ");
        nombre = entrada.nextLine();
        
        System.out.println("Introduce el primer apellido: ");
        ape1 = entrada.nextLine();
        
        System.out.println("Introduce el segundo apellido: ");
        ape2 = entrada.nextLine();
        
        nombre = nombre.substring(0,3);
        ape1 = ape1.substring(0,3);
        ape2 = ape2.substring(0,3);
        
        codigo = nombre + ape1 + ape2;
        
        System.out.println(codigo.toUpperCase());
    }
}
