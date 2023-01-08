/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
import java.util.Arrays;
/**
 * UF06 Exercici 19: Programa per a mostrar el rànquing de puntuacions d'un torneig
 * d'escacs amb 8 jugadors. Se li demanarà a l'usuari que introduïsca les puntuacions de tots
 * els jugadors (habitualment valors entre 1000 i 2800, de tipus enter) i després mostre les
 * puntuacions en ordre descendent (de la més alta a la més baixa)
 */
public class UF06ExerciciA19 {
    public static void main (String[] args){
        
        // Declaració de variables
        final int JUGADORS=8;
        int i;
        int puntuacio[] = new int [JUGADORS];
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades
        System.out.println ("Introdueix les puntuacions");
        for (i=0; i<puntuacio.length; i++){
            System.out.print("Puntuació " + (i+1) + ": ");
            puntuacio[i]=entrada.nextInt();
        }
        
        // Ordenem el vector de puntuacions
        Arrays.sort(puntuacio);
        
        // Mostrem les puntuacions en sentit invers
        System.out.print("Les puntuacions ordenades de major a menor són: ");
        for (i=puntuacio.length-1; i>=0; i--){
            System.out.print(puntuacio[i] + " ");
        }
        
    }
    
}
