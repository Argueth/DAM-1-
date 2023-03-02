/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4UDD9;

/**
 *
 * @author pablo
 */
public class CuentaAhorro extends CuentaBancaria {
    
    static double saldoMinimo = 1000.00;
    
    public CuentaAhorro(String IBAN, double saldo) {
        super(IBAN, saldo);
    }
    
    @Override
    public void calcularIntereses() {
        if (this.saldo < saldoMinimo) {
            this.saldo*=(interesAnualBasico/2);
        }else {
            this.saldo*=(interesAnualBasico*2);
        }
    }
}
