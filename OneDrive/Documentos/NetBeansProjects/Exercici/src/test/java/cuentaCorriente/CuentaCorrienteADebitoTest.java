/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaCorriente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dvali
 */
public class CuentaCorrienteADebitoTest {
    
    private CuentaCorritenteImpl cc;
    
    public CuentaCorrienteADebitoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabando test");
    }
    
    @Before
    public void setUp() {
       cc = new CuentaCorrienteADebito("Paco",4000);
    }
    
    @After
    public void tearDown() {
        cc = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteADebito.
     */
    
    @Test //En el caso que el ingreso sea correcto.
    public void testIngresaTrue() {
        cc.ingresa(600);
        assertEquals(4600, cc.getSaldo(),1.0E-3);   
    }
      
    @Test (expected = AssertionError.class)//En el caso que el ingreso sea negativo.
    public void testIngresaNegativo(){
        cc.ingresa(-600);
        assertEquals(4000, cc.getSaldo(),1.0E-3); 
    }
    
    
    @Test //En el caso que la resta del abono sea correcto.
    public void testAbonaTrue() {     
        cc.abona(2300);
        assertEquals(1700, cc.getSaldo(),1.0E-3);     
    }
    
    @Test //En el caso de que la resta del abono sea incorrecto.
    public void testAbonaFalse() {
        cc.abona(2300);
        assertEquals(4000, cc.getSaldo(),1.0E-3);   
    }
    
    
    @Test (expected = AssertionError.class) //En el caso de que el abono sea un valor negativo.
    public void testAbonaCero() {
       cc.abona(0);
       assertEquals(4000,cc.getSaldo(),1-0E-3);
    }
    
    @Test (expected = AssertionError.class) //En el caso de que la resta del abono sea mayor al ingreso.
    public void testAbonaMax() {
        cc.abona(4001);
        assertEquals(4000, cc.getSaldo(),1.0E-3);   
    }
    
    
}
