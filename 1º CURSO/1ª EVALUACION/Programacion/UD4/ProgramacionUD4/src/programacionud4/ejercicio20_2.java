package programacionud4;

import java.util.Scanner;

public class ejercicio20_2 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        float p_manzana=18.0f, p_fresa=16.0f, p_negro=14.0f, p_blanco=15.9f, p_nata=2.50f, p_nombre=2.75f,  p_final=0.0f;
        String sabor1, sabor2;
        char nata, nombre;
        
        System.out.println("¿Qué sabor desea? Puede escoger entre chocolate, manzana o fresa.");
        sabor1 = entrada.nextLine();
        
        switch(sabor1){
            case "chocolate" -> {
                System.out.println("¿Lo prefiere blanco o negro?");
                sabor2 = entrada.nextLine();
                switch (sabor2){
                    case "blanco" -> {
                        p_final = p_blanco;
                    }
                    case "negro" -> {
                        p_final = p_negro;
                    }
                    default -> {
                        System.out.println("ERROR");
                    }
                }
            }
            case "manzana" -> {
                p_final = p_manzana;
            }
            case "fresa" -> {
                p_final = p_fresa;
            }
        }
        
        System.out.println("¿Desea añadir nata?");
        nata = entrada.next().charAt(0);
        
        switch(nata){
            case 's' -> {
                p_final = p_final + p_nata;
            }
            case 'n' -> {
            }
            default -> {
                System.out.println("ERROR");
            }
        }
        System.out.println("¿Desea personalizar el pastel con un nombre?");
        nombre = entrada.next().charAt(0);
        switch(nombre){
            case 's' -> {
                p_final = p_final + p_nombre;
            }
            case 'n' -> {
            }
            default -> {
                System.out.println("ERROR");
            }
        }
        System.out.println("PRESUPUESTO:");
        switch(sabor1){            
            case "chocolate" -> {                
                switch(sabor2) {
                    case "blanco" -> {
                        System.out.println("Pastel de sabor " + sabor1 + " " + sabor2 + ": " + p_blanco);
                    }
                    case "negro" -> {
                        System.out.println("Pastel de sabor " + sabor1 + " " + sabor2 + ": " + p_negro);
                    }
                }
            } 
            case "manzana" -> {
                System.out.println("Pastel de sabor " + sabor1 + ": " + p_manzana);
            }
            case "fresa" -> {
                System.out.println("Pastel de sabor " + sabor1 + ": " + p_fresa);
            }
        }
        switch(nata){
            case 's' -> {
                System.out.println("Con nata: " + p_nata);
            }
            case 'n' -> {
            }
        }
        switch(nombre){
            case 's' -> {
                System.out.println("personalizado con nombre: " + p_nombre);
            }
            case 'n' -> {
            }
        }
        System.out.println("TOTAL: " + p_final);
    }
}
