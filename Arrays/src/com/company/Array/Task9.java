package com.company.Array;

public class Task9 {
    public static void main(String[] args) {
        //9. Дан массив размера N. Поменять порядок его элементов на обратный.

        int [] array = new int [5];

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        int middleInt = array.length/2;

        for (int i = 0, j = array.length-1; i < middleInt; i++, j--){
                int tmp = array[j];
                array[j] = array[i];
                array[i] = tmp;


        }
        for (int x: array
             ) {
            System.out.println(x);
        }


    }
}
