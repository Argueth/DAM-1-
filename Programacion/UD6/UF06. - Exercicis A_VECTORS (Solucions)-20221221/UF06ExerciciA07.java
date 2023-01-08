/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf06exercicis;
import java.util.Scanner;
/**
 * UF06 Exercici 7: Introdueix 2 números enters per teclat P i Q, crea una array de grandaria Q-P+1,
 * emmagatzema els valors que van de P a Q i els mostra. Validar que Q siga major que P.
 */
public class UF06ExerciciA07 {
    public static void main (String[] args){
        
        // Declaració de variables
        int i, p, q;
        Scanner entrada = new Scanner (System.in);
        
        // Petició de dades
        do{
            System.out.print("Inrodueix el valor inicial P: ");
            p=entrada.nextInt();
            System.out.print("Introdueix el valor final Q: ");
            q=entrada.nextInt();
            if (q<=p){
                System.out.println("El valor de Q ha de ser major que el valor de P");
            }
        } while (q<=p);
        
        // Construir l'array
        int valors[]=new int[q-p+1];
        for (i=0; i<valors.length; i++){
            valors[i]=p+i;
        }
                
        // Mostrar els elements de l'array
        for (i=0; i<valors.length; i++){
            System.out.print (valors[i] + " ");
        }
        entrada.close();
    }
}
