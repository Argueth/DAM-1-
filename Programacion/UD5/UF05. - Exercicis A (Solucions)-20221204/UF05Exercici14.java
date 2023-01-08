/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 14: Donada una quantitat d'euros (múltiple de 5)
 * es fa el desglossament de billets (500,200,100,50,20,10,5), sempre intentant
 * donar el mínim de billets possible.
 */
public class UF05Exercici14 {

    public static void main(String[] args) {

        // Declaració de variables
        int quantitat, numBillets, billet;
        Scanner entrada = new Scanner(System.in);
        
        // Realitzar càlculs i mostrar resultats
        billet = 500;

        do {
            System.out.print("Introdueix una quantitat (múltiple de 5) en €: ");
            quantitat = entrada.nextInt();
        } while (quantitat % 5 != 0);

        while (quantitat > 0) {
            numBillets = quantitat / billet;
            quantitat = quantitat % billet;

            System.out.println(numBillets + " billets de " + billet);

            switch (billet) {
                case 500:
                    billet = 200;
                    break;
                case 200:
                    billet = 100;
                    break;
                case 100:
                    billet = 50;
                    break;
                case 50:
                    billet = 20;
                    break;
                case 20:
                    billet = 10;
                    break;
                case 10:
                    billet = 5;
                    break;
            }

        }
    }
    
}
