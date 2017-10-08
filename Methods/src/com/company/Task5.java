package com.company;

import java.util.Scanner;

public class Task5 {
    //5. Создать метод вычисляющий количество дней в месяце определённого года (с учётом високосности года)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите месяц");
        int m = scanner.nextInt();
        System.out.println("Введите год");
        int y = scanner.nextInt();

        System.out.println("Колличество дней = " + daysCount(m,y));


    }


    public static int daysCount(int month, int year) {
        int[] daysCount = new int[12];

        daysCount[0] = 31;  //Январь
        daysCount[1] = 28;  //Февраль
        daysCount[2] = 31; //Март
        daysCount[3] = 30; //Апрель
        daysCount[4] = 31; //Май
        daysCount[5] = 30; //Июнь
        daysCount[6] = 31; //Июль
        daysCount[7] = 31; //Август
        daysCount[8] = 30; //Сентябрь
        daysCount[9] = 31; //Октябрь
        daysCount[10] = 30; //Ноябрь
        daysCount[11] = 31; //Декабрь

        boolean isYearVys;

        if (year % 4 == 0) {
            if (year % 100 == 0 & !(year % 400 == 0)) {
                isYearVys = false;
            } else {
                isYearVys = true;
            }
        } else {
            isYearVys = false;
        }

        if (isYearVys){
            if(month != 2){
                return daysCount[month-1];
            }else {
                return daysCount[month-1]+1;
            }
        }else {
            return daysCount[month-1];
        }


    }

}
