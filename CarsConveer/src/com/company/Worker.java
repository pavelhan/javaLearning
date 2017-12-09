package com.company;

public class Worker {
    String name;
    PositionOnConveer position;

    enum PositionOnConveer{
        p1, p2, p3;

    }

    public Worker(String name, PositionOnConveer position) {
        this.name = name;
        this.position = position;
    }



    public Car.Builder fitInterior(Boolean steeringWheel, int seat, Car.Builder builder){
        Car.Builder builder1 = builder.setSteeringWheel(true).setSteeringWheel(true);
        return builder1;
    }

    public Car fitExterior(int wheel, boolean polishing, boolean painting, int doors, int windows, Car.Builder builder){
        Car car = builder.setWheel(4).setPainting(true).setPolishing(true).setDoor(4).setWindow(4).build();
        return car;
    }



}
