package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Worker worker1 = new Worker("worker1", Worker.PositionOnConveer.p1);
        Worker worker2 = new Worker("worker2", Worker.PositionOnConveer.p2);
        Worker worker3 = new Worker("worker3", Worker.PositionOnConveer.p3);

        Car.Builder builder = new Car.Builder("Volvo", true);

        worker1.fitInterior(true,5,builder);
        worker2.fitExterior(4,true,true,4, 4,builder);
        Car car = builder.build();
        System.out.println(car);


    }


}
