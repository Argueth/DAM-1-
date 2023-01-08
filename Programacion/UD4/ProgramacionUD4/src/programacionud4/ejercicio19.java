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
public class ejercicio19 {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int altura, anchura, superficie;
        char escudo, escoger;
        float precio_envio = 3.25f;
        float precio_cm2 = 0.01f;
        float precio_escudo = 2.50f;
        float precio_euros, precio_final;
        
        System.out.println("Introduce la altura de la bandera en cm.");
        altura = entrada.nextInt();
        
        System.out.println("Introduce ahora la anchura de la bandera en cm.");
        anchura = entrada.nextInt();
        
        superficie = altura * anchura;
        precio_euros = superficie * precio_cm2;
        
        System.out.println("¿Quiere algún escudo bordado en la bandera?");
        escudo = entrada.next().charAt(0);
        
        switch (escudo){ 
            case 's':
                precio_final = precio_euros + precio_escudo + precio_envio;
                System.out.println("Gracias, aquí tiene el desglosamiento de su compra.");
                System.out.println("Bandera de " + superficie + "cm2: " + precio_euros + "€");
                System.out.println("Con escudo: " + precio_escudo + "€");
                System.out.println("Costes de envio: " + precio_envio + "€");
                System.out.println("TOTAL: " + precio_final + "€");
                break;
            case 'n':
                precio_final = precio_euros + precio_envio;
                System.out.println("Gracias, aquí tiene el desglosamiento de su compra.");
                System.out.println("Bandera de " + superficie + "cm2: " + precio_euros + "€");
                System.out.println("Sin escudo: 0.00€");
                System.out.println("Costes de envio: " + precio_envio + "€");
                System.out.println("TOTAL: " + precio_final + "€");
            default:
                System.out.println("ERROR. Consulte con el encargado o reinicie el proceso. Muchas gracias.");
                
                        
        }
    }                    
}


