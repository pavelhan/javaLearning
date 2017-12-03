package com.company;

public class Worker {

    String name;
    int partsDone = 0;
    Knowledge knowledge;

    public Worker(String name) {
        this.name = name;
    }

    public Worker(Worker otherWorker) {
        this.name = otherWorker.getName();
        this.partsDone = otherWorker.getPartsDone();
        this.knowledge = new Knowledge();
    }


    public String getName() {
        return name;
    }

    public int getPartsDone() {
        return partsDone;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public Part createDetailCopy(Part part) {
        Part prt = part;
        try {
            prt = part.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        if (partsDone > 95 & partsDone < 100) {
            prt.setQuality("Broken");
        } else {
            prt.setQuality("Good");
        }
        partsDone++;
        if (partsDone > 100) {
            partsDone = 0;
        }
        return prt;
    }


    public class Knowledge {
        String basicKnowledge = "Working";
        Physics physics;

        public Knowledge(){

        }

        public Knowledge(Knowledge otherKnowledge) {
            this.basicKnowledge = otherKnowledge.getBasicKnowledge();
            this.physics = otherKnowledge.getPhysics();
        }


        public String getBasicKnowledge() {
            return basicKnowledge;
        }

        public Physics getPhysics() {
            return physics;
        }

        public class Physics {
            String electicity = "Electricity";

            public Physics(){

            }

            public Physics(Physics otherPhysics) {
                this.electicity = otherPhysics.getElecticity();
            }

            public String getElecticity() {
                return electicity;
            }
        }

        public void createPhysics() {
            this.physics = new Physics();
        }
    }

    public void createKnowlegde() {
        this.knowledge = new Knowledge();
    }

}

