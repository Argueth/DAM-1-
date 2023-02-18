/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 23: Dibuixar una piràmide amb números
 */
public class UF05Exercici23 {

    public static void main (String[] args){
        
        // Declaració de variables
        int numero, i, j, k;     
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades
        do {
            System.out.print("Introdueix un número d'un digit per a fer la piràmide: ");
            numero = entrada.nextInt();
            if ((numero<0) || (numero>9)) {
                        System.out.println("El número no és correcte.");
            }
        }
        while ((numero<0) || (numero>9));
        
        // Dibuixar la piràmide
        for (i=1; i<=numero; i++){
            for (j=1; j<=numero-i; j++){
                System.out.print(" ");
            }
            for (k=1; k<i; k++){
                System.out.print (k);
            }
            for (k=i; k>=1; k--){
                System.out.print (k);
            }
            System.out.println (" ");
        }
        entrada.close();
    }
}
