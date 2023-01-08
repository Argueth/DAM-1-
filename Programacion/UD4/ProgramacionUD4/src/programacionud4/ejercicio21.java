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
public class ejercicio21 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String j1, j2;
        
        System.out.println("Bienvenido al juego PIEDRA, PAPEL O TIJERA!!!");
        System.out.println("JUGADOR 1, escoja: PIEDRA, PAPEL o TIJERA.");
        j1 = entrada.nextLine();
        
        System.out.println("JUGADOR 2, escoja: PIEDRA, PAPEL o TIJERA.");
        j2 = entrada.nextLine();
        
        switch (j1){
            case "piedra" -> {
                switch(j2){
                    case "piedra" ->{
                        System.out.println("Turno JUGADOR 1: " + j1);
                        System.out.println("Turno JUGADOR 2: " + j2);
                        System.out.println("¡¡¡EMPATE!!!");
                    }
                    case "papel" -> {
                        System.out.println("Turno JUGADOR 1: " + j1);
                        System.out.println("Turno JUGADOR 2: " + j2);
                        System.out.println("GANADOR: ¡¡¡JUGADOR 2!!!");
                    }
                    case "tijera" -> {
                        System.out.println("Turno JUGADOR 1: " + j1);
                        System.out.println("Turno JUGADOR 2: " + j2);
                        System.out.println("GANADOR: ¡¡¡JUGADOR 1!!!");
                    }
                }
            }
            case "papel" -> {
                switch (j2){
                    case "piedra" -> {
                        System.out.println("Turno JUGADOR 1: " + j1);
                        System.out.println("Turno JUGADOR 2: " + j2);
                        System.out.println("GANADOR: ¡¡¡JUGADOR 1!!!");
                    }
                    case "papel" -> {
                        System.out.println("Turno JUGADOR 1: " + j1);
                        System.out.println("Turno JUGADOR 2: " + j2);
                        System.out.println("GANADOR: ¡¡¡EMPATE!!!");
                    }
                    case "tijera" -> {
                        System.out.println("Turno JUGADOR 1: " + j1);
                        System.out.println("Turno JUGADOR 2: " + j2);
                        System.out.println("GANADOR: ¡¡¡JUGADOR 2!!!");
                    }
                }
            }
            case "tijera" -> {
                switch (j2){
                    case "piedra" -> {
                        System.out.println("Turno JUGADOR 1: " + j1);
                        System.out.println("Turno JUGADOR 2: " + j2);
                        System.out.println("GANADOR: ¡¡¡JUGADOR 2!!!");
                    }
                    case "papel" -> {
                        System.out.println("Turno JUGADOR 1: " + j1);
                        System.out.println("Turno JUGADOR 2: " + j2);
                        System.out.println("GANADOR: ¡¡¡JUGADOR 1!!!");
                    }
                    case "tijera" -> {
                        System.out.println("Turno JUGADOR 1: " + j1);
                        System.out.println("Turno JUGADOR 2: " + j2);
                        System.out.println("GANADOR: ¡¡¡EMPATE!!!");
                    }
                }
            }
        }
    }
}
