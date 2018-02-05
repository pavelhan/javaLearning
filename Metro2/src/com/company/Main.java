package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DEPOT depot = new DEPOT();
        depot.buildWAGONs(50);
        ArrayList<TRAIN> trains = depot.getTrains(10);


        TRAIN_MOVING_LINE trip = new TRAIN_MOVING_LINE();
        DRIVER driver1 = new DRIVER(1);
        DRIVER driver2 = new DRIVER(2);
        DRIVER driver3 = new DRIVER(3);
        DRIVER driver4 = new DRIVER(4);
        DRIVER driver5 = new DRIVER(5);
        DRIVER driver6 = new DRIVER(6);
        Queue<DRIVER> drivers = new LinkedList<>(Arrays.asList(driver1, driver2, driver3, driver4, driver5, driver6));


        for (TRAIN train : trains) {
            DRIVER dr = depot.getMostExperiencedDriver(drivers);
            trip.startTrainMovingLine(train, dr);
            drivers.add(dr);
            drivers.remove();
        }
        Random random = new Random();
        int randomPassengersQuantity = random.nextInt(50);
        LinkedList<PASSENGER> passengers = new LinkedList<PASSENGER>();
        for (int i = 0; i <= randomPassengersQuantity; i++) {
            int id = random.nextInt(1000);
            passengers.add(new PASSENGER(id));
        }

        LINE RedLine = new LINE();
        LINE BlueLine = new LINE();
        LINE GreenLine = new LINE();
        for (int i = 0; i <= 10; i++) {
            RedLine.STATION.add(new STATION("StationRedLine" + 1, RedLine, passengers));
            BlueLine.STATION.add(new STATION("StationBlueLine" + 1, RedLine, passengers));
            GreenLine.STATION.add(new STATION("StationGreenLine" + 1, RedLine, passengers));
        }


    }


}


