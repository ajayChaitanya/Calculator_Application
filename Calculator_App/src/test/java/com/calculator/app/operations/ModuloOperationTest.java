package com.calculator.app.operations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ModuloOperationTest {

    @Test
    public void testModulo() {
        ModuloOperation operation = new ModuloOperation(10, 11);
        assertEquals(10.0,operation.getResult(), 0.001);
    }

}
