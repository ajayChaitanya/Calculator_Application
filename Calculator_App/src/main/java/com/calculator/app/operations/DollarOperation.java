package com.calculator.app.operations;


public class DollarOperation implements Operations {

    private double no1;
    private double no2;

    public DollarOperation(double no1, double no2) {
        this.no1 = no1;
        this.no2 = no2;
    }

    public double getResult() {
        return 2*(no1+no2);
    }
}
