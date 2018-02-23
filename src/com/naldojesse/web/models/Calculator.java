package com.naldojesse.web.models;

import java.util.ArrayList;

public class Calculator implements java.io.Serializable {
    private double results;
    private String calcString;
//    private ArrayList<Double> numbers;
//    private ArrayList<String> operands;

//    public Calculator() {
////        numbers = new ArrayList<>();
////        operands = new ArrayList<>();
////        calcString.append("");
//    }

    public Calculator() {
        calcString = "";
    }


    public static String numbers = "0123456789.";
    public static String operands = "+-/*";


//    public void calculate() {
//
//        String cNum = null;
//        String cOperand;
//
//        int i = 1;
//
//        //iterating through calcString
//        while(i < calcString.length()) {
//
//            String cIter = Character.toString(calcString.charAt(i));
//
//            if (Character.isDigit(calcString.charAt(i))) {
//                if (cNum == null) {
//
//                }
//            } else if (cIter.contains(operands)) {
//                cOperand = cIter;
//            }
//    }




//
//        for (int i = 1; i < calcString.length(); i++) {
//            if (i % 2 != 0) {
//                if (Character.toString(cOperand).equals("+")) {
//                    results += calcString.charAt(i);
//                } else if (Character.toString(cOperand).equals("-")) {
//                    results -= calcString.charAt(i);
//                } else if (Character.toString(cOperand).equals("/")) {
//                    results = results / calcString.charAt(i);
//                } else if (Character.toString(cOperand).equals("*")) {
//                    results *= calcString.charAt(i);
//                }
//            } else {
//                cOperand = calcString.charAt(i);
//            }
//        }
    }

    public void setCalcString(String calcString) {
        this.calcString = calcString;
    }

    public String getCalcString() {
        return calcString;
    }

    public double getResults() {
        return results;
    }




//    private void calculate() {
//        results = numbers.get(0);
//        System.out.println(results);
//        System.out.println(operands.size());
//        for (int i = 0; i < operands.size(); i++) {
//            if (operands.get(i).equals("+")) {
//                results += numbers.get(i+1);
//            } else if (operands.get(i).equals("-")) {
//                results -= numbers.get(i+1);
//            } else if (operands.get(i).equals("*")) {
//                results *= numbers.get(i+1);
//            } else if (operands.get(i).equals("/")) {
//                results /= numbers.get(i+1);
//            }
//        }
//    }

//    public void performOperations(String inputStr) {
////        numbers = new ArrayList<>();
////        operands = new ArrayList<>();
//
//    }

//    public void performOperation (String operand) {
//        operands.add(operand);
//        calcString.append(operand);
//    }
//
//    public void performOperation(Double number) {
//        numbers.add(number);
//        calcString.append(number);
//    }
//
//    public Calculator performOperation() {
//        calculate();
//        return this;
//    }


}
