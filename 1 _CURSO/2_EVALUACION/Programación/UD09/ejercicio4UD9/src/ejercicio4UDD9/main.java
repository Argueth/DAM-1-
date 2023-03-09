/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4UDD9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class main {
    
    public static void main(String[] args) {
        
        int opcion;
        
        ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList();
        
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
                    eliminarCuenta(cuentasBancarias);
                    break;
                case 3:
                    verDatos(cuentasBancarias);
                    break;
                case 4:
                    ingresarDinero(cuentasBancarias);
                    break;
                case 5:
                    retirarDinero(cuentasBancarias);
                    break;
                case 6:
                    traspasarDinero(cuentasBancarias);
                    break;
                case 7:
                    intereses(cuentasBancarias);
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
                if (unicoIBAN(IBAN, cuentasBancarias)) {
                    saldo = comprobarSaldo();
                    cuentasBancarias.add(new CuentaCorriente (IBAN, saldo));
                }else {
                    System.out.println("Ese IBAN ya existe. No se pudo crear la cuenta.");
                }
                break;
            case 2:
                IBAN = comprobarIBAN();
                if (unicoIBAN(IBAN, cuentasBancarias)) {
                    saldo = comprobarSaldo();
                    cuentasBancarias.add(new CuentaAhorro (IBAN, saldo));
                }else {
                    System.out.println("Ese IBAN ya existe. No se pudo crear la cuenta.");
                }
                break;
            case 0:
                System.out.println("Volvemos al menú principal");
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
            System.out.println("2 letras seguidas de 4 numeros.");
            IBAN = entrada.nextLine();
            if (IBAN.matches("^[a-zA-Z]{2}[0-9]{4}$")) {
                valido = true;
            }else {
                System.out.println("IBAN no válido. Vuelve a intentarlo.");
            }
        } while (valido == false);
        
        return IBAN;
    }
    
    public static boolean unicoIBAN(String IBAN, ArrayList cuentasBancarias) {
        int cont = 0;
        boolean valido = false;
        
        Iterator iter = cuentasBancarias.iterator();
        while (iter.hasNext()) {
            if (IBAN.equals(iter.next())) {
                cont++;
            }
        }
        if (cont == 0) {
            valido = true;
        }
        return valido;
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
    
    public static void eliminarCuenta(ArrayList cuentasBancarias) {
        int cont = 0;
        String IBAN = comprobarIBAN();
        Iterator iter = cuentasBancarias.iterator();
        while (iter.hasNext()) {
            CuentaBancaria cuenta = (CuentaBancaria) iter.next();
            if (IBAN.equals(cuenta.getIBAN())) {
                iter.remove();
                cont++;
            }
        }
        if (cont==0) {
            System.out.println("La cuenta especificada no existe.");
        }
    }
    
    public static void verDatos(ArrayList cuentasBancarias) {
        int cont = 0;
        String IBAN = comprobarIBAN();
        Iterator iter = cuentasBancarias.iterator();
        while (iter.hasNext()) {
            CuentaBancaria cuenta = (CuentaBancaria) iter.next();
            if (IBAN.equals(cuenta.getIBAN())) {
                System.out.println(cuenta.toString());
                cont++;
            }
        }
        if (cont==0) {
            System.out.println("La cuenta especificada no existe.");
        }
    }
    
    public static void ingresarDinero(ArrayList cuentasBancarias) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        String IBAN = comprobarIBAN();
        Iterator iter = cuentasBancarias.iterator();
        while (iter.hasNext()) {
            CuentaBancaria cuenta = (CuentaBancaria) iter.next();
            if (IBAN.equals(cuenta.getIBAN())) {
                System.out.println("Indique la cantidad a ingresar");
                double cantidad = entrada.nextDouble();
                cuenta.ingresar(cantidad);
                cont++;
            }
        }
        if (cont==0) {
            System.out.println("La cuenta especificada no existe.");
        }
    }
    
    public static void retirarDinero(ArrayList cuentasBancarias) {
        Scanner entrada = new Scanner(System.in);
        int cont = 0;
        String IBAN = comprobarIBAN();
        Iterator iter = cuentasBancarias.iterator();
        while (iter.hasNext()) {
            CuentaBancaria cuenta = (CuentaBancaria) iter.next();
            if (IBAN.equals(cuenta.getIBAN())) {
                System.out.println("Indique la cantidad a ingresar");
                double cantidad = entrada.nextDouble();
                cuenta.retirar(cantidad);
                cont++;
            }
        }
        if (cont==0) {
            System.out.println("La cuenta especificada no existe.");
        }
    }
    
    public static void traspasarDinero(ArrayList cuentasBancarias) {
        Scanner entrada = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        System.out.println("CUENTA EMISORA");
        String emisor = comprobarIBAN();
        Iterator iter1 = cuentasBancarias.iterator();
        do {
            while (iter1.hasNext()) {
                CuentaBancaria envia = (CuentaBancaria) iter1.next();
                if (emisor.equals(envia.getIBAN())) {
                    System.out.println("CUENTA RECEPTORA");
                    String receptor = comprobarIBAN();
                    Iterator iter2 = cuentasBancarias.iterator();
                    cont1++;
                    while (iter2.hasNext()) {
                        CuentaBancaria recibe = (CuentaBancaria) iter2.next();
                        if (receptor.equals(recibe.getIBAN())) {
                            System.out.println("Indique la cantidad a ingresar");
                            double cantidad = entrada.nextDouble();
                            envia.Traspasar(recibe, cantidad);
                            cont2++;
                        }
                    }
                }
                if (cont1==0) {
                System.out.println("La cuenta emisora especificada no existe. Vuelva a intentarlo");
                }
                if (cont2 == 0) {
                    System.out.println("La cuenta receptora especificada no existe. Vuelva a intentarlo");
                }
            } 
        } while (cont1 == 0 || cont2 == 0);
         
    }
    
    public static void intereses(ArrayList cuentasBancarias) {
        String IBAN = comprobarIBAN();
        int cont = 0;
        
        Iterator iter = cuentasBancarias.iterator();
        while (iter.hasNext()) {
            CuentaBancaria cuenta = (CuentaBancaria) iter.next();
            if (IBAN.equals(cuenta.getIBAN())) {
                System.out.println(cuenta.calcularIntereses());
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("La cuenta especificada no existe.");
        }
    }
}
