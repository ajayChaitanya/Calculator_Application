package com.calculator.app.operations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class DivideOperationTest {

    @Test
    public void testDivide() {
        DivideOperation divideOperation = new DivideOperation(10, 2);
        assertEquals(5.0,divideOperation.getResult(), 0.001);
    }

}
