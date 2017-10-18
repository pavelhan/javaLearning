package com.company.devicesHierarhy;

public class Computers extends Device {

    public int DDRCapacity;


    public Computers setDDRCapacity(int value){
        this.DDRCapacity = value;
        return this;
    }


    public int getDDRCapacity() {
        return DDRCapacity;
    }

    public Device setPower(int power){
        System.out.println("Переопределенный метод");
        this.power = power;
        return this;
    }

    /*2. Предполагая, что объём памяти для компьютеров хранится в байтах, создайте методы перевода этих значений
    в мегабайты и гигабайты*/

    public static int convertToMegabytes(int number){

    int convertedNumber = number/1024;

        return convertedNumber;
    }

    public static int convertToGigabytes (int number){

        int convertedNumber = (number / 1024) / 1024;

        return convertedNumber;
    }



}
