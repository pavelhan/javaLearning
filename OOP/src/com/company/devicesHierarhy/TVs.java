package com.company.devicesHierarhy;

import com.company.Manufacturers;

public abstract class TVs extends Device {

    public int screenSize;

    public TVs(String name, int power, Manufacturers manufacturer){
        super(name, power, manufacturer);
    }
}
