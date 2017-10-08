package com.company;

public class Task6 {
    //6. Путешественник проходит каждый день несколько километров. Создать метод, выводящий на экран его путь
    // с начала путешествия(в виде "День №1 : 10км; День №2 : 7км; День №3 : 13км; ").
    // Метод должен работать для любого количества дней путешествия.

    public static void main(String[] args) {
        stranger(10,15,16,20);
    }

    public static void stranger (int ... kilometersPerDay){

        for (int i = 0; i < kilometersPerDay.length; i++) {
            System.out.print("День №" + (i+1) +" "+ kilometersPerDay[i] + " км : ");
        }
    }
}
