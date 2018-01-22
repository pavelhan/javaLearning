package com.company;

public class Manager extends Worker {
    public Manager(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }
}
