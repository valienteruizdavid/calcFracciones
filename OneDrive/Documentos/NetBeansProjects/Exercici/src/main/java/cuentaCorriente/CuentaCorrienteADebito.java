
package cuentaCorriente;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CuentaCorrienteADebito extends CuentaCorritenteImpl {
    
    public CuentaCorrienteADebito(String titular, double saldo) {
        super(titular, saldo);
    }

    
    
    @Override
    public void abona(double abono) {
        
            try{
                if(abono <= 0){
                throw new CuentaException(2);
                }
            }catch (CuentaException ex) {
                System.out.println(ex.MissatgeError());
            }
        
        if(saldo >= abono){
           saldo-=abono;
        } else{
            try{
                throw new CuentaException(5);
            } catch (CuentaException ex) {
                System.out.println(ex.MissatgeError());
            }
        }
    }
    
}
