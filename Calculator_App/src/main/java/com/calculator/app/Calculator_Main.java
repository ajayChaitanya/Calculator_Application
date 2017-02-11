package com.calculator.app;

import com.calculator.app.operators.*;
import com.calculator.app.util.CalculatorUtil;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Calculator_Main {

    

    public static void main(String args[]) throws Exception {

    	//Pass it as a string in command line argument : Eg : "1 + 1 - 4 * 4"
        if(args.length == 0) return;;
        String input = args[0];
 
        if(input == null || input.isEmpty()) return;

        String[] expression = processInputString(input);
        if(expression == null || expression.length < 3) return;

        CalculatorUtil util = new CalculatorUtil();
        System.out.println(input +" = "+util.calculate(expression));

    }


    private static String[] processInputString(String expression) {

        //Add User Defined Operand here
        String[] tokens = expression.replaceAll("\\s+", "").split("(?<=[-+*/$%])|(?=[-+*/$%])");
   
        return tokens;
    }



}
