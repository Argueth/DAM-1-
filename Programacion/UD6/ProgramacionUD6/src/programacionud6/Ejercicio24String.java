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
public class Ejercicio24String {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String oracion;
        int numa=0, nume=0, numi=0, numo=0, numu=0;
        
        System.out.println("Introduce la oración: ");
        oracion = entrada.nextLine();
        
        oracion = oracion.toLowerCase();
        
        for (int i = 0; i < oracion.length(); i++) {
            switch (oracion.charAt(i)) {
                case 'a':
                    numa++;
                    break;
                case 'e':
                    nume++;
                    break;
                case 'i':
                    numi++;
                    break;
                case 'o':
                    numo++;
                    break;
                case 'u':
                    numu++;
                    break;
            }
        }
        
        System.out.println("El número de A's es: " + numa);
        System.out.println("El número de E's es: " + nume);
        System.out.println("El número de I's es: " + numi);
        System.out.println("El número de O's es: " + numo);
        System.out.println("El número de U's es: " + numu);
    }
}
