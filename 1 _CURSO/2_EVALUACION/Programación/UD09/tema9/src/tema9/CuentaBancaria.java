/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9;

/**
 *
 * @author mc_ut
 */
public class CuentaBancaria {
    
    private final String iban, nombre, apellidos;
    private double saldo;
    private int indiceHistorico;
    private double movimientos[];
    
    public CuentaBancaria(String iban, String nombre, String apellidos){
        
        this.iban = iban;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.movimientos = new double[100];
        this.saldo = 0;
        this.indiceHistorico = 0;
    }

    public String getIban() {
        return iban;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getSaldo() {
        return saldo;
    }

    public double[] getMovimientos() {
        return movimientos;
    }
    
    public void ingresar (double cantidad){
        historico(cantidad);
    }
    
    public void retirar(double cantidad) {
        historico(-cantidad);
    }
    
    public void historico(double cantidad) {
        
        if ((this.saldo+cantidad)<-50) {
            System.out.println("No se puede recoger el dinero por deuda superior a 50 euros.");
        }else {
            this.saldo+=cantidad;
            movimientos[indiceHistorico]=cantidad;
            this.indiceHistorico++;
            if (cantidad > 3000) {
                System.out.println("AVISO: Notificar a hacienda");
            }
            if ((this.saldo+cantidad)<0) {
                System.out.println("AVISO: Saldo negativo");
            }
        }       
    }
    
    public void mostrarMovimientos() {
        System.out.println("MOVIMIENTO DE LA CUENTA");
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i]!=0) {
                System.out.printf("%d - %.2f%n", i, movimientos[i]);
            }
        }
    }
    
    @Override
    public String toString() {
        return String.format("IBAN: %s%nNombre del titular: %s %s%nSaldo: %f%n", this.iban, this.nombre, this.apellidos, this.saldo);
    }
    
}
