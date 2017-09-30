package com.company.Array;

public class Task13 {

    /*13. Создать двумерный массив NxM. Заполнить его случайными целыми числами от -100 до 100. Вывести массив на экран.
    Вывести на экран значение максимального элемента этого массива*/

    public static void main(String[] args) {


        int[][] arr = new int[2][3];
        for(int i=0; i< arr.length; i++){
            for(int j=0;j < arr[i].length; j++){
                double rand = Math.random()*10+1;
                int finalRand = (int)rand;
                arr[i][j]=finalRand;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }


        int MaxValue = arr[0][0];

        for(int i=0; i< arr.length; i++){
            for(int j=0;j < arr[i].length; j++){
                if (arr[i][j] > MaxValue){
                    MaxValue = arr[i][j];
                }

            }

        }

        System.out.println("Максимальное число " + MaxValue);



    }
}
