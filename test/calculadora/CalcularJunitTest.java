/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nathaly
 */
public class CalcularJunitTest {
    
    private Soma s;
    private Subtracao su;
    private Multiplicacao m;
    private Divisao d;
    
    public CalcularJunitTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    //Método para inicializar classes
    @Before
    public void setUp() {
        s = new Soma();
        su = new Subtracao();
        m = new Multiplicacao();
        d = new Divisao();
    }
    
    @After
    public void tearDown() {
    }

    // Quando a classe for iniciada, esse metodo sera testado
    @Test
    public void testSomarDoisNumerosPositivos() {
        assertEquals(true,s.Somar(2, 2));
    }

    
 
    @Test
    public void testSomarDoisNumerosSendoZero() {
        assertEquals(true,s.Somar(2, 0));
    }

    @Test
    public void testSomarDoisNumerosSendoDoisZeros() {
        assertEquals(true,s.Somar(0, 0));
    }

    @Test
    public void testSomarDoisNumerosSendoNegativo() {
        assertEquals(true,s.Somar(2, -2));
    }

    @Test
    public void testSubtracaoDoisNumeros() {
        assertEquals(true,su.Subtrair (5, 2));
    }

    @Test
    public void testSubtracaoDoisNumerosSendoZero() {
        assertEquals(true,su.Subtrair (5, 0));
    }
    
    @Test
    public void testSubtracaoDoisNumerosSendoDoisZeros() {
        assertEquals(true,su.Subtrair (0, 0));
    }

    @Test
    public void testSubtracaoDoisNumerosSendoNegativo() {
        assertEquals(true,su.Subtrair (5, -2));
    }

    @Test
    public void testMultiplicacaoDoisNumeros() {
        assertEquals(true,m.Multiplicar (8, 6));
    }

    @Test
    public void testMultiplicacaoDoisNumerosSendoZero() {
        assertEquals(true,m.Multiplicar (8, 0));
    }

    @Test
    public void testMultiplicacaoDoisNumerosSendoDoisZeros() {
        assertEquals(true,m.Multiplicar (0, 0));
    }

    @Test
    public void testMultiplicacaoDoisNumerosSendoNegativo() {
        assertEquals(true,m.Multiplicar (8, -6));
    }

    @Test
    public void testDivisaoDoisNumeros() {
        assertEquals(true,d.Dividir (3, 3));
    }

    @Test
    public void testDivisaoDoisNumerosSendoZero() {
        assertEquals(true,d.Dividir (3, 0));
    }

    @Test
    public void testDivisaoDoisNumerosSendoDoisZeros() {
        assertEquals(true,d.Dividir (0, 0));
    }

    @Test
    public void testDivisaoDoisNumerosSendoNegativo() {
        assertEquals(true,d.Dividir (5, -2));
    }
 
}
