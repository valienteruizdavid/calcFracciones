/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr.calc;

/**
 * a/b + b/c = ((ab)+(bc)) / (bd)
 * @author dvali
 */
public class CalculadoraFracciones {
    
    private Fraccion operador1;
    private Fraccion operador2;

    public CalculadoraFracciones(Fraccion operador1, Fraccion operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    
    public Fraccion suma(){
        double denominador = operador1.getDenominador()*operador2.getDenominador();
        double numerador1 = operador1.getNumerador()*operador2.getDenominador();
        double numerador2 = operador1.getDenominador()*operador2.getNumerador();
        return new Fraccion(numerador1+numerador2,denominador);
    }
    
    public Fraccion resta(){
        double denominador = operador1.getDenominador()*operador2.getDenominador();
        double numerador1 = operador1.getNumerador()*operador2.getDenominador();
        double numerador2 = operador1.getDenominador()*operador2.getNumerador();
        return new Fraccion(numerador1-numerador2,denominador);
    }
    
    public Fraccion producto(){
        return new Fraccion(operador1.getNumerador()*operador2.getNumerador(),operador1.getDenominador()*operador2.getDenominador());
    }
    
    public Fraccion division(){
        return new Fraccion(operador1.getNumerador()*operador2.getDenominador(),operador1.getDenominador()*operador2.getNumerador());
    }
    
    public double mcd(double a, double b){
         if (b==0) {
            return a;
        } else {
            return mcd(b, a%b);
        }
    }
    
    public Fraccion simplify(Fraccion f){
        double mcd = mcd(f.getNumerador(),f.getDenominador());
        return new Fraccion(f.getNumerador()/mcd,f.getDenominador()/mcd);
    }
}
