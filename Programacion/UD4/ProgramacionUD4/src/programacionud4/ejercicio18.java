/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionud4;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class ejercicio18 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int horas;
        double precio_hora, salario_bruto, tramo1, tramo2, impuestos, salario_neto;
        
        System.out.println("Introduzca el nombre del trabajador");
        nombre = entrada.nextLine();
        
        System.out.println("Introduzca las horas trabajadas.");
        horas = entrada.nextInt();
        
        System.out.println("Introduzca el salario por hora.");
        precio_hora = entrada.nextDouble();
        
        salario_bruto = horas * precio_hora;
        
        if(salario_bruto < 500){
            impuestos = 0;
            salario_neto = salario_bruto;
            System.out.println("El trabajador " + nombre + " tiene un salario bruto de " + salario_bruto + "€ y paga unos impuestos de " + impuestos + "€. Finalmente le queda un salario neto de " + salario_neto + "€.");
        }
        else{
            if(salario_bruto > 500 && salario_bruto < 900){
                tramo1 = salario_bruto - 500;
                impuestos = tramo1 * 0.25;
                salario_neto = salario_bruto - impuestos;
                System.out.println("El trabajador " + nombre + " tiene un salario bruto de " + salario_bruto + "€ y paga unos impuestos de " + impuestos + "€. Finalmente le queda un salario neto de " + salario_neto + "€.");
            }
            else{
                if(salario_bruto > 900){
                    tramo1 = salario_bruto - 900;
                    tramo2 = salario_bruto - tramo1 - 500;
                    impuestos = tramo1 * 0.45 + tramo2 * 0.25;
                    salario_neto = salario_bruto - impuestos;
                    System.out.println("El trabajador " + nombre + " tiene un salario bruto de " + salario_bruto + "€ y paga unos impuestos de " + impuestos + "€. Finalmente le queda un salario neto de " + salario_neto + "€.");
                }
            }
        }       
    }
}
