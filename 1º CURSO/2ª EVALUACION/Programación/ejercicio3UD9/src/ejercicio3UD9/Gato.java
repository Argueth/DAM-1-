/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3UD9;

/**
 *
 * @author pabloginerbarrios
 */
public class Gato extends Mascota{
    private String color;
    private boolean pelo_largo;
    
    public Gato(String nombre, String estado, String fecha_nacimiento, int edad){
        super(nombre, estado, fecha_nacimiento, edad);
    }
    
    public Gato(String nombre, String estado, String fecha_nacimiento, int edad, String color, boolean pelo_largo) {
        
        super(nombre, estado, fecha_nacimiento, edad);
        this.color = color;
        this.pelo_largo = pelo_largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getPelo_largo() {
        return pelo_largo;
    }

    public void setPelo_largo(boolean pelo_largo) {
        this.pelo_largo = pelo_largo;
    }
    
    public void Habla() {
        System.out.println("Miau Miau");
    }
    
    public String Muestra() {
        return String.format("Nombre: %s%nEstado: %s%nFecha de nacimiento: %s%nEdad: %d%ncolor: %s%nPelo largo: %b%n", getNombre(), getEstado(), getFecha_nacimiento(), getEdad(), getColor(), getPelo_largo());
    }
}
