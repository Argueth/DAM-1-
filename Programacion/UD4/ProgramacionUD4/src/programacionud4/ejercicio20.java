
package programacionud4;

import java.util.Scanner;


public class ejercicio20 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String sabor1, sabor2;   
        char nata, nombre;
        float p_manzana = 18.0f, p_fresa = 16.0f, p_negro = 14.0f, p_blanco = 15.0f, p_nata = 2.50f, p_nombre = 2.75f, p_final;
         
        System.out.println("¿Qué sabor desea? Puede escoger entre manzana, fresa o chocolate.");
        sabor1 = entrada.next();
        
        switch(sabor1){   
            case "chocolate" -> {
                System.out.println("¿Prefiere chocolate negro o blanco?");
                sabor2=entrada.next(); 
                switch(sabor2){
                    case "negro" -> {            
                        System.out.println("¿Quiere añadir nata?");
                        nata = entrada.next().charAt(0);
                        switch(nata){
                            case 's'-> {
                                System.out.println("¿Quiere personalizar el pastel con un nombre?");
                                nombre = entrada.next().charAt(0);
                                switch(nombre){
                                    case 's' -> {
                                        System.out.println("Pastel de " + sabor1 + sabor2 + ": " + p_negro + "€");
                                        System.out.println("Con nata: " + p_nata + "€");
                                        System.out.println("Con nombre personalizado: " + p_nombre + "€");
                                        p_final = p_negro + p_nata + p_nombre;
                                        System.out.println("TOTAL: " + p_final);
                                    }
                                    case 'n' -> {
                                        System.out.println("Pastel de " + sabor1 + sabor2 + ": " + p_negro + "€");
                                        System.out.println("Con nata: " + p_nata + "€");
                                        p_final = p_negro + p_nata;
                                        System.out.println("TOTAL: " + p_final + "€");
                                    }
                                    default -> {
                                        System.out.println("ERROR.");
                                    }
                                }
                            }
                            case 'n'-> {
                                System.out.println("¿Quiere personalizar el pastel con un nombre?");
                                nombre = entrada.next().charAt(0);
                                switch(nombre){
                                    case 's' -> {
                                        System.out.println("Pastel de " + sabor1 + sabor2 + ": " + p_negro + "€");
                                        System.out.println("Con nombre personalizado: " + p_nombre + "€");
                                        p_final = p_negro + p_nombre;
                                        System.out.println("TOTAL: " + p_final);
                                    }
                                    case 'n' -> {
                                        System.out.println("Pastel de " + sabor1 + sabor2 + ": " + p_negro + "€");
                                        p_final = p_negro;
                                        System.out.println("TOTAL: " + p_final + "€");
                                    }
                                    default -> {
                                        System.out.println("ERROR.");
                                    }
                                }
                            }
                        }
                    }
                    case "blanco" -> {
                        System.out.println("¿Quiere añadir nata?");
                        nata = entrada.next().charAt(0);
                        switch(nata){
                            case 's' -> {
                                System.out.println("¿Quiere personalizar el pastel con un nombre?");
                                nombre = entrada.next().charAt(0);
                                switch(nombre){
                                    case 's' -> {
                                        System.out.println("Pastel de " + sabor1 + sabor2 + ": " + p_blanco + "€");
                                        System.out.println("Con nata: " + p_nata + "€");
                                        System.out.println("Con nombre personalizado: " + p_nombre + "€");
                                        p_final = p_blanco + p_nata + p_nombre;
                                        System.out.println("TOTAL: " + p_final);
                                    }
                                    case 'n' -> {
                                        System.out.println("Pastel de " + sabor1 + sabor2 + ": " + p_blanco + "€");
                                        System.out.println("Con nata: " + p_nata + "€");
                                        p_final = p_blanco + p_nata;
                                        System.out.println("TOTAL: " + p_final + "€");
                                    }
                                    default -> {
                                        System.out.println("ERROR.");
                                    }
                                }
                            }
                            case 'n' -> {
                                System.out.println("¿Quiere personalizar el pastel con un nombre?");
                                nombre = entrada.next().charAt(0);
                                switch(nombre){
                                    case 's' -> {
                                        System.out.println("Pastel de " + sabor1 + sabor2 + ": " + p_negro + "€");
                                        System.out.println("Con nombre personalizado: " + p_nombre + "€");
                                        p_final = p_negro + p_nombre;
                                        System.out.println("TOTAL: " + p_final + "€");
                                    }
                                    case 'n' -> {
                                        System.out.println("Pastel de " + sabor1 + sabor2 + ": " + p_negro + "€");
                                        p_final = p_negro;
                                        System.out.println("TOTAL: " + p_final + "€");
                                    }
                                    default -> {
                                        System.out.println("ERROR.");
                                    }
                                }
                            }
                            default -> {
                                System.out.println("ERROR");
                            }
                        }
                    }
                    default -> {
                        System.out.println("ERROR");
                    }
                }    
            }
            case "manzana" -> {  
                System.out.println("¿Quiere añadir nata?");
                nata = entrada.next().charAt(0);
                switch(nata){
                    case 's' -> {
                        System.out.println("¿Quiere personalizar el pastel con un nombre?");
                        nombre = entrada.next().charAt(0);
                        switch(nombre){
                            case 's' -> {
                                System.out.println("Pastel de " + sabor1 + ": " + p_manzana + "€");
                                System.out.println("Con nata: " + p_nata + "€");
                                System.out.println("Con nombre personalizado: " + p_nombre + "€");
                                p_final = p_manzana + p_nata + p_nombre;
                                System.out.println("TOTAL: " + p_final + "€");
                            }
                            case 'n' -> {
                                System.out.println("Pastel de " + sabor1 + ": " + p_manzana + "€");
                                System.out.println("Con nata: " + p_nata + "€");
                                p_final = p_manzana + p_nata;
                                System.out.println("TOTAL: " + p_final + "€");
                            }
                            default -> {
                                System.out.println("ERROR.");
                            }
                        }
                    }
                    case 'n' -> {
                        System.out.println("¿Quiere personalizar el pastel con un nombre?");
                        nombre = entrada.next().charAt(0);
                        switch(nombre){
                            case 's' -> {
                                System.out.println("Pastel de " + sabor1 + ": " + p_manzana + "€");
                                System.out.println("Con nombre personalizado: " + p_nombre + "€");
                                p_final = p_manzana + p_nombre;
                                System.out.println("TOTAL: " + p_final + "€");
                            }
                            case 'n' -> {
                                System.out.println("Pastel de " + sabor1 + ": " + p_manzana + "€");
                                p_final = p_manzana;
                                System.out.println("TOTAL: " + p_final + "€");
                            }
                            default -> {
                                System.out.println("ERROR.");
                            }
                        }
                    }
                }
            }
            case "fresa" -> {
                System.out.println("¿Quiere añadir nata?");
                nata = entrada.next().charAt(0);
                switch(nata){
                    case 's' -> {
                        System.out.println("¿Quiere personalizar el pastel con un nombre?");
                        nombre = entrada.next().charAt(0);
                        switch(nombre){
                            case 's' -> {
                                System.out.println("Pastel de " + sabor1 + ": " + p_fresa + "€");
                                System.out.println("Con nata: " + p_nata + "€");
                                System.out.println("Con nombre personalizado: " + p_nombre + "€");
                                p_final = p_fresa + p_nata + p_nombre;
                                System.out.println("TOTAL: " + p_final + "€");
                            }
                            case 'n' -> {
                                System.out.println("Pastel de " + sabor1 + ": " + p_fresa + "€");
                                System.out.println("Con nata: " + p_nata + "€");
                                p_final = p_fresa + p_nata;
                                System.out.println("TOTAL: " + p_final + "€");
                            }
                            default -> {
                                System.out.println("ERROR.");
                            }
                        }
                    }
                    case 'n' -> {
                        System.out.println("¿Quiere personalizar el pastel con un nombre?");
                        nombre = entrada.next().charAt(0);
                        switch(nombre){
                            case 's' -> {
                                System.out.println("Pastel de " + sabor1 + ": " + p_fresa + "€");
                                System.out.println("Con nombre personalizado: " + p_nombre + "€");
                                p_final = p_fresa + p_nombre;
                                System.out.println("TOTAL: " + p_final + "€");
                            }
                            case 'n' -> {
                                System.out.println("Pastel de " + sabor1 + ": " + p_fresa + "€");
                                p_final = p_fresa;
                                System.out.println("TOTAL: " + p_final + "€");
                            }
                            default -> {
                                System.out.println("ERROR.");
                            }
                        }
                    }
                    default -> {
                        System.out.println("ERROR");
                    }
                }
            } 
        }
    }
}
