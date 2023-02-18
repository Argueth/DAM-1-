/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Arrays;
/**
 * UF06 Exercici18:  Programa que crea un array de grandària 30 i ho emplena amb valors aleatoris
 * entre 0 i 9 (utilitza Math.random()*10). Després ordena els valors del array i els mostrarà
 * per pantalla.
 */
public class UF06ExerciciA18 {

    public static void main(String[] args) {

        // Declaració de variables
        int i;
        int vector[] = new int[30];
        String vectorString;

        // Carrega del vector amb valors aleatoris entre [0,9]
        for (i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        
        // Ordenarel vector
        Arrays.sort(vector);
        
        // Mostrem el vector
        vectorString = Arrays.toString(vector);
        System.out.println(vectorString);

    }    
    
}
