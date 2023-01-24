/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * Crea un programa que cree un array d'enters de grandària 100 i ho emplene amb valors
 * enters aleatoris entre 1 i 10. Després demanarà un valor N i
 * mostrarà en quines posicions del array apareix N.
 */
public class UF06ExerciciA09 {
    
    public static void main (String[] args){
        
        // Declaració de variables
        final int MAXIM=100;
        int i, numero;
        int vector[] = new int[MAXIM];
        Scanner entrada =  new Scanner (System.in);
        
        // Carregar l'array amb dades
        for (i=0; i<vector.length; i++){
            vector[i]= (int) (1 + Math.random() * 10);
        }
        
        // Petició de dades
        System.out.print("Introdueix un número real entre 1 i 10: ");
        numero = entrada.nextInt();
        
        // Mostrar en quines posicions apareix el número introduït
        System.out.print("El número apareix en les posicions: ");
        for (i=0;i<vector.length;i++){
            if (vector[i]==numero){
                System.out.print(i + " ");
            }
        }
        entrada.close();
    }
}
