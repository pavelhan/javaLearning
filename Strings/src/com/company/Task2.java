package com.company;

import java.util.Scanner;

public class Task2 {
    //2. С клавиатуры задается строка. Определить длину строки в символах и в словах (разделителем между
    // словами считать знак пробела). Вывести заданную строку в обратном порядке по символам и по словам.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int symbolsLength = s.length();
        System.out.println("Symbols count " + symbolsLength);

        String [] words = s.split(" ");
        int wordCount = words.length;
        System.out.println("Words count " + wordCount);

        for (int i = words.length-1; i >=0; i--){
            System.out.print(words[i] + " ");
        }
        System.out.println();

        char [] symbols = s.toCharArray();
        for (int i = symbols.length-1; i >=0; i--){
            System.out.print(symbols[i]);
        }



    }
}
