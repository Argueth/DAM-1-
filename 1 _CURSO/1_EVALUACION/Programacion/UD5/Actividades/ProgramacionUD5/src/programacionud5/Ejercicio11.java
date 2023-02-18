/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud5;

/**
 *
 * @author pablo
 */
public class Ejercicio11 {
    
    public static void main(String[] args){
        
        int sum_pares = 0, sum_impares = 0;
        
        for (int i = 100; i<=200; i++){
            if (i % 2 ==0){
                sum_pares = sum_pares + i;
            }
            else {
                sum_impares = sum_impares + i;
            }
        }
        System.out.println("La suma de los números pares entre el 100 y el 200 es " + sum_pares + ". ASí mismo, la sumna de los números impares entre el 100 y el 200 es " + sum_impares + ".");
    }
}
