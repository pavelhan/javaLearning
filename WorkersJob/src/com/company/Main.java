package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Agregat agregat = new Agregat();
        Worker worker1 = new Worker();
        worker1.workerType = 1;
        worker1.buildAgregat(agregat);
        Worker worker2 = new Worker();
        worker2.workerType = 3;
        worker2.buildAgregat(agregat);
        Worker worker3 = new Worker();
        worker3.workerType = 5;
        worker3.buildAgregat(agregat);




    }
}
