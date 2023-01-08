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
public class Ejercicio27 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String j1, j2;
        
        int j2escoge, ganador=3;
        
        do {    
            System.out.println("JUGADOR 1: Introduzca su jugada. PIEDRA PAPEL O TIJERA!");              
            j1 = entrada.nextLine();
            if (!j1.equals("piedra") && !j1.equals("papel") && !j1.equals("tijeras")) {
                System.out.println("ERROR!!");  
            }
        } while (!j1.equals("piedra") && !j1.equals("papel") && !j1.equals("tijeras"));
        
        j2escoge = (int)(Math.random() * 3);
        j2 = "";
        switch (j2escoge) {
            case 0:
                j2 = "piedra";
                break;
            case 1:
                j2="papel"; 
                break;
            case 2:
                j2="tijeras";
                break;
        }
        
        System.out.println("El j2 ha escogido " + j2);
        
        if (j1.equals(j2)) {
            System.out.println("EMPATE!!");
        }else{
            ganador = 2;
            switch (j1) {
                case "piedra":
                    if(j2.equals("tijeras")){
                    ganador=1;
                }
                    break;
                case "papel":
                    if (j2.equals("piedra")){
                        ganador=1;
                    }
                    break;
                case "tijeras":
                    if (j2.equals("papel")){
                        ganador=1;
                    }
                    break;
            }
            if (ganador==1) {
            System.out.println("El ganador es el JUGADOR!!!");
            }else{
            System.out.println("El ganador es el ORDENADOR!!");
            }
        }        
    }
}
