package com.company;

public class Tool implements Comparable<Tool>{
    public String type;

    public Tool(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Tool o) {
        if (this.type.length() > o.type.length()){
            return 1;
        }else {
            return -1;
        }

    }
}
