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
public class probando {
    
     public static void main(String[] args) {
        
        // Declaració de variables i presentació
        int numero, j;
        int suma=0, comptador=0;
        int maxim = Integer.MIN_VALUE;
        int minim = Integer.MAX_VALUE;
        boolean esPrimer=true;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdueix números enters positius. Per finalitzar, introdueix un número primer:");
        
        do{
            
            // Petició de dades
            System.out.print("Introdueix número: ");
            if (entrada.hasNextInt()){
                numero=entrada.nextInt();

                // Determinar si el número és primer
                esPrimer=true;
                j=2;
                while ((j<=numero/2) && (esPrimer)) {
                    if (numero%j == 0){
                        esPrimer=false;
                    }
                    j++;
                }              
                
                // Si no és primer el procesem
                if (!esPrimer){
                    suma=suma+numero;
                    maxim = numero > maxim ? numero : maxim;
                    minim = numero < minim ? numero : minim;
                    comptador++;
                }
            }
        
        } while (!esPrimer);
 
        // Mostrar els resultats
        System.out.println("Has introduït " + comptador + " números no primers.");
        System.out.println("Máxim: " + maxim);
        System.out.println("Mínim: " + minim);
        System.out.println("Mitjana: " + (double)suma / comptador);
            entrada.close();
    }
}
