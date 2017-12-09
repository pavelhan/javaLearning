package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Worker cleaner1 = new Worker(100);
        Worker cleaner2 = new Worker(150);
        Managers manager = new Managers(500);
        Builder builder = new Builder(250);
        IBuilder builderX = new Builder(1000);
        ICleaner cleanerX = new Cleaner(269);
        Robot robot = new Robot();

        ICleaner[] employees = {cleaner1, cleaner2, manager, builder};

        for (int i = 0; i < employees.length; i++) {
            employees[i].clean(ICleaner.Tools.Broom, ICleaner.Materials.Water);
        }

        //delegating work
        cleaner1.iBuilder = builder;
        System.out.println("Now cleaner1 is builder ");
        cleaner1.iBuilder.build(IBuilder.Tools.Hummer, IBuilder.Materials.Rocks);

        Arrays.sort(employees);

        for (ICleaner i:
             employees) {
            System.out.println(((Employee)i).salary);
        }

        robot.iBuilder =builder;
        robot.iCleaner =cleaner1;

        //robot.iCleaner.clean(ICleaner.Materials.CleningChemicals, ICleaner.Tools.Broom);

    }
}


