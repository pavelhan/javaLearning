package com.company;

public class Task3 {
    public static void main(String[] args) {
        //3. Дан массив текстовых значений. Найти самый длинный элемент массива. Создать предложение из входящих в массив строк,
        // самый длинный элемент массива разместить в начале предложения.

        String [] words = {"my", "best", "ng"};

        String largestStr = words[0];
        int largestStrIndex = 0;
        for (int i = 0; i < words.length; i++){
            if (words[i].length() > largestStr.length()){
                largestStr = words[i];
                largestStrIndex = i;
            }
        }

        String temp = words[0];
        words[0] = largestStr;
        words[largestStrIndex] = temp;


        for (int i = 0; i < words.length; i++){
            System.out.print(" " + words[i]);
        }

    }
}
