/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcions1av;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author pablo
 */
public class FuncionsString {
    
    public static void contarCaracter(String frase) {
        
        Scanner entrada = new Scanner(System.in);
        
        int suma = 0;
        char array_frase[] = frase.toCharArray();
        char busca;
        
        System.out.print("Introduce un caracter para buscar en la frase: ");
        busca = entrada.nextLine().charAt(0);
        
        for (int i = 0; i < array_frase.length; i++) {
            if (busca == array_frase[i]) {
                suma++;
            }
        }
        System.out.println("La lletra " + busca + " apareix " + suma + " vegades");
        System.out.println("");
    }
}
