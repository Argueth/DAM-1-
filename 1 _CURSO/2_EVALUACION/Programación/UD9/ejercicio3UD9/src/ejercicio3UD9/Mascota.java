/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3UD9;
import java.util.Scanner;
/**
 *
 * @author pabloginerbarrios
 */
public abstract class Mascota {
    protected String nombre, estado, fecha_nacimiento;
    protected int edad;
    
    public Mascota(String nombre, String estado, String fecha_nacimiento, int edad) {
        this.nombre = nombre;
        this.estado = estado;
        this.fecha_nacimiento = fecha_nacimiento;
        this.edad = edad;
    }
    
    enum estado {
        disponible, reservado, vendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setMascota() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el nombre: ");
        this.nombre = entrada.nextLine();
        System.out.println("Introduce el estado del animal: ");
        this.estado = entrada.nextLine();
        System.out.println("Introduce la fecha de nacimiento: ");
        this.fecha_nacimiento = entrada.nextLine();
        System.out.println("Introduce la edad del animal: ");
        this.edad = entrada.nextInt();
    }
    
    public abstract void Muestra();
    
    public abstract void Habla();
}
