/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * Crea un programa per a realitzar càlculs relacionats amb l'altura (en metres) de persones.
 * Demanarà un valor N i després emmagatzemarà en un array N altures introduïdes per
 * teclat. Després mostrarà l'altura mitjana, màxima i mínima així com quantes persones
 * mesuren per damunt i per davall de la mitjana.
 */
public class UF06ExerciciA10 {
    
    public static void main (String[] args){
        
        // Declaració de variables
        int i, numero, damunt, davall;
        double suma, mitjana, maxima=Double.MIN_VALUE, minima=Double.MAX_VALUE;
        Scanner entrada =  new Scanner (System.in);       
        
        // Demanar quantes altures es vol emmagatzemar
        System.out.print("Introdueix un número d'altures a introduir: ");
        numero = entrada.nextInt();
        double altures[] = new double[numero];        
        
        // Demanar les altures
        for (i=0; i<altures.length; i++){
            System.out.print ("Introdueix l'altura " + (i+1) + ": ");
            altures[i]= entrada.nextDouble();
        }        
        
        // Calculem la mitjana, màxima i mínima
        suma=0;
        for (i = 0; i < altures.length; i++) {
            suma += altures[i];
            if (altures[i] > maxima) maxima = altures[i];
            if (altures[i] < minima) minima = altures[i];
        }
        mitjana = suma / numero;

        // Calculem quantes altures hi ha per damunt i per davall de la mitjana
        damunt = 0;
        davall = 0;
        for (i = 0; i < altures.length; i++) {
            if (altures[i] > mitjana) damunt++;
            if (altures[i] < mitjana) davall++;
        }

        // Mostramos la informació
        System.out.println("Altura mitjana:  " + mitjana);
        System.out.println("Altura màxima: " + maxima);
        System.out.println("Altura mínima: " + minima);
        System.out.println("Altures por damunt de la mitjana: " + damunt);
        System.out.println("Altures por davall de la mitjana: " + davall);
 
        entrada.close();
    }
}
