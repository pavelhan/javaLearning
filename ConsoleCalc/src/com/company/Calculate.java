package com.company;

import java.util.InputMismatchException;

public class Calculate {



    public int calculate (int first, int second, String operation) throws WrongRangeException, WrongCalcOperation {
        int num1 = first;
        int num2 = second;
        String op = operation;

        if ((num1 < -1000 | num1 > 1000) | (num2 < -1000 | num2 > 1000)){
            throw new WrongRangeException();
        }
        int result = 0;
        switch (operation){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1/num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                throw new WrongCalcOperation();

        }
        return result;
    }

}
