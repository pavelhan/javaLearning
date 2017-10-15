package com.company;

public class Device {


    public String name;
    public int power;

    public Device() {

    }

    public Device(int power) {

        setPower(power);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Device setPower(int value, Device device){

        device.power = value;
        return device;
    }
}
