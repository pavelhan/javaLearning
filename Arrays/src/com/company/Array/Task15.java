package com.company.Array;

import java.util.Arrays;

public class Task15 {

    /*15. Учитель задаёт каждому ученику пример из таблицы умножения. В классе 15 человек, примеры среди них не должны повторяться. Напишите программу,
    которая будет выводить на экран 15 случайных примеров из таблицы умножения (от 2*2 до 9*9). При этом среди 15 примеров не должно быть
     повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися). */

    public static void main(String[] args) {

        int pupilsCount = 15;

        int[] elements = {2, 3, 4, 5, 6, 7, 8, 9};
        int[][] tasks = new int[15][2];

        for (int i = 0; i < pupilsCount; i++) {
            int randomElement1 = (int)(((Math.random())*9)+1);
            int randomElement2 = (int)(((Math.random())*9)+1);
            tasks[i][0] = randomElement1;
            tasks[i][1] = randomElement2;

        }

        for(int i = 0; i < tasks.length; i++) {
            System.out.println(Arrays.toString(tasks[i]));
        }

    }

}
