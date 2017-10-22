package com.company.devicesHierarhy;

public class ELTs extends TVs {

    public int screenFrequency;

    public ELTs(String name){
        super(name);
    }

    public int getScreenFrequency() {
        return screenFrequency;
    }

    public void setScreenFrequency(int screenFrequency) {
        this.screenFrequency = screenFrequency;
    }
}
