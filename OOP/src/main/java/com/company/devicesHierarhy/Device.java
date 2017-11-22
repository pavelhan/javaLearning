package com.company.devicesHierarhy;

import com.company.Battary;
import com.company.Manufacturers;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Device {

    static {
        Random random = new Random();
        guid = random.nextInt(1000);

    }

    public String name;
    private int power;
    public int deviceID;
    private static int guid;
    Device pluggedDevice;
    PowerGenerator currentGenerator;
    Manufacturers manufacturer;
    Battary battary;
    double price;
    DeviceType type;

    //Unique ID generator
    private void setDeviceID() {
        deviceID = guid;
        guid++;
    }
    //Constructor 1
    public Device(String name, int power, Manufacturers manufacturer) {
        this.name = name;
        this.power = power;
        this.manufacturer = manufacturer;
        setDeviceID();
    }
    //Constructor 2
    public Device(String name) {
        this.name = name;
        setDeviceID();
    }

    //Getter for DeviceID
    public int getDeviceID() {
        return deviceID;
    }

    //Getter for DeviceName
    public String getName() {
        return name;
    }

    //Setter for DeviceName
    public void setName(String name) {
        this.name = name;
    }

    //Getter for price
    public double getPrice() {
        return price;
    }

    //Getter for Device power
    public int getPower() {
        return power;
    }

    //Setter for Device power
    public Device setPower(int power) {

        this.power = power;
        return this;
    }

    //Get Manufacurer
    public Manufacturers getManufacturer() {
        return manufacturer;
    }
    //Set Manufacturer
    public void setManufacturer(Manufacturers manufacturer) {
        this.manufacturer = manufacturer;
    }

    //Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract DeviceType getType();

    //5. Создайте метод, который будет подсчитывать суммарную мощность всех ваших приборов.
    //Calculate totalPower of specified devices
    public static int calculateDevicesPower(Device[] device) {
        int totalPower = 0;

        for (int i = 0; i < device.length; i++) {
            if(device[i].power != 0) {
                totalPower += device[i].power;
            }
        }

        return totalPower;
    }

    /*6. Создайте метод, который будет подсчитывать суммарное количество оперативной памяти у всех ваших приборов
            (если прибор  не является компьютером, считать, что у него нет оперативной памяти).*/
    //Calculate total DDR Capacity
    public int calculateDevicesDDRCapacity(Device[] device) {
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


    //Compare devices method
    public void compare(Device device2) {
        String s1 = "1st device is bigger than second";
        String s2 = "2nd device is bigger than first";

        if (this instanceof Computers & device2 instanceof Computers) {
            if (((Computers) this).DDRCapacity >= ((Computers) device2).DDRCapacity) {
                System.out.println(s1);
            } else {
                System.out.println(s2);
            }
        } else if (this instanceof TVs & device2 instanceof TVs) {
            if (((TVs) this).screenSize >= ((TVs) device2).screenSize) {
                System.out.println(s1);
            } else {
                System.out.println(s2);
            }
        } else {
            if (this.power >= device2.power) {
                System.out.println(s1);
            } else {
                System.out.println(s2);
            }
        }

    }


    //Connect devices
    public Device connectDevice(Device device){
        //if instance which call this method is instance of PowerGenerator class than we initialize currentGenerator variable with current object
        if (this instanceof PowerGenerator){
            device.currentGenerator = (PowerGenerator) this;
        // if this is not power generator object than we can assume that this instanse already has some generator and we can use the same one for other devices
        }else {
            device.currentGenerator = this.currentGenerator;
        }
        // here we check if current generator has enough of total power left to connect current device; also there is a check that if we don't have pluggedDevice to current device than we can connect some
        if (device.power <= device.currentGenerator.getTotalPower() & this.pluggedDevice == null){
            //if the one who call this method don't have connected device yet, than we can connect some, and assign current device from parameter to pluggedDevice
            this.pluggedDevice = device;
            //if there is enough totalPower left in power generator we can connect device and decrease it totalPower
            device.currentGenerator.changeTotalPower(device);
        }else {
            //if there is not enough power than we write to console that device can't be connected
            System.out.println("Device " + device.name + "can't be connected");
            //and just return device back
            return this;
        }
        //if device connected successfully we also return it back
        return device;
    }

    //This method is building device chain
    public String deviceChain(){
        // creation of chain string which will concatenate all connected devices using recursion
        String chain;
        //we will call this one until there will be no connected device left
        if (this.pluggedDevice ==null){
            chain = this.name;
            return chain;
        }
        return chain = this.name + " " + this.pluggedDevice.deviceChain();

    }

    //print device chain using method above
    /*public void printDeviceChain(){
        System.out.println(deviceChain(this));
    }*/

    // this method changing current plugged device to Null and in this way brake a chain
    public void unplugDevice(){
        this.pluggedDevice = null;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", deviceID=" + deviceID +
                ", pluggedDevice=" + pluggedDevice +
                ", currentGenerator=" + currentGenerator +
                ", manufacturer slogan = " + (manufacturer != null ? " Slogan= " + manufacturer.getSlogan() : " No slogan") +
                '}';
    }




    public void plugBattary(Battary battary){
        this.battary = battary;
    }

    public Battary getBattary() {
        return battary;
    }
}

