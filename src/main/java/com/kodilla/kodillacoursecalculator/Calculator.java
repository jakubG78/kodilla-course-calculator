package com.kodilla.kodillacoursecalculator;

public class Calculator {
    public Integer addNumbers (Integer numberA, Integer numberB) {
        return numberA + numberB;
    }

    public Integer substractNumbers(Integer numberA, Integer numberB) {
        return numberA + numberB;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.substractNumbers(1,3));
        System.out.println(calculator.addNumbers(125,98));
    }
}
