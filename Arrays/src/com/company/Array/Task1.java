package com.company.Array;

public class Task1 {
    public static void main(String[] args) {
    /*1. Дано целое число N (> 0). Сформировать и вывести целочисленный массив размера N, содержащий N первых положительных
    нечетных чисел: 1, 3, 5, … .*/

        int N = 5;

        int array[] = new int[N];
        int cat = 1;
        for (int i = 0; i < array.length; i++) {

            //array[i] = cat;
            //cat = cat + 2;
            array[i] = i *2+1;

        }

        for (int j : array) {
            System.out.println(j);
        }


    }
}
