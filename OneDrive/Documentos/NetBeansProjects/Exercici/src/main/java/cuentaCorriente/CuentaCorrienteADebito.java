
package cuentaCorriente;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CuentaCorrienteADebito extends CuentaCorritenteImpl {
    
    public CuentaCorrienteADebito(String titular, double saldo) {
        super(titular, saldo);
    }

    
    
    @Override
    public void abona(double abono) {
        if(abono < 0){
            try{
                throw new CuentaException(1);
            } catch (CuentaException ex) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(getSaldo() >= abono){
            setSaldo(getSaldo()-abono);
        } else{
            try{
                throw new CuentaException(5);
            } catch (CuentaException ex) {
                Logger.getLogger(CuentaCorrienteADebito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
