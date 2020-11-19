/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03uf05review2.regexpr;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dvali
 */
public class RegExprMainTest {
    
    public RegExprMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         System.out.println("Iniciant test");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Acabant test");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of NIFValidator method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testNIFValidator() {
        assertTrue(RegExprMain.NIFValidator("12345678H"));
        assertFalse(RegExprMain.NIFValidator("445Q19877"));
    }

    /**
     * Test of NIEValidator method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testNIEValidator() {
        assertTrue(RegExprMain.NIEValidator("X4992113F"));
        assertFalse(RegExprMain.NIEValidator("W5556889C"));
    }

    /**
     * Test of telefonoValidator method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testTelefonoValidator() {
       assertTrue(RegExprMain.telefonoValidator("934457781"));
       assertFalse(RegExprMain.telefonoValidator("334"));
    }

    /**
     * Test of telfEspañolValidator method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testTelfEspañolValidator() {
       assertTrue(RegExprMain.telfEspañolValidator("+34 934457783"));
       assertFalse(RegExprMain.telfEspañolValidator("334"));
    }

    /**
     * Test of matriculaCocheValidator method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testMatriculaCocheValidator() {
       assertTrue(RegExprMain.matriculaCocheValidator("1113 DTR"));
       assertFalse(RegExprMain.matriculaCocheValidator("3349FYYT"));
    }

    /**
     * Test of fechaValidator method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testFechaValidator() {
       assertTrue(RegExprMain.fechaValidator("12/12/2012"));
       assertFalse(RegExprMain.fechaValidator("68/11/3"));
    }

    /**
     * Test of emailValidator method, of class RegExprMain.
     */
    @Test
    @Disabled
    public void testEmailValidator() {
       assertTrue(RegExprMain.emailValidator("davidvaliente@gmail.com"));
       assertFalse(RegExprMain.emailValidator("davidvaliente.com"));
    }

  
      
    
}
