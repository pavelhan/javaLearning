package com.company;

public class Loops {

    //1. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все целые числа, расположенные между A и B
    // (включая сами числа A и B), а также количество N этих чисел.
    public void Task1() {
        int A = 2;
        int B = 4;

        int N = 0;
        for (int i = A; i <= B; i++) {
            System.out.println(i);
            N = N + 1;
        }

        System.out.println("Колличество чисел = " + N);
    }

    //2. Даны два целых числа A и B (A < B). Вывести в порядке убывания все целые числа, расположенные между
// A и B (не включая числа A и B), а также количество N этих чисел.
    public void Task2() {
        int A = 5;
        int B = 10;
        int N = 0;
        for (int i = B - 1; i > A; i--) {
            System.out.println(i);
            N = N + 1;
        }

        System.out.println("Колличество чисел = " + N);
    }

    //3. Дано целое число N (> 0). Найти значение выражения 1 – 2 + 3 – … (N слагаемых, знаки чередуются).
// Условный оператор не использовать.
    public void Task3() {
        int N = 5;

        int result = 0;

        for (int i = 0; i < 5; i++) {

        }
    }
}



