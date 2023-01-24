/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici24: donat un número enter positiu, ens diga quants són i quant sumen els dígits parells que conté.
 * Els dígits parells es mostraran ordenadament d’esquerra a dreta.
 */
public class UF05Exercici24 {

    public static void main(String[] args) {
        
        // Declaració de variables
        long numero, auxiliar, reves;
        int longitud, i, digit, suma;
        Scanner entrada = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix un número enter positiu: ");
        numero=entrada.nextLong();
        
        // Primer girem el número per a poder anar extraient digit a digit per la dreta (dividint per 10).
        reves = 0;
        auxiliar = numero;
        longitud=0;
        while (auxiliar>0){
            reves = (reves*10) + (auxiliar%10);     // Extrau digit més baix i el posa com el més alt en reves
            auxiliar = auxiliar/10;                 // Llevem el digit més baix i procesem la resta del número
            longitud++;
        }
        
        // Extraiem cada digit per la dreta i comprovem si és parell
        System.out.print ("Els dígits parells són: ");
        suma=0;
        for (i=1; i<=longitud; i++){
            digit=(int)(reves%10);
            if ((digit%2==0)){
                System.out.print(digit + " ");
                suma=suma+digit;
            }
            reves=reves/10;
        }
        
        // Mostra la suma dels dígits parells
        System.out.println("\nLa suma dels dígits parells és: " + suma);
        entrada.close();
    }
    
}
