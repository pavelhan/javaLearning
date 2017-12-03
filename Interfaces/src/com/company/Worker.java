package com.company;

public class Worker extends Employee implements ICleaner, IBuilder {

    IBuilder iBuilder;

    public Worker(int salary) {
        super(salary);
    }


    @Override
    public void build(IBuilder.Tools tool, IBuilder.Materials material) {
        System.out.println("Worker building with " + tool + " and " + material);
    }

    @Override
    public void clean(ICleaner.Tools tool, ICleaner.Materials material) {
        System.out.println("Worker cleaning with " + tool + " and " + material);
    }
}
