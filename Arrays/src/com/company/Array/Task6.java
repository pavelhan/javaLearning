package com.company.Array;

public class Task6 {
    public static void main(String[] args) {
        //6. Дан целочисленный массив размера N. Найти количество различных элементов в данном массиве.


        int array[] = {1, 1, 1, 1, 1};

        int uniqueCount = 0;

        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    flag = false;
                    break;
                }

            }
            if (flag == true) {
                uniqueCount++;
            }
            flag = true;
        }
        System.out.println(uniqueCount);

    }

}