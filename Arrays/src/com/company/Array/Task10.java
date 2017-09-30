package com.company.Array;

public class Task10 {
    //10. Дан массив размера N. Обнулить элементы массива, расположенные между его минимальным и максимальным
    // элементами (не включая минимальный и максимальный элементы).

    public static void main(String[] args) {


        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int ArrayMin = array[0];
        int MinIndex = 0;
        int ArrayMax = array[0];
        int MaxIndex = 0;





        //Find minimal and maximum element
        for (int i = 0; i < array.length; i++) {
            if (array[i] < ArrayMin) {
                ArrayMin = array[i];
                MinIndex = i;
            }
            if (array[i] > ArrayMax) {
                ArrayMax = array[i];
                MaxIndex = i;
            }
        }

        for (int i = 0; i < array.length; i++){
            if (i > MinIndex & i< MaxIndex){
                array[i] = 0;
            }
        }


        System.out.println("Minimal Element " + ArrayMin);
        System.out.println("Maximum Element " + ArrayMax);
        for (int x : array
                ) {
            System.out.println(x);

        }
    }

}
