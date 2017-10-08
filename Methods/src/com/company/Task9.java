package com.company;

import java.util.Scanner;

public class Task9 {
    //9. Создать метод, проверяющий, может ли массив быть "сбалансированным", т.е. разделённым на две части
    // в каком-то месте, таким образом, чтобы сумма элементов одной части равнялась сумме элементов второй.
    //Т.е.
//    { 1, 1, 1, 2, 1 }; // true
//    { 1, 2, 3, 1, 0, 1, 3 }; // false
//    { 1, 1, 1, 1, 4 }; // true


    public static void main(String[] args) {
        int [] myArray = {10,1,3,3,7};


        System.out.println(isArrayBalanced(0, myArray));
    }

    public static boolean isArrayBalanced(int i, int[] array) {
        int firstEl = 0;
        int secondEl = 0;
        int sum = 0;
        boolean isBalanced = false;

        if (i < array.length) {
            for (int j = 0; j <= i; j++) {
                firstEl += array[j];
            }
            for (int k = i+1; k > i & k < array.length; k++) {
                secondEl += array[k];
            }
            if (firstEl == secondEl) {
                isBalanced = true;
            } else {
                isBalanced = isArrayBalanced(i + 1, array);
            }
        }
        return isBalanced;

    }


}
