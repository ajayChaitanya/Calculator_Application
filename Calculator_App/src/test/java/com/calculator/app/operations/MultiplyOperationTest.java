package com.calculator.app.operations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MultiplyOperationTest {

    @Test
    public void testMultiply() {
        MultiplyOperation operation = new MultiplyOperation(10, 2);
        assertEquals(20.0,operation.getResult(), 0.001);
    }

}
