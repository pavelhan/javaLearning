package com.company;
import java.util.*;


public class DEPOT {
    ArrayList <WAGON> wagons = new ArrayList<WAGON>();
    ArrayList<TRAIN> trains = new ArrayList<TRAIN>();
    Random rand = new Random();
    //int wagonCount = rand.nextInt(55);

    private WagonType getRandomType(){
        Random random = new Random();
        int rand = random.nextInt(100);
        if (rand < 30){
            return WagonType.Main;
        }else {
            return WagonType.Regular;
        }
    }

    public ArrayList <WAGON> buildWAGONs(int wagonCount){
        for (int i = 0; i < wagonCount; i++){
            WAGON wagon = new WAGON("Wagon_" + i, getRandomType());
            wagons.add(wagon);
            System.out.println("Added wagon to depot " + wagons.get(i));
        }
        return wagons;
    }

    public TRAIN getTrain() {
        LinkedList<WAGON> wagonsForCurrentTrain = new LinkedList<WAGON>();
        int regularTrainsCount = 0;
        while (!wagons.isEmpty())
        {
            WAGON wag = wagons.remove(0);
            if((wag.type == WagonType.Main) && (wagonsForCurrentTrain.size() > 4 && wagonsForCurrentTrain.size() <= 5)){
                if (wagonsForCurrentTrain.isEmpty()) {
                    wagonsForCurrentTrain.addFirst(wag);
                    System.out.println("Main wagon added");
                }
                else if(wagonsForCurrentTrain.size() > 0){
                    wagonsForCurrentTrain.addLast(wag);
                    System.out.println("Main wagon added");
                }
            }else if ((wag.type == WagonType.Regular) && (wagonsForCurrentTrain.size() <= 5) && (regularTrainsCount <3)){
                if(wagonsForCurrentTrain.size() > 0){
                    wagonsForCurrentTrain.add(1, wag);
                    regularTrainsCount++;
                }else {
                    wagonsForCurrentTrain.add(wag);
                    regularTrainsCount++;
                }
                System.out.println("Regular wagon added to index ");
            }
        }

        return new TRAIN(wagonsForCurrentTrain);
    }

    public ArrayList<TRAIN> getTrains(int trainQuantity) {
        for (int i = 1; i < trainQuantity+1; i++){
            trains.add(getTrain());
        }
        return trains;
    }

    public DRIVER getMostExperiencedDriver(Queue<DRIVER> drivers){
        int maxExp = 0;
        DRIVER maxDriver = drivers.element();
        for (DRIVER d: drivers) {
            if (d.getExperience() > maxExp){
                maxExp = d.getExperience();
                maxDriver = d;
            }
        }
        return maxDriver;
    }

}

