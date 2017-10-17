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


    public Device setPower(int power) {

        this.power = power;
        return this;
    }

    //5. Создайте метод, который будет подсчитывать суммарную мощность всех ваших приборов.
    //Calculate totalPower of specified devices
    public int calculateDevicesPower(Device... device) {
        int totalPower = 0;

        for (int i = 0; i < device.length; i++) {
            totalPower += device[i].power;
        }

        return totalPower;
    }

    /*6. Создайте метод, который будет подсчитывать суммарное количество оперативной памяти у всех ваших приборов
            (если прибор  не является компьютером, считать, что у него нет оперативной памяти).*/
    //Calculate total DDR Capacity
    public int calculateDevicesDDRCapacity(Device... device) {
        int totalDDR = 0;

        for (int i = 0; i < device.length; i++) {
            if (device[i] instanceof Computers) {
                Computers comp = (Computers) device[i];
                totalDDR += comp.DDRCapacity;
            }
        }

        return totalDDR;
    }


    /*
        7. Предусмотрите возможность сравнения (больше/меньше) различных устройств. Сравнение компьютеров проводите по
        количеству оперативной памяти, телевизоров – по размеру диагонали, остальных устройств – по потребляемой мощности.
        */

    public void compareDevices (Device device1, Device device2){

        


    }


}
