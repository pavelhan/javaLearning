package com.company;

public class Task5 {


    public static void main(String[] args) {
        /*5. Даны целые положительные числа N1 и N2 и строки S1 и S2.
        Получить из этих строк новую строку, содержащую первые N1 символов строки S1 и последние N2 символов строки S2 (в указанном порядке).*/


        int N1 = 3;
        int N2 = 1;

        String S1 = "Моя строка 1";
        String S2 = "Моя строка 2";

        String newString = S1.substring(0,N1) + S2.substring(S2.length()-N2, S2.length());

        System.out.println(newString);
    }
}
