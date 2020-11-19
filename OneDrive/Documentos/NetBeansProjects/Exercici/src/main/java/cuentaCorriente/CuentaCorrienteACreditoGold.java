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
public class CuentaCorrienteACreditoGold extends CuentaCorrienteACredito{
    
    public CuentaCorrienteACreditoGold(String titular, double saldo) {
        super(titular, saldo);
    }

    
    @Override
    public void abona(double abono) {
        if(abono <= 0){
            try {
               throw new CuentaException(2); 
            } catch (CuentaException ex) {
                System.out.println(ex.MissatgeError());
            }
        }
        
        if(saldo+3_000 >= abono){
            saldo-=abono;
        } else{
            try{
                throw new CuentaException(3);
            } catch (CuentaException ex) {
                System.out.println(ex.MissatgeError());
            }
        }
        
    }
    
}
