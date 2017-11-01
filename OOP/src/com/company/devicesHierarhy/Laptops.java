package com.company.devicesHierarhy;

import com.company.Manufacturers;

public class Laptops extends Computers {

    public int weight;

    public Laptops(String name, int DDRCapacity, int power, Manufacturers manufacturer){
        super(name, DDRCapacity, power, manufacturer);

    }

    public Laptops(String name){
        super(name);
    }

    public Laptops(String name, int power){
        super(name);
        super.setPower(power);
    }



    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptops [" +
                "name='" + name + '\'' +
                " ]";
    }
}


