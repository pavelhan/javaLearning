package com.company;

import java.util.Scanner;

public class Task8 {
    //8. Создать метод, возвращающий true, если заданное число находится "повсюду" в целочисленном массиве.
    // Под "повсюду" подразумевается, что при рассмотрении любой пары рядом стоящих элементов массива, одним из элементов будет искомое число, т.е.
    //isEverywhere({1, 2, 1, 3}, 1) → true
    //isEverywhere({1, 2, 1, 3}, 2) → false
    //isEverywhere({1, 2, 1, 3, 4}, 1) → false


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] row = new int[4];
        System.out.println("Enter row number");
        for (int i = 0; i < row.length; i++){
            row[i] = scanner.nextInt();
        }
        System.out.println("Enter a check number");
        int num = scanner.nextInt();

        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i] + " ");
        }
        isEverywhere(row,num);


    }

    public static void isEverywhere(int [] integerRow, int number){
            boolean isEverywhere = false;
        for (int i = 0; i < integerRow.length-1; i++){
            if (integerRow[i] == number | integerRow[i+1] == number){
                isEverywhere = true;
            }else {
                isEverywhere = false;
                break;
            }
        }
        System.out.print(" " + isEverywhere);
    }
}
