/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Ejercic 13: L'usuari pensa un número entre l'1 i el 100 i l'ordinador l'adivina a partir
 *                  de la pista del usuari sobre si és major o menor
 */
public class UF05Exercici13 {

    public static void main(String[] args) {    

        // Declaració de variables
        int numero, min, max, intent;
        char resposta;
        boolean trobat;
        Scanner entrada = new Scanner(System.in);

        // Realitzar calculs
        System.out.println("Pensa un número");
        
        trobat = false;
        intent = 1;
        min = 1;
        max = 100;
        
        while (trobat==false){
            
            numero = (max + min) / 2;

            System.out.print("El número és " + numero +"? (Escriu: >, < o =) ");
            resposta = entrada.nextLine().charAt(0);
            
            switch (resposta) {
                case '<':
                    max = numero;
                    intent++;
                    break;
                case '>':
                    min = numero;
                    intent++;
                    break;
                case '=':
                    trobat=true;
            }
        }
        
        // Mostrar resultats
        System.out.println( "Ho has encertat en el intent " + intent + "!!!");
    }    
}
