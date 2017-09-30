package com.company.Array;

public class Task12 {

    /*12. Создайте массив из случайного числа элементов, заполненный случайными числами. Под "диапазоном" понимаются все числа, находящиеся между двумя одинаковыми числами(включительно). Единственное число имеет диапазон 1. Найдите наибольший диапазон в массиве.
[6] = 1
[4][0][9][1][7][8][9][0]  = 7
[8][8][7][2][0][2][1][9]  = 3
[0][7][3][5][1][7][0]  = 7
*/


    public static void main(String[] args) {

        double random = (Math.random() * 10) + 5;
        int finalRandom = (int) random;

        int[] randomArray = new int[finalRandom];

        for (int i = 0; i < randomArray.length; i++) {

            double randomValue = Math.random() * 10;
            int finalRandomValue = (int) randomValue;
            randomArray[i] = finalRandomValue;
        }

        int firstIndex = 0;
        int secondIndex = 0;

        for (int i = 0; i < randomArray.length; i++) {
            firstIndex = i;
            for (int j = i + 1; j < randomArray.length - 1; j++) {
                if (randomArray[j] == randomArray[firstIndex]) {
                    secondIndex = j;
                    break;
                }

            }

            if (secondIndex != 0) {
                break;
            }
        }


        //Выводим массив на экран
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print("[" + randomArray[i] + "]");

        }
        System.out.println("\n");

        //Выводим первый индекс
        System.out.println("Первый индекс " + firstIndex);
        //Выводим второй индекс
        System.out.println("Второй индекс " + secondIndex);

        //Выводим диапазон
        int count = 0;
        for (int i = firstIndex; i <= secondIndex; i++) {
            count++;
        }

        System.out.println("Диапазон " + count);


    }


}
