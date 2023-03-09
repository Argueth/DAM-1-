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
        
        int opcion = -1;
        
        do {
            System.out.println("""
                               ================MENÚ DE LA TIENDA================
                               =                                               =
                               =   1.- Mostrar lista completa de animales      =
                               =   2.- Mostrar lista de un tipo de animal      =
                               =   3.- Mostrar datos de un animal              =
                               =   4.- Insertar nuevo animal en el inventario  =
                               =   5.- Eliminar un animal del inventario       =
                               =   6.- Vaciar el inventario                    =
                               =                                               =
                               =   0.- Salir                                   =
                               =                                               =
                               =================================================
                                """);
            
            opcion = comprobarOpcion(0, 6);
            
            switch (opcion) {
                case 1:
                    inventario.mostrarLista();
                    break;
                case 2:
                    subMenu(inventario);
                    break;
                case 3:
                    inventario.mostrarAnimal();
                    break;
                case 4:
                    inventario.insertarAnimal();
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    break;
                default:
                    throw new AssertionError();
            }
            
        } while (opcion!=0);
    }
    
    public static void subMenu(Inventario inventario) {
        
        System.out.println("""
                           ================MENÚ DE LA TIENDA================
                           =                                               =
                           =   Elige el tipo de animal:                    =
                           =   1.- Perro                                   =
                           =   2.- Gato                                    =
                           =   3.- Loro                                    =
                           =   4.- Canario                                 =
                           =                                               =
                           =   0.- Volver                                  =
                           =                                               =
                           =================================================
                           """);
        
        int opcion = comprobarOpcion(0, 4);
        
        switch (opcion) {
            case 1:
                inventario.mostrarTipo("Perro");
                break;
            case 2:
                inventario.mostrarTipo("Gato");
                break;
            case 3:
                inventario.mostrarTipo("Loro");
                break;
            case 4:
                inventario.mostrarTipo("Canario");
                break;
            case 0:
                break;
            default:
                throw new AssertionError();
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
                }
            }else {
                System.out.println("Opción no válida.");
            }
        } while (valido == false);
        
        return opcion;
    }
}
