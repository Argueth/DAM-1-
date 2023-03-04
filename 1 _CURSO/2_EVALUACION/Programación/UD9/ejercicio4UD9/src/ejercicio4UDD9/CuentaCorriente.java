/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4UDD9;

/**
 *
 * @author pablo
 */
public class CuentaCorriente extends CuentaBancaria {
    
    public CuentaCorriente(String IBAN, double saldo) {
        super(IBAN, saldo);
    }
    
    @Override
    public double calcularIntereses() {
        double interes = this.saldo*interesAnualBasico;
        return interes;
    }
}
