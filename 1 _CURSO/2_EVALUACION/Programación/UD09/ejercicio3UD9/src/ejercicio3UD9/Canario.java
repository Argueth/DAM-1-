/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3UD9;

/**
 *
 * @author pabloginerbarrios
 */
public class Canario extends Ave{
    String color;
    boolean canta;
    
    public Canario(String nombre, String estado, String fecha_nacimiento, int edad, String pico, boolean vuela){
        super(nombre, estado, fecha_nacimiento, edad, pico, vuela);
    }
    
    public Canario(String nombre, String estado, String fecha_nacimiento, int edad, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, estado, fecha_nacimiento, edad, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    
    @Override
    public void Habla() {
        System.out.println("Mamón");
    }
    
    @Override
    public void Muestra() {
        System.out.printf("Nombre: %s%nEstado: %s%nFecha de nacimiento: %s%nEdad: %d%nPico: %s%nColor: %s%nCanta: %s%n", getNombre(), getEstado(), getFecha_nacimiento(), getEdad(), getPico(), this.color, this.canta);    
    }
    
    @Override
    public void Volar() {
        System.out.println("El canario empieza a dar vueltas y se estampa contra la pared. En el suelo empieza a cantar.");
    }   
}
