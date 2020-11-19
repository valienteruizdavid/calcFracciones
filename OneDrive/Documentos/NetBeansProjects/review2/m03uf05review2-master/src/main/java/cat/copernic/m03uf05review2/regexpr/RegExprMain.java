/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegExprMain {
    
   public static boolean NIFValidator(String txt){
        Pattern p = Pattern.compile("\\d{8}\\p{Upper}");
        java.util.regex.Matcher m = p.matcher(txt);
        return m.matches();
    }
    
    public static boolean NIEValidator(String txt){
       Pattern p = Pattern.compile("[X]\\d{7}\\p{Upper}");
       java.util.regex.Matcher m = p.matcher(txt);
       return m.matches(); 
    }
    
    public static boolean telefonoValidator(String txt){
       Pattern p = Pattern.compile("\\d{9}");
       java.util.regex.Matcher m = p.matcher(txt);
       return m.matches(); 
    }
    
    public static boolean telfEspañolValidator(String txt){
       Pattern p = Pattern.compile("^\\+34\\s\\d{9}");
       java.util.regex.Matcher m = p.matcher(txt);
       return m.matches(); 
    }
    
    public static boolean matriculaCocheValidator(String txt){
       Pattern p = Pattern.compile("\\d{4}\\s[^AEIOU]{3}");
       java.util.regex.Matcher m = p.matcher(txt);
       return m.matches();  
    }
    
    public static boolean fechaValidator(String txt){
      Pattern p = Pattern.compile("[1-9][0-9]\\/[0-1][1-2]\\/\\d{4}");
       java.util.regex.Matcher m = p.matcher(txt);
       return m.matches();  
    }
    
    public static boolean emailValidator(String txt){
      Pattern p = Pattern.compile("[a-zA-Z]+\\.*{0,}[a-zA-Z]*{0,}\\@[a-zA-Z]+\\.??[a-z]*+\\.[a-z]{2,}");
       java.util.regex.Matcher m = p.matcher(txt);
       return m.matches();  
    }
    
    //Expresión regular que valide una forma AA999AA donde la segunda AA es igual a la primera AA.
    
    public static boolean grupoCaptura(String txt){
       Pattern p = Pattern.compile("^((\\p{Alpha})(\\p{Alpha})(\\d{3}))\\2$");
       java.util.regex.Matcher m = p.matcher(txt);
       return m.matches();  
    }
    

    /**
     * 
     * Expresión regular que valide un NIF.
     * Expresión regular que valide un NIE.
     * Expresión regular que valide un teléfono.
     * Expresión que valide un teléfono de españa.
     * Expresión regular que valide una matrícula (4 dígitos espacio 3 letras mayúsculas sin vocales.
     * Expresión regular que valide una fecha formato dd/mm/aaaa.
     * Expresion que valide un email.
     */
    public static void main(String[] args) {
      
        /*Pattern p = Pattern.compile("[a-z&&[^m-p]]0");
        java.util.regex.Matcher m1 = p.matcher("a0");
        java.util.regex.Matcher m2 = p.matcher("m0");
        boolean b1 = m1.matches();
        boolean b2 = m2.matches();
        System.out.println(b1);*/
        System.out.println(NIFValidator("46378979G"));
        System.out.println(NIEValidator("X8211131W"));
        System.out.println(telefonoValidator("643567790"));
        System.out.println(telfEspañolValidator("+34 934557812"));
        System.out.println(matriculaCocheValidator("5779 FQW"));
        System.out.println(fechaValidator("30/11/2020"));
        System.out.println(emailValidator("david.valiente@gmail.ff.perez"));
        System.out.println(grupoCaptura("AA999AA"));
    }
    
}
