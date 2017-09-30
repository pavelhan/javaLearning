package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1. С клавиатуры задается строка. Заменить в заданной строке все пробелы знаками подчеркивания.

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String ss = s.replace(" ", "_");
        System.out.println(ss);
    }
}
