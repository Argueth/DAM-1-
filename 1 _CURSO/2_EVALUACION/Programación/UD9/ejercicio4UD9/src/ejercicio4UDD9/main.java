/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4UDD9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class main {
    
    public static void main(String[] args) {
        
        menu();
    }
    
    public static void menu() {
        
        int opcion;
        
        ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();
        
        do {
            System.out.println("""
                               --------------------------------------
                               -----------------MENU-----------------
                               ||                                  ||
                               ||   1.- Abrir cuenta               ||
                               ||   2.- Cerrar cuenta              ||
                               ||   3.- Ver información de cuenta  ||
                               ||   4.- Ingresar dinero            ||
                               ||   5.- Retirar dinero             ||
                               ||   6.- Traspasar dinero           ||
                               ||   7.- calcular intereses         ||
                               ||                                  ||
                               ||   0.- Salir                      ||
                               ||                                  ||
                               --------------------------------------
                               --------------------------------------
                               """);  
            opcion=comprobarOpcion(0, 7);
            
            switch (opcion) {
                case 1:
                    menu2(cuentasBancarias);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("Adiós. Gracias por utilizar nuestros servicios.");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion!=0);
    }
    
    public static void menu2(ArrayList cuentasBancarias) {
        System.out.println("""
                           --------------------------------------
                           -----------------MENU-----------------
                           ||                                  ||
                           ||   1.- Cuenta Corriente           ||
                           ||   2.- Cuenta ahorro              ||
                           ||                                  ||
                           ||   0.- Volver                     ||
                           ||                                  ||
                           --------------------------------------
                           --------------------------------------
                           """);
        int opcion = comprobarOpcion(0, 2);
        String IBAN;
        double saldo;
        
        switch (opcion) {
            case 1:
                IBAN = comprobarIBAN();
                saldo = comprobarSaldo();
                cuentasBancarias.add(new CuentaCorriente (IBAN, saldo));
                break;
            case 2:
                IBAN = comprobarIBAN();
                saldo = comprobarSaldo();
                cuentasBancarias.add(new CuentaAhorro(IBAN, saldo));
                break;
            case 0:
                menu();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public static int comprobarOpcion(int min, int max) {
        Scanner entrada = new Scanner(System.in);
        int opcion = -1;
        boolean valido = false;
        
        do {
            if (entrada.hasNextInt()) {
                opcion=entrada.nextInt();
                if (opcion>=min && opcion<=max) {
                    valido = true;
                }else {
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            }else {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (valido==false);
            
        
        return opcion;
    }
    
    public static String comprobarIBAN() {
        Scanner entrada = new Scanner(System.in);
        String IBAN;
        boolean valido = false;
        
        do {
            System.out.println("Introduce el IBAN");
            System.out.println("2 letras seguidas de 24 numeros.");
            IBAN = entrada.nextLine();
            if (IBAN.matches("^[a-zA-Z]{2}[0-9]{24}$")) {
                valido = true;
            }else {
                System.out.println("IBAN no válido. Vuelve a intentarlo.");
            }
        } while (valido == false);
        
        return IBAN;
    }
    
    public static double comprobarSaldo() {
        Scanner entrada = new Scanner(System.in);
        double saldo = 0;
        boolean valido = false;
        
        do {
            System.out.println("Introduce el saldo inicial de la cuenta");
            if (entrada.hasNextDouble()) {
                saldo = entrada.nextDouble();
                valido = true;
            }else {
                System.out.println("Saldo no reconocido. Vuelta a intentarlo.");
            }
        } while (valido == false);
        
       return saldo; 
    }
}
