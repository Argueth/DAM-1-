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
public class Ejercicio08 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int num, neg = 0, pos = 0, nul = 0;               
        
        for (int i = 1; i <= 10; i++){
            System.out.println("Introduzca un número entero: ");
            num = entrada.nextInt();
            if (num == 0){
                nul = nul + 1;
            }
            else {
                if (num < 0){
                    neg = neg + 1;
                }
                else if (num > 0){
                    pos = pos + 1;
                }
            }
        }
        System.out.println("Hay " + pos + " números positivos, " + neg + " números negativos y " + nul + " números nulos.");
    }        
}
