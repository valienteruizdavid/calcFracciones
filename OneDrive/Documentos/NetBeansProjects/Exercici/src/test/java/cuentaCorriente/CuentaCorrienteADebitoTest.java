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
    
    public CuentaCorrienteADebitoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of abona method, of class CuentaCorrienteADebito.
     */
    @Test
    public void testAbona() {
        CuentaCorritenteImpl cc3 = new CuentaCorrienteADebito("Juana", 1500);
       
        cc3.abona(120);
        assertEquals(1380, cc3.getSaldo(),0.0);     
    }
    
    @Test
    public void testAbona2() {
        CuentaCorritenteImpl cc3 = new CuentaCorrienteADebito("Juana", -1500);
       
        cc3.abona(-120);
        assertEquals(-120, cc3.getSaldo(),0.0);     
    }
    
}
