/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici B 4: Programa que mostra per pantalla quantes vocals de cada tipus hi ha (quantes ‘a’,
 * quantes ‘e’, etc.) en una frase introduïda per teclat. No s'ha de diferenciar entre majúscules i minúscules.
 */
public class UF06ExerciciB04 {
    
    public static void main(String[] args) {
        
        // Declaració de variables
        int i, numa=0, nume=0, numi=0, numo=0, numu=0;
        String frase;
        char caracter;        
        Scanner entrada = new Scanner(System.in);

        // Petició de dades
        System.out.print("Introdueix una frase: ");
        frase = entrada.nextLine();

        // Transformem la frase a minúscules
        frase = frase.toLowerCase();
        
        // Processar la frase

        for (i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'a':
                    numa++;
                    break;
                case 'e':
                    nume++;
                    break;
                case 'i':
                    numi++;
                    break;
                case 'o':
                    numo++;
                    break;
                case 'u':
                    numu++;
                    break;
            }
        }

        System.out.println("El número de 'a' és: " + numa);
        System.out.println("El número de 'e' és: " + nume);
        System.out.println("El número de 'i' és: " + numi);
        System.out.println("El número de 'o' és: " + numo);
        System.out.println("El número de 'u' és: " + numu);

    }
    
}
