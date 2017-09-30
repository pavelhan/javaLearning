package com.company.Array;

public class Task11 {
    //11. Дано массив из N целых чисел, содержащий по крайней мере два нуля.
    // Вывести сумму чисел из данного массива, расположенных между последними
    // двумя нулями (если последние нули идут подряд,то вывести 0).

    public static void main(String[] args) {

        //Создаем массив
        int[] array = {1, 2, 4, 5, 0, 0, 1, 3, 0};
        int zeroCount = 0;
        int Sum = 0;

        //Вычисляем колличество нулей в масиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroCount++;
            }
        }

        //Создаем еще один масив размером в количество нулей и заполняем его индексами нулей из оригинального массива.
        int[] zeroArray = new int[zeroCount];
        int zeroArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroArray[zeroArrayIndex] = i;
                zeroArrayIndex++;
            }
        }

        //Создаем две переменнные где будут хранится значения индексов последних нулей
        int firstZeroIndex = zeroArray[zeroArray.length-2];
        int secondZeroIndex = zeroArray[zeroArray.length-1];

        //Проверяем разницу в индексах нулей. Если она больше 1 вычисляем сумму числел между нулями. Если нет, выводим 0.
        if (secondZeroIndex - firstZeroIndex > 1) {
            for (int j = firstZeroIndex+1; j < secondZeroIndex; j++)
            Sum += array[j];
        } else {
            Sum = 0;
        }

        System.out.println(Sum);

    }
}
