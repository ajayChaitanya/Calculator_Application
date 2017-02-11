package com.calculator.app.operations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlusOperationTest {

    @Test
    public void testPlus() {
        PlusOperation operation = new PlusOperation(10, 2);
        assertEquals(12.0,operation.getResult(), 0.001);
    }

}
