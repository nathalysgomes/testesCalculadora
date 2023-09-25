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
        assertEquals(4,s.Somar(2, 2));
    }

    
 
    @Test
    public void testSomarDoisNumerosSendoZero() {
        assertEquals(2,s.Somar(2, 0));
    }

    @Test
    public void testSomarDoisNumerosSendoDoisZeros() {
        assertEquals(0,s.Somar(0, 0));
    }

    @Test
    public void testSomarDoisNumerosSendoNegativo() {
        assertEquals(0,s.Somar(2, -2));
    }

    @Test
    public void testSubtracaoDoisNumeros() {
        assertEquals(3,su.Subtrair (5, 2));
    }

    @Test
    public void testSubtracaoDoisNumerosSendoZero() {
        assertEquals(5,su.Subtrair (5, 0));
    }
    
    @Test
    public void testSubtracaoDoisNumerosSendoDoisZeros() {
        assertEquals(0,su.Subtrair (0, 0));
    }

    @Test
    public void testSubtracaoDoisNumerosSendoNegativo() {
        assertEquals(7,su.Subtrair (5, -2));
    }

    @Test
    public void testMultiplicacaoDoisNumeros() {
        assertEquals(48,m.Multiplicar (8, 6));
    }

    @Test
    public void testMultiplicacaoDoisNumerosSendoZero() {
        assertEquals(0,m.Multiplicar (8, 0));
    }

    @Test
    public void testMultiplicacaoDoisNumerosSendoDoisZeros() {
        assertEquals(0,m.Multiplicar (0, 0));
    }

    @Test
    public void testMultiplicacaoDoisNumerosSendoNegativo() {
        assertEquals(-48,m.Multiplicar (8, -6));
    }

    @Test
    public void testDivisaoDoisNumeros() {
        assertEquals(1,d.Dividir (3, 3));
    }

    @Test
    public void testDivisaoDoisNumerosSendoZero() {
        assertEquals(0,d.Dividir (3, 0));
    }

    @Test
    public void testDivisaoDoisNumerosSendoDoisZeros() {
        assertEquals(0,d.Dividir (0, 0));
    }

    @Test
    public void testDivisaoDoisNumerosSendoNegativo() {
        assertEquals(-1,d.Dividir (5, -5));
    }
 
}
