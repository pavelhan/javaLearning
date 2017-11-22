package com.company;

import com.company.devicesHierarhy.Device;

public enum Battary {

    b1(3500), b2(5000),b3(7500), b4(10000);

    public int capacityB;
    public  double U = 1.5;
    public int BatteryDischargeDepth = 100;
    public int availableCapacity = 1;
    Battary (int capacity){

        capacityB = capacity;
    }

    public int calculateTime(Device device){
        return (int) U*capacityB*BatteryDischargeDepth*availableCapacity/device.getPower();
    }


}
