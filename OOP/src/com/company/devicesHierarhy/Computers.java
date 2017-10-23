package com.company.devicesHierarhy;

import com.company.Manufacturers;

public abstract class Computers extends Device {

    public int DDRCapacity;
    public static final int minRam = 64;
    public static final int maxRam = 2048;


    public Computers(String name){
        super(name);
    }

    public Computers(String name, int DDRCapacity, int power, Manufacturers manufacturer){
        super(name, power, manufacturer);
        setDDRCapacity(DDRCapacity);

    }



    public Computers setDDRCapacity(int value){
        if(value <= maxRam & value >= minRam){
            this.DDRCapacity = value;
        }else {
            this.DDRCapacity = 0;
            System.out.println("Please enter valid ram quantity between " + minRam + " and " + maxRam);
        }
        return this;
    }


    public int getDDRCapacity() {
        return DDRCapacity;
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

    @Override
    public String toString() {
        return "Computers{" +
                "DDRCapacity=" + DDRCapacity +
                '}' + super.toString();
    }
}
