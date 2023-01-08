/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
import java.util.Scanner;
/**
 * UF05 Exercici 6: Llig 10 números no nuls i ens diu si ha llegit algun negatiu o no
 */
public class UF05Exercici06 {

    public static void main (String[] args){

        // Declaració de variables        
        final int MAX=10;
        int i, numero;
        boolean negatiu;
        Scanner entrada = new Scanner(System.in);

        // Processar les dades        
        negatiu=false;
        
        for (i=1; i<=MAX; i++){
            System.out.print("Introdueix el número " + i + " de " + MAX + ": ");
            numero = entrada.nextInt();
            if (numero<0){
                negatiu=true;
            }
        }
        if (negatiu==true){
            System.out.println("S'han introduït números negatius");
        } else {
            System.out.println("No s'ha introduït cap número negatiu");
        }
    }
}
