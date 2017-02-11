package com.calculator.app.operations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;



public class DollarOperationTest {

    @Test
    public void testDollar() {
        DollarOperation operation = new DollarOperation(10, 2);
        assertEquals(24.0,operation.getResult(), 0.001);
    }

}
