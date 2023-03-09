/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3UD9;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author pablo
 */
public class main {
    
    public static void main(String[] args) {
        
        ArrayList<Mascota> lista = new ArrayList();
        
        Inventario inventario = new Inventario(lista);
        
        Menu(inventario);
          
    }
    
    public static void Menu(Inventario inventario) {
        
        int opcion;
        String tipo;
        
        do {
            System.out.println("================MENÚ DE LA TIENDA================");
            System.out.println("=                                               =");
            System.out.println("=   1.- Mostrar lista completa de animales      =");
            System.out.println("=   2.- Mostrar lista de un tipo de animal      =");
            System.out.println("=   3.- Mostrar datos de un animal              =");
            System.out.println("=   4.- Insertar nuevo animal en el inventario  =");
            System.out.println("=   5.- Eliminar un animal del inventario       =");
            System.out.println("=   6.- Vaciar el inventario                    =");
            System.out.println("=                                               =");
            System.out.println("=   0.- Salir                                   =");
            System.out.println("=                                               =");
            System.out.println("=================================================");
            
            opcion = comprobarOpcion(0, 6);
            
            switch (opcion) {
                case 1:
                    inventario.mostrarLista();
                    break;
                case 2:
                    tipo = subMenu();
                    if (!tipo.equals("Atras")) {
                        inventario.mostrarTipo(tipo);
                    }
                    break;
                case 3:
                    tipo = subMenu();
                    if (!tipo.equals("Atras")) {
                        inventario.mostrarAnimal(tipo);
                    }
                    break;
                case 4:
                    tipo = subMenu();
                    if (!tipo.equals("Atras")) {
                        inventario.insertarAnimal(tipo);
                    }   
                    break;
                case 5:
                    tipo = subMenu();
                    if (!tipo.equals("Atras")) {
                        inventario.eliminarAnimal(tipo);
                    }
                    break;
                case 6:
                    inventario.vaciarInventario();
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (opcion!=0);
    }
    
    public static String subMenu() {
        
        System.out.println("================MENÚ DE LA TIENDA================");
        System.out.println("=                                               =");
        System.out.println("=   Elige el tipo de animal:                    =");
        System.out.println("=   1.- Perro                                   =");
        System.out.println("=   2.- Gato                                    =");
        System.out.println("=   3.- Loro                                    =");
        System.out.println("=   4.- Canario                                 =");
        System.out.println("=                                               =");
        System.out.println("=   0.- Volver                                  =");
        System.out.println("=                                               =");
        System.out.println("=================================================");
        
        int opcion = comprobarOpcion(0, 4);
        
        switch (opcion) {
            case 1: 
                return "Perro";
            case 2: 
                return "Gato";
            case 3: 
                return "Loro";
            case 4: 
                return "Canario";
            case 0:
                return "Atras";
            default:
                return "Opción no válida";
        }
    }
    
    public static int comprobarOpcion(int min, int max) {
        
        Scanner entrada = new Scanner(System.in);
        boolean valido = false;
        int opcion = -1;
        
        System.out.println("Introduce la opción deseada:");
        
        do {
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
                if (opcion >= min && opcion <= max) {
                    valido = true;
                }else {
                    System.out.println("Opción no válida.");
                    entrada.nextLine();
                }
            }else {
                System.out.println("Opción no válida.");
                entrada.nextLine();
            }
        } while (valido == false);
        
        return opcion;
    }
}
