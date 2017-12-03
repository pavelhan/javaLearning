package com.company;

public class Managers extends Employee implements ICleaner, IBuilder {

    ICleaner iCleaner;

    public Managers(int salary) {
        super(salary);
    }


    @Override
    public void clean(ICleaner.Tools tool, ICleaner.Materials material) {
        System.out.println("Manager cleaning with " + tool + " and " + material);
    }

    @Override
    public void build(IBuilder.Tools tool, IBuilder.Materials material) {
        System.out.println("Manager building with " + tool + " and " + material);
    }
}
