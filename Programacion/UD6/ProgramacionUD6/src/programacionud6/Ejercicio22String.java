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
public class Ejercicio22String {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String a, b;
        
        System.out.println("Introduce la primera oración: ");
        a = entrada.nextLine();
        
        System.out.println("Introduce la segunda oración: ");
        b = entrada.nextLine();
        
        if (a.equals(b)) {
            System.out.println("las oraciones son iguales.");
        }else {
            System.out.println("Las oraciones no son iguales.");
        }
        
        if (a.equalsIgnoreCase(b)) {
            System.out.println("SI no tenemos en cuenta las mayúsculas, las oraciones son iguales.");
        }else {
            System.out.println("Si no tenemos en cuenta las mayúsculas, las oraciones no son iguales.");
        }
    }
}
