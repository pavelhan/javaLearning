package com.company;

public class Builder extends Employee implements IBuilder, ICleaner {


    public Builder(int salary) {
        super(salary);
    }

    @Override
    public void build(IBuilder.Tools tool, IBuilder.Materials material) {
        System.out.println("Builder building with " + tool + " and " + material);
    }

    @Override
    public void clean(ICleaner.Tools tool, ICleaner.Materials material) {
        System.out.println("Builder cleaning with " + tool + " and " + material);
    }
}
