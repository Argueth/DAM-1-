/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud5;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio10 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int notas = 0, diez = 0;
        
        while (notas != -1) {
            System.out.println("Introduce una nota.");
            notas = entrada.nextInt();
            
            if (notas < -1 || notas > 10){
                System.out.println("La nota no es válida.");
            }
            else if (notas == 10) {
                diez = diez + 1;
            }
        }
        if (diez > 0) {
            System.out.println("En la lista de notas hay algún 10.");
        }
        else {
            System.out.println("En la lista de notas no hay ningún 10.");
        }
    }
}
