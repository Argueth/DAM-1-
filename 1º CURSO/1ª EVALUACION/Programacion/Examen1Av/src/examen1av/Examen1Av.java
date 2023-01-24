/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1av;
import funcions1av.FuncionsArray;
import funcions1av.FuncionsString;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Examen1Av {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String frase = "Aquesta és una frase de proba que anem a utilitzar per a l'examen"; 
        int matriu[][] = {{8, 1, 6, 4}, {7, 5, 3, 9}, {4, 9, 2, 3}, {5, 7, 6, 8}};
        int opcio = -1;
        boolean valid = false;
        
        do {
            
            System.out.println("===MENÚ===");
            System.out.println("1.- Contar aparicions d'un caracter en el string.");
            System.out.println("2.- Ordenar les files de la matriu de menor a major.");
            System.out.println("3.- Matriu trasposta.");
            System.out.println("0.- Eixir.");
            
            if (entrada.hasNextInt()) {
                opcio = entrada.nextInt();
            }
            if (opcio >=0 && opcio < 4) {
                valid = true;
            }else {
                System.out.println("ERROR. INTRODUEIX UNA OPCIÓ VALIDA."); 
            }
            if (valid == true) {
                switch (opcio) {
                    case 1:
                        FuncionsString.contarCaracter(frase);
                        break;
                    case 2:
                        FuncionsArray.ordenarFiles(matriu);
                        break;
                    case 3:
                        FuncionsArray.traspostaMatriu(matriu);
                        break;
                }
            }
                      
        } while (opcio != 0);
        
        System.out.println("Gracias por participar");
    }
    
}
