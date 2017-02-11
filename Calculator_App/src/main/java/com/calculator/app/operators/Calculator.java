package com.calculator.app.operators;

import com.calculator.app.operations.Operations;


public class Calculator {

    private double no1;
    private double no2;
    private Operations operations;
    private Character operator;
    private OperatorFactory operatorFactory;


    public Calculator(double no1, double no2, Character operator) {
        this.no1 = no1;
        this.no2 = no2;
        this.operator = operator;
        this.operatorFactory = new OperatorFactory();
    }

    public double getResult() throws Exception {
        this.operations = this.operatorFactory.getOperations(operator, no1, no2);
        return operations.getResult();
    }

}
