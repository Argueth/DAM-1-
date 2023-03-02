/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4UDD9;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public abstract class CuentaBancaria {
    protected String IBAN;
    protected double saldo;
    protected static final double interesAnualBasico = 0.20;
    
    public CuentaBancaria (String IBAN, double saldo) {
        this.IBAN = IBAN;
        this.saldo = saldo;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresar(double cantidad) {
        añadir(cantidad);
    }
    
    public void retirar (double cantidad) {
        añadir(-cantidad);
    }
    
    public void Traspasar(CuentaBancaria receptor, double cantidad) {
        añadir(-cantidad);
        receptor.añadir(cantidad);
    }
    
    private void añadir(double cantidad) {
        this.saldo += cantidad;
    }
    
    public String toString() {
        return String.format("DATOS DE LA CUENTA%nIBAN; %s%nSaldo: %.2f%n", this.IBAN, this.saldo);
    }
    
    public abstract void calcularIntereses();
}
