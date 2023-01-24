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
public class ejercicio17 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        int segundos, minutos, horas;
        
        System.out.println("Introduce las horas.");       
        horas = entrada.nextInt();      
        System.out.println("Introduce llos minutos.");
        minutos = entrada.nextInt();
        System.out.println("Introduce los segundos.");
        segundos = entrada.nextInt();
        
        if(segundos == 59){
            segundos = 00;
            if(minutos == 59){
                minutos=00;
                if(horas==23){
                    horas=00;
                    System.out.println(horas + ":" + minutos + ":" + segundos);
                }
                else{
                    horas++;
                    System.out.println(horas + ":" + minutos + ":" + segundos);
                    
                }
            }
            else{
                minutos++;
                System.out.println(horas + ":" + minutos + ":" + segundos);
            }
        }
        else{
            segundos++;
            System.out.println(horas + ":" + minutos + ":" + segundos);
        }
    }
}
