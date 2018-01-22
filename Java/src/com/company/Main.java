package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	// write yourr code here
        String myArray[] = {"Hello", "World"};
        MyCollection<String> list = new MyCollection<>(myArray);
        list.Add("Etonia");
        System.out.println(list.toString());
        System.out.println(list.size());
        System.out.println(list.getByIndex(2));

        Worker w1 = new Worker("Vasya");
        Worker w2 = new Worker("Petya");
        Worker workers[] = {w1,w2};

        Tool tool1 = new Tool("Hammer");
        Tool tool2 = new Tool("Lom");
        Tool tool3 = new Tool("Lom222");
        Tool tool4 = new Tool("Lom222");
        Tool tools[] = {tool1,tool2,tool3};

        Manager man1 = new Manager("Manager1");
        Manager man2 = new Manager("Manager2");
        Manager man3 = new Manager("Manager3");
        Manager man4 = new Manager("Manager4");
        Manager managers[] = {man1,man2,man3,man4};

        MyCollection<Worker> managersMyCollection = new MyCollection<>(managers);
        MyCollection<Worker> workerMyCollection = new MyCollection<>(workers);
        MyCollection<Tool> toolsMyCollection = new MyCollection<>(tools);

        System.out.println(isBiggest(toolsMyCollection,tool2));

        System.out.println(workerMyCollection.compareLengh(toolsMyCollection));
        workerMyCollection.AddNewCollection(managersMyCollection);
        System.out.println(workerMyCollection);
        System.out.println(toolsMyCollection.isElementPresent(tool4));

    }

    public static <T extends Comparable<T>> boolean isBiggest(MyCollection<T> collection, T element){
     for (int i = 0; i<collection.size(); i++){
         if (collection.getByIndex(i).compareTo(element) > 0){
             return false;
         }
     }
     return true;
    }



}
