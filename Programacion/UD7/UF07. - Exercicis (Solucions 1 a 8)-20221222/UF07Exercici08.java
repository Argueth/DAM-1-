/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf07exercicis;
import java.util.Scanner;
/**
 * UF07 Exercici 8:  Programa que demana un valor N sencer i després mostra el sumatori des d’1 a N, el
 * productori d'1 a N i el valor intermedi entre 1 i N, utilitzant una funcions.
 */
public class UF07Exercici08 {

    //*****************************
    // DECLARACIÓ DE FUNCIONS
    //*****************************
    
    public static int suma1aN(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
        
    }

    public static int producte1aN(int n) {        
        int prod = 1;
        for (int i = 1; i <= n; i++) {
            prod *= i;
        }
        return prod;
    }

    public static double intermedi1aN(int n) {
        return (1.0 + (double) n) / 2.0;
    }

    //*****************************
    // PROCEDIMENT PRINCIPAL
    //*****************************
    
    public static void main(String[] args) {
        
        // Declaració de variables
        int n;
        Scanner entrada = new Scanner(System.in);

        // Petició de dades per pantalla
        System.out.print("Introdueix N: ");
        n = entrada.nextInt();       
        
        // Mostrar resultats
        System.out.println("Suma de 1 a N: " + suma1aN(n));
        System.out.println("Producto de 1 a N: " + producte1aN(n));
        System.out.println("Intermedio de 1 a N: " + intermedi1aN(n));
        entrada.close();
    }
}
