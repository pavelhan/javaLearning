package com.company.devicesHierarhy;

public class Players extends Device {

    public String [] playbackType;

    public Players(String name){
        super(name);
        playbackType = new String[2];
        //playbackType[0] = "Forward";
        //playbackType[1] = "Backward";
        //playbackType[2] = "Slowmotion";
    }

    @Override
    public DeviceType getType() {
        return DeviceType.Player;
    }

    public Players(String name, int power){
        super(name);
        super.setPower(power);
    }

    @Override
    public String toString() {
        return "Players [" +
                "name='" + name + '\'' +
                " ]";
    }
}
