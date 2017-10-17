package com.company;

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


}
