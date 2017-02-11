package com.calculator.app.util;

import com.calculator.app.operators.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorUtilTest {

    @Test
    public void testCalculateDivide() throws Exception {
        CalculatorUtil util = new CalculatorUtil();
        assertEquals(10.0, util.calculate(new String[]{"20","/","2"}), 0.001);
    }

    @Test
    public void testCalculateDollar() throws Exception {
        CalculatorUtil util = new CalculatorUtil();
        assertEquals(24.0, util.calculate(new String[]{"10","$","2"}), 0.001);
    }

    @Test
    public void testCalculateMinus() throws Exception {
        CalculatorUtil util = new CalculatorUtil();
        assertEquals(8.0, util.calculate(new String[]{"10","-","2"}), 0.001);
    }

    @Test
    public void testCalculateModulo() throws Exception {
        CalculatorUtil util = new CalculatorUtil();
        assertEquals(0.0, util.calculate(new String[]{"10","%","2"}), 0.001);
    }

    @Test
    public void testCalculateMultiply() throws Exception {
        CalculatorUtil util = new CalculatorUtil();
        assertEquals(20.0, util.calculate(new String[]{"10","*","2"}), 0.001);
    }

    @Test
    public void testCalculatePlus() throws Exception {
        CalculatorUtil util = new CalculatorUtil();
        assertEquals(12.0, util.calculate(new String[]{"10","+","2"}), 0.001);
    }

    @Test
    public void testCalculateBigExpression() throws Exception {
        CalculatorUtil util = new CalculatorUtil();
        assertEquals(16.0, util.calculate(new String[]{"10","+","2","*","3"}), 0.001);
    }

    @Test(expected = Exception.class)
    public void testInvalidUserSymbol() throws Exception {
        CalculatorUtil util = new CalculatorUtil();
        assertEquals(8.0, util.calculate(new String[]{"10","-","2","+"}), 0.001);

    }

    @Test(expected = Exception.class)
    public void testInvalidInput() throws Exception {
        CalculatorUtil util = new CalculatorUtil();
        assertEquals(8.0, util.calculate(new String[]{"10","-","a"}), 0.001);

    }

}
