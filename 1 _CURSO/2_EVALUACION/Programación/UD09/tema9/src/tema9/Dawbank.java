/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mc_ut
 */
public class Dawbank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        String iban;
        ArrayList<CuentaBancaria> cuentas = new ArrayList();
        
        do {
            System.out.println("----------------------------------");
            System.out.println("---------------MENU---------------");
            System.out.println("--                              --");
            System.out.println("--   1 . Datos de la cuenta     --");
            System.out.println("--   2 . IBAN                   --");
            System.out.println("--   3 . Titular                --");
            System.out.println("--   4 . Saldo                  --");
            System.out.println("--   5 . Ingresar dinero        --");
            System.out.println("--   6 . Retirar dinero         --");
            System.out.println("--   7 . Movimientos            --");
            System.out.println("--   8 . Crear cuenta           --");
            System.out.println("--   9 . Eliminar cuenta        --");
            System.out.println("--                              --");
            System.out.println("--   0 . Salir                  --");
            System.out.println("--                              --");
            System.out.println("----------------------------------");
            System.out.println("----------------------------------");

            opcion = comprobarOpcion(entrada);

            switch (opcion) {
                case 1:
                    mostrarDatos(entrada, cuentas);
                    break;
                case 2:
                    iban = comprobarIban(entrada);
                    if (existeIban(entrada, iban, cuentas)!=-1) {
                        System.out.printf("IBAN: %s%n", cuentas.get(existeIban(entrada, iban, cuentas)).getIban());   
                    }
                    break;
                case 3:
                    iban = comprobarIban(entrada);
                    if (existeIban(entrada, iban, cuentas)!=-1) {
                        System.out.printf("Titular: %s %s%n", cuentas.get(existeIban(entrada, iban, cuentas)).getNombre(),cuentas.get(existeIban(entrada, iban, cuentas)).getApellidos());
                    }
                    break;
                case 4:
                    iban = comprobarIban(entrada);
                    if (existeIban(entrada, iban, cuentas)!=-1) {
                        System.out.printf("Saldo: %.2f", cuentas.get(existeIban(entrada, iban, cuentas)).getSaldo());   
                    }
                    break;
                case 5:
                    ingresarDinero(entrada, cuentas);
                    break;
                case 6:
                    retirarDinero(entrada, cuentas);
                    break;
                case 7:
                    movimientos(entrada, cuentas);
                    break;
                case 8:
                    crearCuenta(entrada, cuentas);
                    break;
                case 9:
                    eliminarCuenta(entrada, cuentas);
                    break;
                case 0:
                    System.out.println("Adiós, motherfucker.");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion!=0);  
    }
    
    public static void movimientos(Scanner entrada, ArrayList cuentas) {
        String iban = comprobarIban(entrada);
        if (existeIban(entrada, iban, cuentas)!=-1) {
            CuentaBancaria cuenta = (CuentaBancaria) cuentas.get(existeIban(entrada, iban, cuentas));
            cuenta.mostrarMovimientos();
        }
    }
    
    public static void retirarDinero(Scanner entrada, ArrayList cuentas) {
        String iban = comprobarIban(entrada);
        double cantidad = 0;
        if (existeIban(entrada, iban, cuentas)!=-1) {
            cantidad = comprobarCantidad(entrada);
            CuentaBancaria cuenta = (CuentaBancaria) cuentas.get(existeIban(entrada, iban, cuentas));
            cuenta.retirar(cantidad);
        }   
    }
    
    public static void ingresarDinero(Scanner entrada, ArrayList cuentas) {
        String iban = comprobarIban(entrada);
        double cantidad = 0;
        if (existeIban(entrada, iban, cuentas)!=-1) {
            cantidad = comprobarCantidad(entrada);
            CuentaBancaria cuenta = (CuentaBancaria) cuentas.get(existeIban(entrada, iban, cuentas));
            cuenta.ingresar(cantidad);
        }   
    }
    
    public static double comprobarCantidad(Scanner entrada) {
        double cantidad = 0;
        boolean valido = false;
        do {
            System.out.println("Introduzca la cantidad deseada: ");
            if (entrada.hasNextDouble()) {
                cantidad = entrada.nextDouble();
                if (cantidad > 0) {
                    valido = true;
                }else {
                    System.out.println("La cantidad debe ser positiva. Inténtelo de nuevo.");
                }
            }else {
                System.out.println("Cantidad no válida. Inténtelo de nuevo.");
            }
        } while (valido == false);
            
        
        return cantidad;
    }
    
    public static void eliminarCuenta(Scanner entrada, ArrayList cuentas) {
        String iban = comprobarIban(entrada);
        if (existeIban(entrada, iban, cuentas)!=-1) {
            cuentas.remove(existeIban(entrada, iban, cuentas));
        }
    }
    
    public static int existeIban(Scanner entrada, String iban, ArrayList cuentas) {
        int indice = -1;
        Iterator iter = cuentas.iterator();
        while (iter.hasNext()) {
            indice++;
            CuentaBancaria cuenta =(CuentaBancaria) iter.next();
            if (iban.equals(cuenta.getIban())) {
                return indice;
            }
        }
        System.out.println("El IBAN especificado no existe. ");
            
        return -1;
    }
    
    public static void crearCuenta(Scanner entrada, ArrayList cuentas) {
        String iban = comprobarCuenta(entrada, cuentas);
        System.out.println("Introduce el Nombre del titular de la cuenta: ");
        String nombre = comprobarNombre(entrada);
        System.out.println("Introduce los apellidos del titular de la cuenta: ");
        String apellidos = comprobarNombre(entrada);
        cuentas.add(new CuentaBancaria(iban, nombre, apellidos));  
    }
    
    public static String comprobarNombre(Scanner entrada) {
        String nombre;
        boolean valido = false;
        do {
            System.out.println("*no puede contener números");
            nombre = entrada.nextLine();
            if (!nombre.equals("") && nombre.matches("^[^0-9]*$")) {
                valido=true;
            }else {
                System.out.println("No válido.");
            }
        } while (valido == false);
        return nombre;
    }
    
    public static String comprobarCuenta(Scanner entrada, ArrayList cuentas) {
        boolean valido = false;
        String iban;
        do {
            iban = comprobarIban(entrada);
            if (unicoIban(iban, cuentas)) {
                valido=true;
            }
        } while (valido == false);
        
        return iban;
    }
    
    public static String comprobarIban (Scanner entrada){
        boolean valido = false;
        String iban;
        
        do {
            System.out.println("Introduzca IBAN deseado (2 letras + 22 número): ");
            iban = entrada.nextLine().toUpperCase();
            
            if (iban.matches("[A-Z]{2}[0-9]{4}")) {
                    valido=true;
             }else{
                System.out.println("Formato no válido");
            }
        
        } while (valido == false);
        return iban;
    }
    
    public static boolean unicoIban(String iban, ArrayList cuentas){
        boolean unica = false;
        int cont =0;
        Iterator iter = cuentas.iterator();
        while (iter.hasNext()) {
            CuentaBancaria cuenta =(CuentaBancaria) iter.next();
            if (iban.equals(cuenta.getIban())) {
                cont ++;
            }    
        }
        if (cont== 0) {
            unica = true;
        }else {
            System.out.println("El IBAN especificado ya existe. ");
        }
        return unica;
    }
    
    public static int comprobarOpcion(Scanner entrada) {
        int opcion=-1;
        boolean valido = false;
        do {
            System.out.println("Introduzca la opción deseada: ");
            if (entrada.hasNextInt()) {
                opcion = entrada.nextInt();
                entrada.nextLine();
                if (opcion>=0 && opcion<=9) {
                    valido = true;
                }else {
                    System.out.println("Opción no válida. Vuelva a intentarlo.");
                }
            }else {
                System.out.println("Valor no válido. Vuelva a intentarlo. ");
            }
        } while (valido == false);   
        return opcion;
    }
    
    public static void mostrarDatos(Scanner entrada, ArrayList cuentas) {
        String iban = comprobarIban(entrada);
        if (existeIban(entrada, iban, cuentas)>-1) {
            System.out.println(cuentas.get(existeIban(entrada, iban, cuentas)).toString());
        }    
    }   
}
