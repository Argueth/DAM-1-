/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;

/**
 * UF05 Exercici 18: Calcula la suma dels quadrats dels 5 primers nombres naturals.
 */
public class UF05Exercici18 {
    
    public static void main (String[] args){
        
        // Declaració de variables
        final int MAX=5;
        int i, suma;
        
        // Processar les dades
        suma=0;
        for (i=1; i<=MAX; i++){
            suma=(int)Math.pow(i, 2) + suma;
        }
                
        // Mostrar resultats
        System.out.println("La suma dels quadrats dels 5 primers números és: " + suma);

    }    
}
