package com.company;

public class Task4 {
    //4. Дана строка. Подсчитать общее количество содержащихся в ней строчных латинских и русских букв.
    public static void main(String[] args) {
        String s = "my 12112 сим";


        int a = (int)'ь';
        System.out.println(a);
        int countCyrylic = 0;
        int countEN = 0;

        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) >='a' & s.charAt(i) <= 'z'){
                countEN++;
            }else if (s.charAt(i) >='а' & s.charAt(i) <= 'ь'){
                countCyrylic++;
            }
        }

        System.out.println(countCyrylic);
        System.out.println(countEN);
    }
}
