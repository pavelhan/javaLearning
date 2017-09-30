package com.company.Array;

public class Task14 {

    /*14. Создайте двумерный массив NxM. Заполните его случайными целыми числами от 0 до 9.
    Выведите массив на экран. Отсортируйте каждую строку массива, по возрастанию. Выведите преобразованный массив на экран.*/

    public static void main(String[] args) {

        int[][] arr = {{4, 3, 2, 1}, {3, 2, 1}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        /*int[][] arr = new int[2][3];
        for(int i=0; i< arr.length; i++){
            for(int j=0;j < arr[i].length; j++){
                double rand = Math.random()*10+1;
                int finalRand = (int)rand;
                arr[i][j]=finalRand;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

*/


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                for (int k = j; k < arr[i].length; k++) {

                    int min = arr[i][k];
                    int imin = k;

                    for (int d = k + 1; d < arr[i].length; d++) {
                        if (arr[i][d] < min) {
                            min = arr[i][d];
                            imin = d;
                        }
                        //Проверяем нашелся ли елемент меньше чем стоит на текущей позиции. Если нашелся, то меняем элементы местами
                        if (k != imin) {
                            int temp = arr[i][k];
                            arr[i][k] = arr[i][imin];
                            arr[i][imin] = temp;

                        }
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }


}

