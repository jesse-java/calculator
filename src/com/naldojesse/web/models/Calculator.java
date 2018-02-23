package com.naldojesse.web.models;

import java.util.ArrayList;

public class Calculator implements java.io.Serializable {
    private double results;
    private ArrayList<Double> numbers = new ArrayList<>();
    private ArrayList<String> operands = new ArrayList<>();

    public Calculator() {

    }

    private void calculate() {
        results = numbers.get(0);
        System.out.println(results);
        System.out.println(operands.size());
        for (int i = 0; i < operands.size(); i++) {
            if (operands.get(i).equals("+")) {
                results += numbers.get(i+1);
            } else if (operands.get(i).equals("-")) {
                results -= numbers.get(i+1);
            } else if (operands.get(i).equals("*")) {
                results *= numbers.get(i+1);
            } else if (operands.get(i).equals("/")) {
                results /= numbers.get(i+1);
            }
        }
    }


//    public String getCalculatorString() {
//
//    }

    public void performOperation (String operand) {
            operands.add(operand);
    }

    public void performOperation(Double number) {
        numbers.add(number);
    }

    public Calculator performOperation() {
        calculate();
        return this;
    }

    public double getResults() {
        return results;
    }
}
