package com.company.Array;

public class Task3 {
    public static void main(String[] args) {
        //3. Дан целочисленный массив размера N. Вывести вначале все содержащиеся в данном массиве четные числа в порядке возрастания их
        // индексов, а затем — все нечетные числа в порядке убывания их индексов.
        // Также вывести количество четных и нечетных членов массива.


        int N = 10;
        int array[] = new int[N];

        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }


        for (int i : array
                ) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        for (int i = array.length-1; i>=0; i--){
            if (array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
    }
}
