/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud5;



/**
 *
 * @author pablo
 */
public class Ejercicio09 {
    
    public static void main(String[] args){
        
        int sum = 0, prod = 1;
                 
        for (int i=0; i<=9; i++){
            sum = sum + i;
            prod = prod * i;
        }
        
        System.out.println("La suma de los 10 primeros números naturales es " + sum + " y el producto de esos mismos números es " + prod + ".");
    }
}
