/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud4;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ejercicio16 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int nota;
        
        System.out.println("Escriba la calificación.");
                        
        nota = entrada.nextInt();
        
        switch (nota) {
            case 0:
                System.out.println("Muy deficiente");
                break;
            case 1:
                System.out.println("Muy deficiente");
                break;
            case 2:
                System.out.println("Muy deficiente");
                break;
            case 3:
                System.out.println("Insuficiente");
                break;
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Bien");
                break;
            case 6:
                System.out.println("Notable");
                break;
            case 7:
                System.out.println("Notable");
                break;
            case 8:
                System.out.println("Notable");
                break;
            case 9:
                System.out.println("Notable");
                break;
            case 10:
                System.out.println("Excelente");
                break;
            default:
                System.out.println("ERROR. La nota debe estar entre 0 y 10.");
                                                
            }
        }
    }
