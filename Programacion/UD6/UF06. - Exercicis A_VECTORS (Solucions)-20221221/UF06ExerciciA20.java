/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Arrays;
import java.util.Scanner;
/**
 * UF06 Exercici 20: Programa que crea un array de grandària 1000 i ho emplena amb valors enters
 * aleatoris entre 0 i 99 (utilitza Math.random()*100). Després demanarà per teclat un valor N
 * i es mostrarà per pantalla si N existeix en el array, a més de quantes vegades.
 */
public class UF06ExerciciA20 {

    public static void main(String[] args) {
        
        // Declaració de variables
        final int TAMANY=1000;
        int i, valor, posicio, vegades;
        int vector[] = new int[TAMANY];
        Scanner entrada = new Scanner(System.in);
        
        // Carregar valors aleatoris entre [0,99]
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }

        // Petició del valor a buscar en el vector
        System.out.print("Introdueix el valor a buscar entre 0 y 99: ");
        valor = entrada.nextInt();

        // Ordenem el vector i busquem la primera ocurrència del valor
        Arrays.sort(vector);
        posicio = Arrays.binarySearch(vector, valor);
        
        // Si existeix el valor
        if (posicio >= 0) {
            // Buscamos cuantas veces aparece
            vegades = 0;
            for (i = posicio; i < vector.length; i++) {
                if (vector[i] == valor) vegades++;
             }
            System.out.println("El valor " + valor + " apareix " + vegades + " vegades.");
        }
        // Si no existeis el valor
        else {
            System.out.println("El valor introduït no existeix en el vector.");
        }
    }
    
}
