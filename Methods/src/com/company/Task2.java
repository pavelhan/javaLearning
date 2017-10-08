package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2. Создать метод проверяющий, что у переданного числа первая цифра равна последней
        isFirstDigitEqualsLast();
    }

    public static void isFirstDigitEqualsLast() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isEqual =false;
        String s = number + "";


        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            isEqual = true;

        }

        System.out.println("Fist digit equals to second? " + isEqual);
    }
}
