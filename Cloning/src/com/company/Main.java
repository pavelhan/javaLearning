package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Part p1 = new Part("hummer");
        Worker worker = new Worker("Vasya");


        System.out.println(p1.hashCode());
        Part clone = worker.createDetailCopy(p1);

        System.out.println(clone.hashCode());

        worker.createKnowlegde();
        worker.knowledge.createPhysics();

        Worker worker2 = new Worker(worker);

        System.out.print("Hashcode original worker ");
        System.out.println(worker.hashCode());

        System.out.print("Hashcode original of new worker ");
        System.out.println(worker2.hashCode());

        System.out.println("Knowledge of original " + worker.knowledge.hashCode());
        System.out.println("Knowledge of new worker " + worker2.knowledge.hashCode());
        System.out.println("Knowledge of new worker " + worker2.knowledge.basicKnowledge);





    }
}
