package com.company.Array;

public class Task7 {
    public static void main(String[] args) {
        //7. Даны два массива A и B одинакового размера N. Сформировать новый массив C того же размера,
        // каждый элемент которого равен максимальному из элементов массивов A и B с тем же индексом.

        int[] A = {1, 2, 3, 4};
        int[] B = {5, 2, 2, 5};

        int[] C = new int[4];

        for (int i = 0; i < C.length; i++) {
            if (A[i] >= B[i]) {
                C[i] = A[i];
            } else {
                C[i] = B[i];
            }
        }

        for (int count : C) {
            System.out.println(count);
        }
    }
}