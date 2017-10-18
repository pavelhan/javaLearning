package com.company.devicesHierarhy;

public class PowerGenerator {

    private int totalPower;

    public void setTotalPower(int totalPower) {
        this.totalPower = totalPower;
    }

    public PowerGenerator(int totalPower){
        this.totalPower = totalPower;
    }

    public void connectDevice(Device connectedDevice){
        totalPower -= connectedDevice.power;
    }


}
