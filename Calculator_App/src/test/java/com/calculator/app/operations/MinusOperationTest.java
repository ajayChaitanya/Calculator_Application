package com.calculator.app.operations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class MinusOperationTest {

    @Test
    public void testMinus() {
        MinusOperation operation = new MinusOperation(10, 2);
        assertEquals(8.0,operation.getResult(), 0.001);
    }

}
