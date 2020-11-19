/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr.calc;

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
public class CalculadoraFraccionesTest {
    
    private CalculadoraFracciones instance;
    
    public CalculadoraFraccionesTest() {
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
        Fraccion f1 = new Fraccion(4,3);
        Fraccion f2 = new Fraccion(8,3);
        instance = new CalculadoraFracciones(f1, f2);
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of suma method, of class CalculadoraFracciones.
     */
    @Test
    public void testSuma() {
        
        assertEquals(new Fraccion(36.0,9.0), instance.suma());
    }

    /**
     * Test of resta method, of class CalculadoraFracciones.
     */
    @Test
    public void testResta() {
        assertEquals(new Fraccion(12.0, 9.0), instance.resta());
    }

    /**
     * Test of producto method, of class CalculadoraFracciones.
     */
    @Test
    public void testProducto() {
        assertEquals(new Fraccion(32.0, 9.0), instance.producto());
    }
    
    @Test
    public void testDivision() {
        assertEquals(new Fraccion(12.0, 24.0), instance.division());
    }
    
    @Test
    public void testMCD() {
         assertEquals(3.0, instance.mcd(9.0,6.0),0.001);
    }
    
    @Test
    public void testSimplify() {
         assertEquals(new Fraccion(4.0,1.0),instance.simplify(new Fraccion(instance.suma().getNumerador(),instance.suma().getDenominador())));
    }
    
}
