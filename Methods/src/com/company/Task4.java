package com.company;

import java.util.Scanner;

public class Task4 {
    //4. Создать метод, подсчитывающий количество вхождения подстрок в строку

    public static void main(String[] args) {
        checkSubsringQauantity();
    }

    public static void checkSubsringQauantity() {

        System.out.println("Enter initial string");
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        System.out.println("Enter second string");
        String ss = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <= s.length()-ss.length(); ) {
            String debug = s.substring(i,ss.length()+i);
            if (s.substring(i,ss.length()+i).equals(ss)){
                count++;
                i = i+ss.length();
            }
            else {
                i++;
            }
        }
        System.out.println(count);
    }
}
