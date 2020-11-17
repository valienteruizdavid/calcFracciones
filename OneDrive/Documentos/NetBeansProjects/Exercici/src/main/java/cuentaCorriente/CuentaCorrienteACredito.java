/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaCorriente;

/**
 *
 * @author dvali
 */
public abstract class CuentaCorrienteACredito extends CuentaCorritenteImpl {
    
    public CuentaCorrienteACredito(String titular, double saldo) {
        super(titular, saldo);
    }
    
}
