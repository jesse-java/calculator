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
        results = 0;
    }


    public static String numbers = "0123456789.";
    public static String operands = "+-/*";


    public void calcToResults(char cOperand, double dNum) {
            System.out.println("curr operand" + cOperand);
            System.out.println("curr num" + dNum);
//                    cOperand = calcString.charAt(i);
            if (Character.toString(cOperand).equals("+")) {
                results += dNum;
            } else if (Character.toString(cOperand).equals("-")) {
                results -= dNum;
            } else if (Character.toString(cOperand).equals("/")) {
                results /= dNum;
            } else if (Character.toString(cOperand).equals("*")) {
                results *= dNum;
            }

    }

    public void calculate() {

//        double cNum;

//        if (calcString.length() > 0) {
//            cNum = calcString.charAt(0);
////            int i = 1;
////            while ( i < calcString.length() && Character.isDigit(calcString.charAt(i))) {
////                cNum + 100 *
////            }
//
//
//        }

        boolean iNumSet = false;
        boolean iOperationDone = false;
//        boolean cOperandSet = false;
//        char iOperand = '\u0000';
        double dNum = 0;
        String sNum = "";
        char cOperand = '\u0000';
        char iOperand = '\u0000';

        for (int i = 0; i < calcString.length(); i++) {
            System.out.println("current char " + calcString.charAt(i));
            if (Character.isDigit(calcString.charAt(i))) {
                sNum += calcString.charAt(i);
            } else {
                dNum = Double.parseDouble(sNum);
                System.out.println(dNum);

                if (iOperand == '\u0000' && !iNumSet) {
                    System.out.println("initial set up");
                    iOperand = calcString.charAt(i);
                    results = dNum;
                    iNumSet = true;
                    sNum = "";
                    System.out.println("current results " + results);
                } else if (iOperationDone == false) {
                    System.out.println("initial calculation");
                    calcToResults(iOperand, dNum);
                    sNum = "";
                    iOperationDone = true;
                    cOperand = calcString.charAt(i);
                    System.out.println("current results " + results);
                } else {

                    System.out.println("everything else");
//                    cOperand = calcString.charAt(i);
                    calcToResults(cOperand, dNum);
                    sNum = "";
                    System.out.println("current results " + results);
                    cOperand = calcString.charAt(i);

                }
            }
        }

        System.out.println("end calculation");
        dNum = Double.parseDouble(sNum);
        calcToResults(cOperand, dNum);


//                if (iOperandSet == true){
////                    dNum = Double.parseDouble(sNum);
//                    if (Character.toString(cOperand).equals("+")) {
//                        results += dNum;
//                    } else if (Character.toString(cOperand).equals("-")) {
//                        results -= dNum;
//                    } else if (Character.toString(cOperand).equals("/")) {
//                        results /= dNum;
//                    } else if (Character.toString(cOperand).equals("*")) {
//                        results *= dNum;
//                    }
//                }

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
    }
//
//
//
//
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
