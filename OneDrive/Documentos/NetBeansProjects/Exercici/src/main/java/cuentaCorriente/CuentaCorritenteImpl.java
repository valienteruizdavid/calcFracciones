/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaCorriente;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dvali
 */
public abstract class CuentaCorritenteImpl implements CuentaCorriente {
    
    private String titular;
    private double saldo;

    public CuentaCorritenteImpl(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorritenteImpl{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

    @Override
    public void ingresa(double ingreso) {
        if(ingreso <= 0){
            try{
                throw new CuentaException(1);
            } catch (Exception ex) {
                Logger.getLogger(CuentaCorritenteImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ingreso > 0){
            saldo += ingreso;
        }
    }
    
    
    
}
