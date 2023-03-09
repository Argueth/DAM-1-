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
    protected Boolean vuela;
    protected String pico;
    
    public Ave(String nombre, String estado, String fecha_nacimiento, int edad){
        super(nombre, estado, fecha_nacimiento, edad);
    }
    
    public Ave(String nombre, String estado, String fecha_nacimiento, int edad, String pico, boolean vuela) {
        super(nombre, estado, fecha_nacimiento, edad);
        this.pico = pico;
        this.vuela = vuela;
    }
    
    enum pico {
       largo, corto; 
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public Boolean getVuela() {
        return vuela;
    }

    public void setVuela(Boolean vuela) {
        this.vuela = vuela;
    }
    
    public abstract void Volar();
}
