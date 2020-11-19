
package cuentaCorriente;


public class CuentaMain {

    
    public static void main(String[] args) {
        
        CuentaCorriente cc1 = new CuentaCorrienteACreditoPlatinum("Paco", 4000);
        
        cc1.ingresa(1000);
        cc1.abona(10);
        System.out.println(cc1);
        
        CuentaCorriente cc2 = new CuentaCorrienteACreditoGold("Luis", 100);
        
        cc2.ingresa(300);
        cc2.abona(3000);
        System.out.println(cc2);
        
        CuentaCorriente cc3 = new CuentaCorrienteADebito("Juana", 1500);
        cc3.ingresa(1000);
        cc3.abona(100);
        System.out.println(cc3);
    }
    
}
