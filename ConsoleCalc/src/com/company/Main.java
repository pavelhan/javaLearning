package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        while (businesCalc() == null) {
            businesCalc();
        }
    }

    public static Integer businesCalc() {
        int b;
        int a;
        Integer result = null;
        Scanner sc = new Scanner(System.in);



        try {
            System.out.println("Enter operation type");
            String op = sc.nextLine();
            System.out.println("Enter first operand");
            a = sc.nextInt();
            System.out.println("Enter second operand");
            b = sc.nextInt();
            Calculate calculator = new Calculate();
            result = calculator.calculate(a, b, op);
            System.out.println("Operation result is:" + result);
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Operand shouldn't be double!");
        } catch (ArithmeticException e) {
            System.out.println("Devision by zero is not possible!");
        } catch (WrongRangeException e) {
            e.printStackTrace();
        } catch (WrongCalcOperation wrongCalcOperation) {
            wrongCalcOperation.printStackTrace();
        }
        return result;
    }

}
