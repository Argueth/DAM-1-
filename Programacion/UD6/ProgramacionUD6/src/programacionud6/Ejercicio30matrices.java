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
public class Ejercicio30matrices {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n;
        int suma_hom = 0, suma_muj = 0;
        float sum_sueldos_h = 0, sum_sueldos_m = 0;
        
        System.out.print("Introduce el número de personas para hacer la estadística: ");
        n = entrada.nextInt();
        
        float sueldos[][] = new float[n][2];
        
        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[i].length; j++) {
                if (j == 0) {
                    System.out.println("Introduce el género (0 para hombre o 1 para mujer) de la persona " + (i+1) + ": ");
                    sueldos[i][j] = entrada.nextFloat();
                }
                if (j == 1) {
                    System.out.println("Indica el sueldo: ");
                    sueldos[i][j] = entrada.nextFloat();
                }
            }
        }
        for (int i = 0; i < sueldos.length; i++) {
            for (int j = 0; j < sueldos[i].length; j++) {
                System.out.print(sueldos[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i][0] == 0) {
                suma_hom++;
                sum_sueldos_h += sueldos[i][1];
            }
            if (sueldos[i][0] == 1) {
                suma_muj++;
                sum_sueldos_m += sueldos[i][1];
            }
        }
        
        System.out.println("En la empresa hay " + suma_hom + " hombres y la media de su sueldo es: " + sum_sueldos_h + "€.");
        System.out.println("En la empresa hay " + suma_muj + " mujeres y la media de su sueldo es: " + sum_sueldos_m + "€.");
    }            
}
