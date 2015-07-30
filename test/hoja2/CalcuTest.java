/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario Fernando
 */
public class CalcuTest {
    
    public CalcuTest() {
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
     * Test of setString method, of class Calcu.
     */
    @Test
    public void testSetString() {
        System.out.println("setString");
        String linea = "";
        Calcu instance = new Calcu();
        instance.setString(linea);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of meterVector method, of class Calcu.
     */
    @Test
    public void testMeterVector() {
        System.out.println("meterVector");
        Calcu instance = new Calcu();
        instance.meterVector();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularVector method, of class Calcu.
     */
    @Test
    public void testCalcularVector() {
        System.out.println("calcularVector");
        Calcu instance = new Calcu();
        boolean expResult = false;
        boolean result = instance.calcularVector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class Calcu.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Calcu instance = new Calcu();
        int expResult = 0;
        int result = instance.getResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Sumar method, of class Calcu.
     */
    @Test
    public void testSumar() {
        System.out.println("Sumar");
        int num1 = 1;
        int num2 = 1;
        Calcu instance = new Calcu();
        int expResult = 2;
        int result = instance.Sumar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Restar method, of class Calcu.
     */
    @Test
    public void testRestar() {
        System.out.println("Restar");
        int num1 = 1;
        int num2 = 1;
        Calcu instance = new Calcu();
        int expResult = 0;
        int result = instance.Restar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Multiplicar method, of class Calcu.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("Multiplicar");
        int num1 = 1;
        int num2 = 0;
        Calcu instance = new Calcu();
        int expResult = 0;
        int result = instance.Multiplicar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Dividir method, of class Calcu.
     */
    @Test
    public void testDividir() {
        System.out.println("Dividir");
        int num1 = 1;
        int num2 = 1;
        Calcu instance = new Calcu();
        int expResult = 1;
        int result = instance.Dividir(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
