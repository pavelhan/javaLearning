package com.company;

public class Task3 {
    //3. Создать метод, вычисляющий факториал числа (n!= 1 * 2 * 3 * 4….* n)

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int i) {
        int factorial = 0;
        if (i == 1)
            return 1;
        factorial = factorial(i - 1) * i;
        return factorial;
    }
}
