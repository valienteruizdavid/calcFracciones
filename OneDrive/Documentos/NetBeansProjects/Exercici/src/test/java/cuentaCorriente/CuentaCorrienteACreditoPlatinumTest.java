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
public class CuentaCorrienteACreditoPlatinumTest {
    
    private CuentaCorritenteImpl cc;
    
    public CuentaCorrienteACreditoPlatinumTest() {
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
        cc = new CuentaCorrienteACreditoPlatinum("Jose",3000);
    }
    
    @After
    public void tearDown() {
        cc = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteACreditoPlatinum.
     */
    @Test (expected = AssertionError.class) //En el caso de que se supere el descubierto de la tarjeta PLATINUM.
    public void testDescubiertoPlatinumFalse() {
        cc.abona(8500);
        assertEquals(3000,cc.getSaldo(),1.0E-3);
    }
    
   @Test (expected = AssertionError.class) //En el caso de que se NO supere el descubierto de la tarjeta PLATINUM.
    public void testDescubiertoPlatinumTrue() {
        cc.abona(7000);
        assertEquals(3000,cc.getSaldo(),1.0E-3);
    }
    
    @Test //En el caso de que el ingreso sea correcto.
    public void testIngresaTrue() {
       cc.ingresa(2000);
       assertEquals(5000,cc.getSaldo(),1-0E-3);
    }
    
    @Test (expected = AssertionError.class)//En el caso de que el ingreso sea 0.
    public void testIngresaZero() {
       cc.ingresa(0);
       assertEquals(3000,cc.getSaldo(),1-0E-3);
    }
    
    @Test //En el caso de que el abono sea correcto.
    public void testAbonaTrue() {
       cc.abona(1500);
       assertEquals(1500,cc.getSaldo(),1-0E-3);
    }
    
    @Test //En el caso de que el abono sea incorrecto.
    public void testAbonaFalse() {
       cc.abona(2000);
       assertEquals(500,cc.getSaldo(),1-0E-3); 
    }
    
}
