package com.company;

public class Task1 {
    //1. Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его. Вывести полученное число.
    public void Task1() {

        int a = 5;
        System.out.println((a > 0) ? ++a : a);
    }

    //2. Дано целое число. Если оно является положительным, то прибавить к нему 1; если отрицательным, то вычесть из него 2; если нулевым, то заменить его на 10. Вывести полученное число.
    public void Task2() {
        int a = 0;

        if (a > 0) {
            a = a + 1;
        } else if (a < 0) {
            a = a - 2;
        } else {
            a = 10;
        }

        System.out.println("a = " + a);

    }

    //3. Даны три целых числа. Найти количество положительных чисел в исходном наборе.
    public void Task3() {
        int a = 1;
        int b = 2;
        int c = -5;

        int quantity = 0;

        if (a > 0) {
            quantity++;
        }

        if (b > 0) {
            quantity++;
        }
        if (c > 0) {
            quantity++;
        }

        System.out.println("Колличество положительных чисел = " + quantity);
    }

    //4. Даны три целых числа. Найти количество положительных и количество отрицательных чисел в исходном наборе.
    public void Task4() {
        int a = 1;
        int b = 2;
        int c = -8;

        int quantityPos = 0;
        int quantityNeg = 0;

        if (a > 0) {
            quantityPos++;
        } else {
            quantityNeg++;
        }

        if (b > 0) {
            quantityPos++;
        } else {
            quantityNeg++;
        }

        if (c > 0) {
            quantityPos++;
        } else {
            quantityNeg++;
        }

        System.out.println("Колличество положительных = " + quantityPos + "\n" + "Колличество отрицательных = " + quantityNeg);
    }

    //5. Даны три числа. Найти наименьшее из них.
    public void Task5() {
        int a = 12;
        int b = -9;
        int c = -80;

        System.out.println("Наименьшее число = ");
        if (a < b & a < c) {
            System.out.println(a);
        } else if (b < a & b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    //6. Дан номер года (положительное целое число). Определить количество дней в этом году, учитывая, что обычный год
    // насчитывает 365 дней, а високосный — 366 дней. Високосным считается год, делящийся на 4, за исключением тех годов,
    // которые делятся на 100 и не делятся на 400 (например, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 — являются).


    public void Task6() {

        int year = 2016;

        boolean isYearVys;

        if (year % 4 == 0) {
            if (year % 100 == 0 & !(year % 400 == 0)) {
                isYearVys = false;
            } else {
                isYearVys = true;
            }
        } else {
            isYearVys = false;
        }

        System.out.println(isYearVys);

    }

    //7. Дано целое число, лежащее в диапазоне 1–999.
    // Вывести его строку-описание вида «четное двузначное число», «нечетное  трехзначное число» и т. д.

    public void Task7() {
        int a = 1;

        String result = "";

        String pair = "Четное";
        String nonPair = "Нечетное";
        String odnoznhachnoe = " однозначное число";
        String dvuhznachnoe = " двузначное число";
        String trehznachnoe = " трехзначное число";
        if (a % 2 == 0) {
            result = result + pair;
        } else {
            result = result + nonPair;
        }

        if (a > 99 & a < 1000) {
            result = result + trehznachnoe;
        } else if (a > 9 & a < 100) {
            result = result + dvuhznachnoe;
        } else {
            result = result + odnoznhachnoe;
        }

        System.out.println(result);
    }

    //8. Дано целое число в диапазоне 1–7.
    // Вывести строку — название дня недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).

    public void Task8() {
        int a = 7;

        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;

            case 3:
                System.out.println("Среда");
                break;

            case 4:
                System.out.println("Четверг");
                break;

            case 5:
                System.out.println("Пятница");
                break;

            case 6:
                System.out.println("Суббота");
                break;

            case 7:
                System.out.println("Воскресенье");
                break;

            default:
                System.out.println("Понедельник");
        }
    }


    //9. Дано целое число K. Вывести строку-описание оценки, соответствующей числу K
    // (1, 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в диапазоне 1–5, то вывести строку «ошибка».

    public void Task9() {

        int K = 0;

        String error = "ошибка";

        if (K > 5 | K < 1) {
            System.out.println("ошибка");
        } else {


        }

        switch (K) {
            case 1:
            case 2:
                System.out.println("неудовлетворительно");
            case 3:
                System.out.println("удовлетворительно");
            case 4:
                System.out.println("хорошо");
            case 5:
                System.out.println("отлично");
        }
    }

    //10. Единицы длины пронумерованы следующим образом: 1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.
    // Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в этих единицах (вещественное число). Найти длину отрезка в метрах.

    public void Task10() {

        int A = 5;
        double length = 2.2;

        double fullValue;

        switch (A){

            case 1:
                fullValue = length*0.1;
                System.out.println(fullValue);
            case 2:
                fullValue = length*1000;
                System.out.println(fullValue);
            case 3:
                fullValue = length;
                System.out.println(fullValue);
            case 4:
                fullValue = length/1000;
                System.out.println(fullValue);
            case 5:
                fullValue = length/100;
                System.out.println(fullValue);


        }


    }

}
