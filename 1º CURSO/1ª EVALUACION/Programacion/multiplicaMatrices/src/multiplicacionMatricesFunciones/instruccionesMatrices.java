/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicacionMatricesFunciones;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class instruccionesMatrices {
    
    public static void menuInicio() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ESTE ES UN PROGRAMA PARA MULTIPLICAR MATRICES");
        System.out.println("");
        
        String opcion;
        boolean valido = false;
        
        do {
           
            System.out.println("¿QUIERES RECIBIR UNA EXPLICACIÓN ACERCA DE LA MULTIPLICACIÓN DE MATRICES?");
            opcion = entrada.nextLine().toUpperCase();
            
            switch (opcion) {
            case "SI":
                System.out.println("");
                System.out.println("Dos matrices A y B son multiplicables si el número de columnas de A coincide con el número de filas de B.");
                System.out.println("Mm x n * Mn x p = M m x p");
                System.out.println("El elemento cij de la matriz producto se obtiene multiplicando cada elemento de la fila i de la matriz A por cada elemento de la columna j de la matriz B y sumándolos.");
                System.out.println("");
                System.out.println("===============================================================================================================================");
                System.out.println("");
                System.out.println("PROPIEDADES DE LA MULTIPLICACIÓN DE MATRICES");
                System.out.println("Asociativa: A · (B · C) = (A · B) · C");
                System.out.println("Elemento neutro: A · I = A   Donde I es la matriz identidad del mismo orden que la matriz A.");
                System.out.println("No es Conmutativa: A · B ≠ B · A");
                System.out.println("Distributiva del producto respecto de la suma: A · (B + C) = A · B + A · C");
                System.out.println("");
                System.out.println("===============================================================================================================================");
                System.out.println("===============================================================================================================================");
                System.out.println("");
                valido = true;
                break;
            case "NO":
                System.out.println("De acuerdo");
                valido = true;
                break;
            default:
                System.out.println("Opción no contemplada");
                System.out.println("Vuelva a responder.");
            }            
        } while (valido == false);
        
    }
}
