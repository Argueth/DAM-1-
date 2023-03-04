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
    public double calcularIntereses() {
        double interes = 0;
        if (this.saldo < saldoMinimo) {
            interes = this.saldo*(interesAnualBasico/2);
        }else {
            interes = this.saldo*(interesAnualBasico*2);
        }
        
        return interes;
    }
}
