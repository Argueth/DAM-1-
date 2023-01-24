/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf07exercicis;
import java.util.Scanner;
/**
 * UF07 Exercici 6:  Programa que demana cinc preus i mostra per pantalla el preu de venda de cadascun
 * després d’aplicar-li un 21% d'IVA, utilitzant una funció..
 */
public class UF07Exercici06 {

    //*****************************
    // DECLARACIÓ DE FUNCIONS
    //*****************************
    
    public static double preuAmbIVA(double preu) {
        
        return (preu * 1.21);
        
    }

    //*****************************
    // PROCEDIMENT PRINCIPAL
    //*****************************
    
    public static void main(String[] args) {
        
        // Declaració de variables
        final int PREUS=5;
        int i;
        double preuIni, preuFin;
        Scanner entrada = new Scanner(System.in);

        // Petició de dades i procés de calcul de l'IVA
        for (i = 1; i <= PREUS; i++) {
            System.out.print("Preu de l'article " + i + " sense IVA: ");
            preuIni = entrada.nextDouble();
            preuFin = preuAmbIVA(preuIni);
            System.out.println("Preu de l'article " + i + " amb IVA: " + preuFin);
        }
        entrada.close();
    }
}
