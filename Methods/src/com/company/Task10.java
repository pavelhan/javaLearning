package com.company;

public class Task10 {

    //10. Реализовать метод быстрой сортировки одномерного массива с помощью рекурсивного метода.

    public static void main(String[] args) {

        int[] myArray = {10, 2, 11, 5, 1};
        //quickSort(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public static int[] quickSort(int[] array) {

        int pivot;
        int left;
        int right;

        for (int i = 0; i < array.length; i++) {
            pivot = array[0];
            right = array[array.length - 1];

        }


        return array;
    }
}
