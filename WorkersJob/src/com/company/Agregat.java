package com.company;

public class Agregat {

    Detal[] detali = new Detal[9];

    public void addDetal(Detal detal) {
        for (int i = 0; i < detali.length; i++) {
            if (detali[i] == null) {
                detali[i] = detal;
                break;

            }
        }
    }

    public void addDetals(Detal... detal) {
        for (int i = 0; i < detal.length; i++) {
            if (detali[i] == null) {
                addDetal(detal[i]);
            }
        }
    }
}



