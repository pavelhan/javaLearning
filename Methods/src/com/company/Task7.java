package com.company;

import java.util.Scanner;

public class Task7 {
    //7. Создать метод сравнивающий (лексиграфически) две строки

    public static void main(String[] args) {
        stringsAreEqual("ББГ", "ББГU");
    }




    public static void stringsAreEqual (String a, String b) {
        if(a.charAt(0) < b.charAt(0)){
            System.out.println("Строка А больше чем строка Б");
        } else if(a.charAt(0) > b.charAt(0)){
            System.out.println("Строка Б больше чем строка А");
        } else if(a.charAt(0) == b.charAt(0)) {
            if (a.length() > 1 & b.length() > 1){
                String aSubstring = a.substring(1);
                String bSubstring = b.substring(1);
                stringsAreEqual(aSubstring, bSubstring);
            } else if (a.length() > b.length()){
                System.out.println("Строка А больше чем строка Б");
            } else if (a.length() < b.length()){
                System.out.println("Строка Б больше чем строка А");
            } else {
                System.out.println("Строки равны");
            }
        }
    }
/*
    public static String compareStrings(String firstStr, String secondStr, int compareStartIndex) {
        //Вычисляем сколько символов будем сравнивать в зависимости от разности длинны строк
        String result = "Equal";
        int lengthToCompare;
        if (firstStr.length() > secondStr.length()) {
            lengthToCompare = firstStr.length() + secondStr.length() - firstStr.length();
        } else {
            lengthToCompare = secondStr.length() + firstStr.length() - secondStr.length();
        }
        //Сравниваем каждый символ обеих строк между собой начиная с первого
        if (compareStartIndex < lengthToCompare) {
            //Если первый символ первой строки больше второго, сразу выводим что первая строка больше
            if (firstStr.charAt(compareStartIndex) > secondStr.charAt(compareStartIndex)) {
                result = "First string bigger";
                //Если первый елемент второй строки больше первого то выводим что вторая строка больше
            } else if (secondStr.charAt(compareStartIndex) > firstStr.charAt(compareStartIndex)) {
                result = "Second string bigger";
                //Если они одинаковы то еще раз вызываем метод сравнения строк только с изменным индеском начала сравнения
            } else {
                if (firstStr.length() > secondStr.length()) {
                    result = "First string bigger";
                } else if (secondStr.length() > firstStr.length()) {
                    result = "Second string bigger";
                } else {
                    result = compareStrings(firstStr, secondStr, compareStartIndex + 1);
                }
            }
        }
        return result;
    }*/

}
