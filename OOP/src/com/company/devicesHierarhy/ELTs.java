package com.company.devicesHierarhy;

import com.company.Manufacturers;

public class ELTs extends TVs {

    public int screenFrequency;

    public ELTs(String name, int power, Manufacturers manufacturer){
        super(name, power, manufacturer);
    }

    public int getScreenFrequency() {
        return screenFrequency;
    }

    public void setScreenFrequency(int screenFrequency) {
        this.screenFrequency = screenFrequency;
    }
}
