package com.company.devicesHierarhy;

public class PowerGenerator extends Device {

    private int totalPower;


    public void setTotalPower(int totalPower) {
        this.totalPower = totalPower;
    }

    @Override
    public DeviceType getType() {
        return DeviceType.PowerGenerator;
    }

    public PowerGenerator(String name, int totalPower){
        super(name);
        this.totalPower = totalPower;

    }
    public void changeTotalPower(Device device){
        this.totalPower -= device.getPower();

    }

    public int getTotalPower() {
        return totalPower;
    }
}
