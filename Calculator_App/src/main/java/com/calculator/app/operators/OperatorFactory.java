package com.calculator.app.operators;

import com.calculator.app.operations.*;


public class OperatorFactory {

    public Operations getOperations(Character operator, double no1, double no2) throws Exception {

        if(operator.equals(Operator.PLUS.sign)) return new PlusOperation(no1, no2);
        if(operator.equals(Operator.MINUS.sign)) return new MinusOperation(no1, no2);
        if(operator.equals(Operator.MULTIPLY.sign)) return new MultiplyOperation(no1, no2);
        if(operator.equals(Operator.DIVIDE.sign)) return new DivideOperation(no1, no2);
        if(operator.equals(Operator.MODULO.sign)) return new ModuloOperation(no1, no2);
        if(operator.equals(Operator.DOLLAR.sign)) return new DollarOperation(no1, no2);

        throw new Exception("Invalid Operator Symbol");

    }

    public int getPriority(Character operator) throws Exception {

        if(operator.equals(Operator.PLUS.sign)) return Operator.PLUS.priority;
        if(operator.equals(Operator.MINUS.sign)) return Operator.MINUS.priority;
        if(operator.equals(Operator.MULTIPLY.sign)) return Operator.MULTIPLY.priority;
        if(operator.equals(Operator.DIVIDE.sign)) return Operator.DIVIDE.priority;
        if(operator.equals(Operator.MODULO.sign)) return Operator.MODULO.priority;
        if(operator.equals(Operator.DOLLAR.sign)) return Operator.DOLLAR.priority;

        throw new Exception("Invalid Operator Symbol");

    }

}
