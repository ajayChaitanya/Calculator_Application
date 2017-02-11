package com.calculator.app.operations;

import com.calculator.app.operations.Operations;


public class ModuloOperation implements Operations {

    private double no1;
    private double no2;

    public ModuloOperation(double no1, double no2) {
        this.no1 = no1;
        this.no2 = no2;
    }

    public double getResult() {
        return no1%no2;
    }


}
