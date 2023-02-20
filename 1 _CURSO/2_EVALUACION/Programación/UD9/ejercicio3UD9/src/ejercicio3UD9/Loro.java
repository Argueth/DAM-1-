/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3UD9;

/**
 *
 * @author pabloginerbarrios
 */
public class Loro extends Ave{
    private String origen;
    private boolean habla;
    
    public Loro(String nombre, String estado, String fecha_nacimiento, int edad, String pico, boolean vuela){
        super(nombre, estado, fecha_nacimiento, edad, pico, vuela);
    }
    
    public Loro(String nombre, String estado, String fecha_nacimiento, int edad, String pico, boolean vuela, String origen, boolean habla) {
        super(nombre, estado, fecha_nacimiento, edad, pico, vuela);
        
        this.origen = origen;
        this.habla = habla;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    
    
    @Override
    public void Muestra() {   
        System.out.printf("Nombre: %s%nEstado: %s%nFecha de nacimiento: %s%nEdad: %d%nPico: %s%nOrigen: %s%nCanta: %s%n", getNombre(), getEstado(), getFecha_nacimiento(), getEdad(), getPico(), this.origen, this.habla);
    }
    
    public void Saluda() {
        int opcion = (int)(Math.random()*10);
        
        switch (opcion) {
            case 0:
                System.out.println("Hijoputa!! Hijoputa!! Que por qué? Porque lo digo yo!!");
                break;
            case 1:
                System.out.println("Hola, guapa!!");
                break;
            case 2:
                System.out.println("Qué guarro!! Qué guarro!!");
                break;
            case 3:
                System.out.println("Pirata piratón con la pata de palo...");
                break;
            case 4:
                System.out.println("No sigas por ahí...");
                break;
            case 5:
                System.out.println("El loro te ignora");
                break;
            case 6:
                System.out.println("Dejame en paz.");
                break;
            case 7:
                System.out.println("Adiós.");
                break;
            case 8:
                System.out.println("Eso es mentira!!");
                break;
            case 9:
                System.out.println("Por qué me dejó?");
                break;
            case 10:
                System.out.println("Aaaaaaah... ritmo de la nocheeeeee...!");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    @Override
    public void Volar() {
        if (vuela) {
            System.out.println("EL loro empieza a volar por la avitación como un loco de mierda.");
        }
    }
    
    @Override
    public void Habla() {
        int opcion = (int)(Math.random()*10);
        
        switch (opcion) {
            case 0:
                System.out.println("Hijoputa!! Hijoputa!! Que por qué? Porque lo digo yo!!");
                break;
            case 1:
                System.out.println("Hola, guapa!!");
                break;
            case 2:
                System.out.println("Qué guarro!! Qué guarro!!");
                break;
            case 3:
                System.out.println("Pirata piratón con la pata de palo...");
                break;
            case 4:
                System.out.println("No sigas por ahí...");
                break;
            case 5:
                System.out.println("El loro te ignora");
                break;
            case 6:
                System.out.println("Dejame en paz.");
                break;
            case 7:
                System.out.println("Adiós.");
                break;
            case 8:
                System.out.println("Eso es mentira!!");
                break;
            case 9:
                System.out.println("Por qué me dejó?");
                break;
            case 10:
                System.out.println("Aaaaaaah... ritmo de la nocheeeeee...!");
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
        
