package com.company.Array;

public class Task2 {

    public static void main(String[] args) {
        //2. Дан массив размера N. Вывести его элементы в обратном порядке.

        int N = 5;

        int array[] = new int[N];
        int cat = 1;
        for (int i = 0; i < array.length; i++) {

            array[i] = i *2+1;

        }

        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
