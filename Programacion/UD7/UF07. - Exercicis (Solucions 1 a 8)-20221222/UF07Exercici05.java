/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf07exercicis;
import java.util.Scanner;
/**
 * UF07 Exercici 5:  Programa que demana un valor sencer en milles i mostra el seu equivalent en
 * quilòmetres, utilitzant una funció. Recorda que una milla són 1,60934 quilòmetres.
 */
public class UF07Exercici05 {

    //*****************************
    // DECLARACIÓ DE FUNCIONS
    //*****************************
    
    public static double milles_a_quiilometres(double milles) {

        return 1.60934 * milles;
        
    }

    //*****************************
    // PROCEDIMENT PRINCIPAL
    //*****************************
    
    public static void main(String[] args) {
        
        // Declaració de variables
        double milles, quilometres;
        Scanner entrada = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix les milles: ");
        milles = entrada.nextDouble();
        
        // Processar les dades
        quilometres=milles_a_quiilometres(milles);
        System.out.println( milles + " milles són " + quilometres + " quilòmetres.");
        entrada.close();       
    }
}
