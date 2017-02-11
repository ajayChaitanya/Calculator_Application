package com.calculator.app.operators;

import com.calculator.app.operators.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    @Test
    public void testCalculateDivide() throws Exception {
        Calculator calculator = new Calculator(10.0, 2.0, '/');
        assertEquals(5.0,calculator.getResult(), 0.001);
    }

    @Test
    public void testCalculateDollar() throws Exception {
        Calculator calculator = new Calculator(10.0, 2.0, '$');
        assertEquals(24.0,calculator.getResult(), 0.001);
    }

    @Test
    public void testCalculateMinus() throws Exception {
        Calculator calculator = new Calculator(10.0, 2.0, '-');
        assertEquals(8.0,calculator.getResult(), 0.001);
    }

    @Test
    public void testCalculateModulo() throws Exception {
        Calculator calculator = new Calculator(10.0, 2.0, '%');
        assertEquals(0.0,calculator.getResult(), 0.001);
    }

    @Test
    public void testCalculateMultiply() throws Exception {
        Calculator calculator = new Calculator(10.0, 2.0, '*');
        assertEquals(20.0,calculator.getResult(), 0.001);
    }

    @Test
    public void testCalculatePlus() throws Exception {
        Calculator calculator = new Calculator(10.0, 2.0, '+');
        assertEquals(12.0,calculator.getResult(), 0.001);
    }

    @Test(expected = Exception.class)
    public void testInvalidUserSymbol() throws Exception {
        Calculator calculator = new Calculator(10.0, 2.0, '@');
        calculator.getResult();

    }

}
