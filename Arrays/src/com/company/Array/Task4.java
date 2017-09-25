package com.company.Array;

public class Task4 {
    public static void main(String[] args) {
        //4. Дан массив A размера N (N — четное число). Вывести его элементы с четными номерами в порядке возрастания номеров:
        // A2, A4, A6, …, AN. Условный оператор не использовать.


        int N = 10;

        int A [] = new int[N];

        for (int i = 0; i < A.length; i++){
            A[i] = i;
        }

        for (int i = 0; i < A.length; i= i+2){
            System.out.println(A[i]);
        }
    }
}
