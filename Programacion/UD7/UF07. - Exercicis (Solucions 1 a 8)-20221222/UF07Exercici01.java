/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf07exercicis;
import java.util.Scanner;
/**
 * UF07 Exercici 1: Programa que demana dos nombres reals per teclat i mostra per pantalla el resultat
 * de multiplicar-los, utilitzant una funció.
 */
public class UF07Exercici01 {

    //*****************************
    // DECLARACIÓ DE FUNCIONS
    //*****************************
    
    public static double multiplica(double a, double b) {
        return a * b;
    }

    //*****************************
    // PROCEDIMENT PRINCIPAL
    //*****************************
    
    public static void main(String[] args) {
        
        // Declaració de variables
        double x, y, res;
        Scanner entrada = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix un número real: ");
        x = entrada.nextDouble();
        System.out.print("Introdueix un número real: ");
        y = entrada.nextDouble();
        
        // Processar les dades
        res = multiplica(x, y);
        System.out.println("Resultat de la multiplicació: " + res);
        
        entrada.close();
    }
}
