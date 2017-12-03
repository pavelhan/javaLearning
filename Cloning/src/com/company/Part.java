package com.company;

public class Part implements Cloneable{

    String name;
    String quality;


    public Part(String name) {
        this.name = name;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }

    @Override
    protected Part clone() throws CloneNotSupportedException {
        Part prt = (Part)super.clone();
        return prt;
    }
}
