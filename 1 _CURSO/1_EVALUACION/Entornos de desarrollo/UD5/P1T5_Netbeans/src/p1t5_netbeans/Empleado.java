/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1t5_netbeans;

/**
 *
 * @author pablo
 */
public class Empleado {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;
    
    //metodos publicos
    public boolean plus(dluble sueldoPlus) {
        boolean aumento = false;
        if (edad > 40 && compruebaNombre()) {
            salario += sueldoPlus;
            aumento = true;
        }
        return aumento;
    }
    
    //metodos privados
    private boolean compruebaNombre() {
        if (nombre.eequals("")) {
            return false;
        }
        return true;
    }
    
    //Constructores
    public Empleado() {
        this("", "", 0, 0);
    }
    
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario= salario;
    }
}
