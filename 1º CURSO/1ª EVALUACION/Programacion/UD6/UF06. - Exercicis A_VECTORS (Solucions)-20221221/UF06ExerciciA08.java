/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 8: Crea un programa que cree un array amb 100 números reals aleatoris entre 0.0 i 1.0,
 * utilitzant Math.random(), i després li demane a l'usuari un valor real R. Finalment, mostrarà
 * quants valors del array són igual o superiors a R.
 */
public class UF06ExerciciA08 {
    
    public static void main (String[] args){
        
        // Declaració de variables
        final int MAXIM=100;
        int i, suma;
        double numero;
        double vector[] = new double[MAXIM];
        Scanner entrada =  new Scanner (System.in);
        
        // Carregar l'array amb dades
        for (i=0; i<vector.length; i++){
            vector[i]=Math.random();
        }
        
        // Petició de dades
        System.out.print("Introdueix un número real entre 0,0 i 1,0: ");
        numero = entrada.nextDouble();
        
        // Mostrar quants valor son iguals o majors al número introduït
        suma=0;
        for (i=0;i<vector.length;i++){
            if (vector[i]>=numero){
                suma++;
            }
        }
        System.out.println("Total de números majors o iguals: "+ suma);
        entrada.close();
    }
}
