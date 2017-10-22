package com.company.devicesHierarhy;

public class Laptops extends Computers {

    public int weight;

    public Laptops(String name){
        super(name);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
