package com.company;

public class Task1 {

    public static void main(String[] args) {
        //1. Создать метод вывода на консоль погодных условий. В метод передаётся температура (в градусах Цельсия)
        // и скорость ветра. На консоль выдаётся строки типа: «Холодно, небольшой ветер», «Тепло, безветренно» и т.п.

        weather(6, 15);
    }

    public static void weather(int temperature, int windSpeed){
        if(temperature >= 15 & windSpeed <=5){
            System.out.println("Тепло, безветрянно");
        }else {
            System.out.println("Холодно, небольшой ветер");
        }
    }
}
