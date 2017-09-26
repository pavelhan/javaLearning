package com.company.Array;

public class Task5 {

    public static void main(String[] args) {
        //5. Дан массив ненулевых целых чисел размера N. Проверить, чередуются ли в нем положительные и отрицательные числа.
        // Если чередуются, то вывести 0, если нет, то вывести порядковый номер первого элемента, нарушающего закономерность.

        int N = 6;

        int[] array;

        array = new int[]{-2, 4, -9, 5, 1, 4};
        boolean isOk = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] * array[i + 1] > 0) {
                System.out.println(array[i]);
                isOk = false;
                break;
            }
        }

        if (isOk) {
            System.out.println(0);
        }

    }
}

