/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud7;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio05 {
    
    public static void main(String[] args) {
        
        int millas;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de millas: ");
        millas = entrada.nextInt();
        
        System.out.println(millas + " millas son " + millas_a_kilometros(millas) + " kilómetros.");
    }
    
    public static double millas_a_kilometros(int millas) {
        
        double kilometros;
        
        kilometros = millas * 1.60934;
        
        return kilometros;
    }
}
