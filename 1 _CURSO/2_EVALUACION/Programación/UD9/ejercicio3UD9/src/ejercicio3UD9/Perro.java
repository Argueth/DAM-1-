/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3UD9;

/**
 *
 * @author pabloginerbarrios
 */
public class Perro extends Mascota{
    private String raza;
    private boolean pulgas;
    
    public Perro(String nombre, String estado, String fecha_nacimiento, int edad){
        super(nombre, estado, fecha_nacimiento, edad);
    }
    
    public Perro(String nombre, String estado, String fecha_nacimiento, int edad, String raza, boolean pulgas) {
        
        super(nombre, estado, fecha_nacimiento, edad);
        
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean getPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
    
    @Override
    public void Habla() {
        System.out.println("Guau Guau!!!");
    }
    
    @Override
    public void Muestra() {
        System.out.printf("Nombre: %s%nEstado: %s%nFecha de nacimiento: %s%nEdad: %d%nRaza: %s%n", getNombre(), getEstado(), getFecha_nacimiento(), getEdad(), getRaza());
        if (this.pulgas) {
            System.out.println("Pulgas: SI");
        }else {
            System.out.println("Pulgas: NO");
        }
    }
}
