/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 27: Implementa el joc pedra, paper i tisora. Primer, l'usuari introdueix la seua
 * jugada i després l'ordinador genera a l'atzar una de les opcions. Si l'usuari
 * introdueix una opció incorrecta, el programa haurà de mostrar un missatge d'error.
 */
public class UF05Exercici27 {
    
    public static void main(String[] args) {
        
        // Declaració de variables
        String jugador, ordinador;
        int ordinadorTria, guanyador;
        
        Scanner entrada = new Scanner(System.in);
        
        // Petició de l'opcio del usuari
        System.out.print("Tria pedra, paper o tisora: ");
        jugador = entrada.nextLine();
        
        // L'ordinador tria la seua opció
        ordinadorTria = (int) (Math.random() * 3);
        ordinador="";
        switch (ordinadorTria) {
            case 0:
                ordinador = "pedra";
                break;
            case 1:
                ordinador = "paper";
                break;
            case 2:
                ordinador = "tisora";
                break;
        }
        
        // Resultat del joc 
        System.out.println("L'ordinador ha triat: " + ordinador);
        if (jugador.equals(ordinador)) {
            System.out.println("Empat");
        } else {
            guanyador=2;
            switch (jugador) {
                case "pedra":
                    if (ordinador.equals("tisora")) {
                    guanyador = 1;
                    }
                    break;
                case "paper":
                    if (ordinador.equals("pedra")) {
                    guanyador = 1;
                    }
                    break;
                case "tisora":
                    if (ordinador.equals("paper")) {
                    guanyador = 1;
                    }
                    break;
            }
            if (guanyador == 1) {
                System.out.println("Guanya el jugador");
            } else {
                System.out.println("Guanya l'ordinador");
            }
        }
    }
}
