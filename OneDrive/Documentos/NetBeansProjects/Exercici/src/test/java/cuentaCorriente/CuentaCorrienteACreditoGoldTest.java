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
public class CuentaCorrienteACreditoGoldTest {
    
    private CuentaCorritenteImpl cc;
    
    public CuentaCorrienteACreditoGoldTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("AcabandoTest");
    }
    
    @Before
    public void setUp() {
        cc = new CuentaCorrienteACreditoGold("Sonia",100);
    }
    
    @After
    public void tearDown() {
        cc = null;
    }

    /**
     * Test of abona method, of class CuentaCorrienteACreditoGold.
     */
    
    @Test (expected = AssertionError.class)//En el caso de que el descubierto de la tarjeta GOLD sea superado.
    public void testDescubiertoGoldFalse() {
        cc.abona(3200);
        assertEquals(100,cc.getSaldo(),1.0E-3);
    }
    
    @Test (expected = AssertionError.class)//En el caso de que el descubierto de la tarjeta GOLD no sea superado.
    public void testDescubiertoGoldTrue() {
        cc.abona(2000);
        assertEquals(100,cc.getSaldo(),1.0E-3);
    }
   
    @Test //En el caso de que el ingreso sea correcto.
    public void testIngresaTrue() {
       cc.ingresa(900);
       assertEquals(1000,cc.getSaldo(),1-0E-3);
    }
    
    @Test (expected = AssertionError.class)//En el caso de que el ingreso sea 0.
    public void testIngresaZero() {
       cc.ingresa(0);
       assertEquals(100,cc.getSaldo(),1-0E-3);
    }
    
    @Test //En el caso de que el abono sea correcto.
    public void testAbonaTrue() {
       cc.abona(20);
       assertEquals(80,cc.getSaldo(),1-0E-3);
    }
    
    @Test //En el caso de que el abono sea incorrecto.
    public void testAbonaFalse() {
       cc.abona(20);
       assertEquals(70,cc.getSaldo(),1-0E-3); 
    }
    
    
}
