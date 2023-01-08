/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;

/**
 * UF05 Exercici 11: Suma per separat els números parells i els imparells
 *                  compresos entre 100 i 200
 */
public class UF05Exercici11 {

    public static void main (String[] args){
        
        // Declaració de variables
        int i, parells, imparells;
        
        // Processar calculs
        parells = 0;
        imparells = 0;
        
        for (i=100; i<=200; i++){
            if (i % 2 == 0) {
                parells += i;
            } else {
                imparells += i;
            }
         } 
        
        // Mostrar resultats
        System.out.println( "La suma total de parells entre 100 i 200 és: " + parells);
        System.out.println( "La suma total d' imparells entre 100 i 200 és: " + imparells);
    }
}
