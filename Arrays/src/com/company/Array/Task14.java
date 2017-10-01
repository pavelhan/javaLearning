package com.company.Array;

public class Task14 {

    /*14. Создайте двумерный массив NxM. Заполните его случайными целыми числами от 0 до 9.
    Выведите массив на экран. Отсортируйте каждую строку массива, по возрастанию. Выведите преобразованный массив на экран.*/

    public static void main(String[] args) {
        //Создаем двумерный массив из случайных чисел
        System.out.println("Not sorted array");
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                double rand = Math.random() * 10 + 1;
                int finalRand = (int) rand;
                arr[i][j] = finalRand;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        //Сортируем строки масива по возростанию
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i][j] > arr[i][k]) {
                        int temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }

                }
            }
        }
        //Выводим отсортированый масив
        System.out.println("");
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }


}

