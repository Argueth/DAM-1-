/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3UD9;

/**
 *
 * @author pabloginerbarrios
 */
public abstract class Ave extends Mascota{
    Boolean pico, vuela;
    
    public Ave(String nombre, String estado, String fecha_nacimiento, int edad){
        super(nombre, estado, fecha_nacimiento, edad);
    }
    
    public Ave(String nombre, String estado, String fecha_nacimiento, int edad, boolean pico, boolean vuela) {
        super(nombre, estado, fecha_nacimiento, edad);
        this.pico = pico;
        this.vuela = vuela;
    }
}
