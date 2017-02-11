package com.calculator.app.util;

import com.calculator.app.operators.Calculator;
import com.calculator.app.operators.Operator;
import com.calculator.app.operators.OperatorFactory;


import java.util.List;
import java.util.Stack;

public class CalculatorUtil {

    private Stack<String> stack;
    private List<String> operator;

    public CalculatorUtil() {
        this.stack = new Stack<>();
        this.operator = Operator.getValues();
    }

    public double calculate(String[] expression) throws Exception {

        OperatorFactory operatorFactory = new OperatorFactory();

        for(int i=0; i<expression.length; i++ ) {

            String str = expression[i];

            if (!operator.contains(str)) {
                stack.push(str);
            } else if (operatorFactory.getPriority(str.charAt(0)) == Priority.LOW_PRIORITY) {
                stack.push(str);
            } else {
                i++;
                if (i >= expression.length) throw new Exception("Invalid Expression");
                String right = expression[i];
                if (stack.isEmpty()) throw new Exception("Invalid Expression");
                String left = stack.pop();
                stack.push(processExpression(left, str, right));
            }
        }


        return calculateResult();
    }

    private static double processInput(Character sign, double left, double right) throws Exception {

        return new Calculator(left, right, sign).getResult();
    }

    private String processExpression(String left, String sign, String right) throws Exception {

        if (operator.contains(right)) throw new Exception("Invalid Expression");
        double dRight = Double.parseDouble(right);
        if (operator.contains(left))
            throw new Exception("Invalid Expression");
        double dLeft = Double.parseDouble(left);
        double result =  processInput(sign.charAt(0), dLeft, dRight);
        return Double.toString(result);
    }

    private double calculateResult(Stack<String> stack) throws Exception {

        while(!stack.isEmpty() && stack.size()>=3) {
            String c1 = stack.pop();
            if (operator.contains(c1))
                throw new Exception("Invalid Expression");
            double left = Double.parseDouble(c1);
            String c2 = stack.pop();
            if (!operator.contains(c2))
                throw new Exception("Invalid Expression");
            String c3 = stack.pop();
            if (operator.contains(c3))
                throw new Exception("Invalid Expression");
            double right = Double.parseDouble(c3);
            stack.push(Double.toString(processInput(c2.charAt(0), left, right)));
        }

        if(stack.size() != 1) throw new Exception("Invalid Expression");
        return Double.parseDouble(stack.pop());

    }

    private double calculateResult() throws Exception {

        Stack<String> reverseStack = new Stack<>();

        while (!stack.isEmpty()) {
            reverseStack.add(stack.pop());
        }

        return calculateResult(reverseStack);
    }

}