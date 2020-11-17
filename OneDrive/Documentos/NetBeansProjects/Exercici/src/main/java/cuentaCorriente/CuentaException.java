
package cuentaCorriente;


public class CuentaException extends Exception {

    private int error;
    
    public CuentaException(int e) {
        this.error = e;
    }

    public String MissatgeError(){
        
        String resultat = "";
        switch (error){
            case 1:
                resultat = "Esta cantidad no es aceptable para ingresar";
                break;
            case 2:
                resultat = "Esta cantidad no es aceptable para retirar";
                break;
            case 3:
                resultat = "Has superado el límite de la tarjeta gold";
                break;
            case 4:
                resultat = "Has superado el límite de la tarjeta platinum";
                break;
            case 5:
                resultat = "No tienes suficiente dinero";
                break;
        }
        return resultat;
    }
}
