/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 17: Comprovar si un número introduït per teclat  és major que el anterior que s'ha introduït.
 * Si ho és demana el seguent, sino indica error i demana un altre. Es finalitza al introduir un 0.
 * Al final ens diu quants números s'han introduït i quants errors hem comés.
 */
public class UF05Exercici17 {
    
    public static void main(String[] args) {

        // Declaració de variables
        int anterior, numero, total, errors;
        Scanner entrada = new Scanner(System.in);

        // Petició del primer número
        System.out.print("Introdueix un número inicial: ");
        anterior = entrada.nextInt();
        
        // Processar números
        total=0;
        errors=0;
        do {
            total++;
            System.out.print("Introdueix un número: ");
            numero = entrada.nextInt();

            if (numero <= anterior && numero != 0) {
                System.out.println("Error és menor.");
                errors++;            

            }
            anterior=numero;

        } while (numero != 0);

        
        // Mostrar resultats
        System.out.println("Total de números introduïts: " + total);
        System.out.println("Números fallats: " + errors);
        entrada.close();
    }
    
}
