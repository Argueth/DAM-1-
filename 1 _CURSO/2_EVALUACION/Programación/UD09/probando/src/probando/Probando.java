/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando;
import java.util.ArrayList;
/**
 *
 * @author pablo
 */
public class Probando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=7; //numero de lineas
        int impares=0; // numero total de lineas impares
        char letra = 'a';
        int x = 0; // numero de veces que se pasa por un linea impar
        
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                impares++;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                System.out.println("");
            }else {
                x++;
                for (int j = 0; j < impares - x; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(letra);
                }
                System.out.println("");
            }
        } 
    }   
}
