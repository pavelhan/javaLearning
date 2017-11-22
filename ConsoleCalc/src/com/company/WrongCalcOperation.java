package com.company;

public class WrongCalcOperation extends Exception {

    public WrongCalcOperation() {
        System.out.println("Please use one of possible operators: +, -, /, *");
    }
}
