package com.company;

public class Computers extends Device {

    public int DDRCapacity;

    public void setDDRCapacity(int DDRCapacity) {
        this.DDRCapacity = DDRCapacity;
    }


    public Computers setDDRCapacity(int value, Computers computer){

        computer.setDDRCapacity(value);

        return computer;
    }


    public Device setPower(int value, Device device){
        System.out.println("Переопределенный метод");
        device.power = value;
        return device;
    }


}
