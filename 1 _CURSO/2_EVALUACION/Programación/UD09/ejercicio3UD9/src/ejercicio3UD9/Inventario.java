/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3UD9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 *
 * @author pabloginerbarrios
 */
public class Inventario {
    ArrayList lista;
    
    public Inventario (ArrayList lista) {
        this.lista = lista;
    }
    
    //mostrar lsita completa de los animales
    public void mostrarLista() {
        Iterator iter = lista.iterator();
        
        while (iter.hasNext()) {
            Mascota animal = (Mascota)iter.next();
            System.out.printf("Nombre: %s, Tipo: %s%n", animal.getNombre(), animal.getClass().getSimpleName());
        }
    }
    //mostrar lista de animales de un tipo concreto
    public void mostrarTipo(String tipo) {
        Iterator iter = lista.iterator();
        
        while(iter.hasNext()) {
            Mascota animal = (Mascota)iter.next();
            if (animal.getClass().getSimpleName().equals(tipo)) {
                animal.Muestra();
            }
        }
    }
    //mostrar datos de un animal
    public void mostrarAnimal(String tipo) {
        
        String nombre = comprobarNombre();
        
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            Mascota animal = (Mascota)iter.next();
            if (animal.getNombre().equals(nombre) && animal.getClass().getSimpleName().equals(tipo)) {
                animal.Muestra();
            }
        }
        
                
    }
    //insertar nuevo animal en el inventario
    public void insertarAnimal(String tipo) {
        Scanner entrada = new Scanner(System.in);
        String raza, pico = "", origen, color, opcion;
        boolean pulgas, pelo_largo, vuela = true, habla, canta;
        
        System.out.println("Introduce el nombre: ");
        String nombre = entrada.nextLine().toUpperCase();
        System.out.println("Introduce el estado del animal: ");
        String estado = entrada.nextLine();
        String fecha_nacimiento = comprobarFecha();
        System.out.println("Introduce la edad del animal: ");
        int edad = entrada.nextInt();
        
        if (tipo.equals("Loro") || tipo.equals("Canario")) {
            System.out.println("TIene el pico largo o corto?");
            pico = comprobarCadena();
            System.out.println("Vuela?");
            vuela = comprobarBooleano();
        }
        
        switch (tipo) {
            case "Perro":
                System.out.println("Introduce la raza del perro: ");
                raza = comprobarCadena();
                System.out.println("Tiene pulgas?");
                pulgas = comprobarBooleano(); 
                this.lista.add(new Perro(nombre, estado, fecha_nacimiento, edad, raza, pulgas));
                break;
            case "Gato":
                System.out.println("Introduce el color del gato: ");
                color = comprobarCadena();
                System.out.println("TIene el pelo largo?");
                pelo_largo = comprobarBooleano();
                this.lista.add(new Gato(nombre, estado, fecha_nacimiento, edad, color, pelo_largo));
                break;
            case "Loro":
                System.out.println("Introduce el origien del loro: ");
                origen = comprobarCadena();
                System.out.println("Habla?");
                habla = comprobarBooleano();
                this.lista.add(new Loro(nombre, estado, fecha_nacimiento, edad, pico, vuela, origen, habla));
                break;
            case "Canario":
                System.out.println("Introduce el color del canario: ");
                color = comprobarCadena();
                System.out.println("Canta?");
                canta = comprobarBooleano();
                this.lista.add(new Canario(nombre, estado, fecha_nacimiento, edad, pico, vuela, color, canta));
                break;
            default:
                throw new AssertionError();
        }
    }
    //eliminar animal del inventario
    public void eliminarAnimal(String tipo) {
        
        String nombre = comprobarNombre();
        
        Iterator iter = lista.iterator();
        for (int i = 0;iter.hasNext(); i++) {
            Mascota animal = (Mascota)iter.next();
            if (animal.getNombre().equals(nombre) && animal.getClass().getSimpleName().equals(tipo)) {
                this.lista.remove(i);
            }
        }    
    }
    //vaciar el inventario
    public void vaciarInventario() {
        
        this.lista.clear();
    }
    
    public String comprobarCadena() {
        Scanner entrada = new Scanner(System.in);
        String aux, cadena = "";
        boolean valido = false;
        do {
            aux = entrada.nextLine();
            if (!aux.equals("")) {
                cadena = aux;
                valido = true;
            }else {
                System.err.println("Error. Inténtelo de nuevo.");
            }
        } while (valido = false);
        
        return cadena;
    }
    
    public boolean comprobarBooleano() {
        Scanner entrada = new Scanner(System.in);
        boolean valido = false;
        boolean booleano = false;
        String opcion;
        
        do {
            opcion = entrada.nextLine().toUpperCase();
            if (opcion.equals("SI")) {
                booleano = true;
                valido = true;
            }else if(opcion.equals("NO")) {
                booleano = false;
                valido = true;
            }else {
                System.err.println("Error. Respuesta no válida. Inténtelo de nuevo.");
            }
        } while (valido = false);
        
        return booleano;
    }
    
    public String comprobarNombre() {
        
        Scanner entrada = new Scanner(System.in);
        boolean valido = false;
        String  nombre;
        
        System.out.println("Indique el nombre del animal cuyos datos quiere conocer: ");
        do {
            nombre = entrada.nextLine().toUpperCase();
            if (!nombre.equals("")) {
                valido = true;
            }else {
                System.out.println("Nombre erróneo. Vuelva a intentarlo.");
            }
        } while (valido == false);
        
        return nombre;
    } 
    
    public String comprobarFecha() {
        
        Scanner entrada = new Scanner(System.in);
        String fecha;
        boolean valido = false;
        
        do {
            System.out.println("Introduce la feecha de nacimiento del animal (dd/mm/aaaa): ");
            fecha = entrada.nextLine();
            if (fecha.matches("\\d{2}/\\d{2}/\\d{4}")) {
                valido = true;
            }else {
                System.out.println("Fecha no válida.");
            }
        } while (valido = true);
        
        return fecha;
    }
}
