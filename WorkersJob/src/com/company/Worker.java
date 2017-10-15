package com.company;

public class Worker {

    public int workerType;

    public int getWorkerType() {
        return workerType;
    }

    public void setWorkerType(int workerType) {
        this.workerType = workerType;
    }

    public void buildAgregat(Agregat agregat) {
        switch (workerType) {
            case 5:
                agregat.addDetal(new Detal());
                agregat.addDetal(new Detal());
                agregat.addDetal(new Detal());
                agregat.addDetal(new Detal());
                agregat.addDetal(new Detal());
                break;
            case 1:
                agregat.addDetal(new Detal());
                break;
            case 3:
                agregat.addDetal(new Detal());
                agregat.addDetal(new Detal());
                agregat.addDetal(new Detal());
                break;
            default:
                System.out.println("Incorrect Worker Type");
        }
    }

}
