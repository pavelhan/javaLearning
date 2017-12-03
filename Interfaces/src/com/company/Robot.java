package com.company;

public class Robot implements ICleaner, IBuilder {

    IBuilder iBuilder;
    ICleaner iCleaner;

    @Override
    public void build(IBuilder.Tools tool, IBuilder.Materials material) {
        System.out.println("Worker building with " + tool + " and " + material);
    }

    @Override
    public void clean(ICleaner.Tools tool, ICleaner.Materials material) {

    }
}
