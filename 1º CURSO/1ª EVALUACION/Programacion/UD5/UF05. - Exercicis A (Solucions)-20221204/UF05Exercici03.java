/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.uf05exercicis;
/**
 * UF05 Exercici 3: Mostra els números parells fins el 200 de un en un
 */
public class UF05Exercici03 {

    public static void main (String[] args){
        
        int i;
        
        for (i=1; i<=200; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }
}
