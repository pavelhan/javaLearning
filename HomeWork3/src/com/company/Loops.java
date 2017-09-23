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
        int N = 6;


        int pairSum = 0;
        int notPairSum = 0;


        for (int i = 2; i <= N; i = i + 2) {
            pairSum -= i;

        }


        for (int i = 1; i <= N; i = i + 2) {
            notPairSum += i;
        }
        System.out.println("Loops.Task3");
        System.out.println(pairSum + notPairSum);


    }

    //4. Дано целое число N (> 0). Найти произведение N! = 1·2·…·N (N–факториал). Чтобы избежать целочисленного переполнения,
// вычислять это произведение с помощью вещественной переменной и вывести его как вещественное число.
    public void Task4() {

        double N = 5;
        double result = 1;
        for (int i = 1; i <= N; i++) {
            result = result * i;
        }

        System.out.println(result);

    }

    //5. Даны целые числа A и B (A < B).
    // Вывести все целые числа от A до B включительно; при этом число A должно выводиться 1 раз,
    // число A + 1 должно выводиться 2 раза и т. д.


    public void Task5() {

        int a = 1;
        int b = 5;

        for (int i = a; i <= b; i++) {
            for (int j = a; j <= i; j++) {
                System.out.println(i);
            }
        }
    }


    //6. Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
    // Не используя операции умножения и деления, найти длину незанятой части отрезка A и количество отрезков B, размещенных на отрезке A.
    public void Task6() {
        int a = 10;
        int b = 2;
        int count = 0;
        int freeSpaceLength = 0;
        while (a >= b) {

            a = a - b;

            count++;
        }
        System.out.println(count);
        System.out.println(a);
    }

    //7. Дано целое число N (> 3). Если оно является степенью числа 3, то вывести True, если не является — вывести False.

    public void Task7() {

        int N = 10;
        boolean Good = true;
        while (N > 1) {
            N = N / 3;

        }
        if (N == 1) {
            Good = true;

        } else {
            Good = false;
        }

        System.out.println(Good);

    }

    //8. Начальный вклад в банке равен $1000. Через каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы
    // (P — вещественное число, 0 < P < 25). По данному P определить, через сколько месяцев размер вклада превысит $1100, и вывести найденное
    // количество месяцев K (целое число) и итоговый размер вклада S (вещественное число).

    public void Task8() {
        double initial = 1000;
        double P = 1;

        int K = 0;

        while (initial <= 1100) {

            double plus = (initial / 100) * P;

            K++;
            initial += plus;

        }

        System.out.println(K + "Month");
        System.out.println(initial + "Dollars total");


    }

    //9. Дано целое число N (> 0). Используя операции деления нацело и взятия остатка от деления, найти число, полученное при прочтении числа N
    // справа налево.

    public void Task9() {
        int N = 1569;

        while (N > 0) {


            System.out.print(N % 10);
            N = N / 10;
        }


    }

    //10. Дано целое число N (> 1).
    // Если оно является простым, то есть не имеет положительных делителей, кроме 1 и самого себя, то вывести True, иначе вывести False.

    public void Task10(){
        int N = 5;


    }

}



