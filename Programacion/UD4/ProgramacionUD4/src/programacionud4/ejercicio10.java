/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud4;

import java.util.Scanner;


public class ejercicio10 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        float numero1, numero2, sum, resta, prod, divis;
        String divis_no;
        System.out.println("Introduce el primer número.");
        
        numero1 = entrada.nextFloat();
        
        System.out.println("Introduc el segundo número.");
        
        numero2 = entrada.nextFloat();
        
        sum = numero1 + numero2;
        resta = numero1 - numero2;
        prod = numero1 * numero2;
        
        if (numero2 == 0) {
            divis_no = "imposible de computar";
            System.out.println("La suma de los dos numero es igual a " + sum + ", la resta es igual a " + resta + ", el producto es igual a " + prod + " y la división es " + divis_no);

        }
        else{
            divis = numero1 / numero2;
            System.out.println("La suma de los dos numero es igual a " + sum + ", la resta es igual a " + resta + ", el producto es igual a " + prod + " y la división es igual a " + divis);
        }
    }
}
