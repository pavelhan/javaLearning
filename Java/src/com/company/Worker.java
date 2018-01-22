package com.company;

public class Worker implements Comparable<Worker>{
    public String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Worker o) {
        if(this.name.length() > o.name.length()){
            return 1;
        }else {
            return -1;
        }
    }
}
