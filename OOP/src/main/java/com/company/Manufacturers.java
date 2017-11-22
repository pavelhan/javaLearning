package com.company;

public enum Manufacturers {

    Konia("Konia is not a horse!"), GL("GL is Global Logic!"), Совтяжтрансмаш("Совок не победить!");

    private String slogan;

    Manufacturers(String slogan){
        this.slogan = slogan;
    }

    public String getSlogan(){
        return slogan;
    }



}
