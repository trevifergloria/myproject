package com.fordtest;

import com.fordtest.Service.CalculatorService;

public class Calculator {

    CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public int performSomeOperation(int i, int j){
        return calculatorService.add(i,j)*2;
    }

    public int someOperationDifference(int a, int b){
        return calculatorService.dif(a,b) -3;
    }
}
