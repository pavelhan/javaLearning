package com.company;

public interface IBuilder {

    public void build(Tools tool, Materials material);

    enum Tools {
        Hummer, Saw
    }

    enum Materials {
        Sand, Rocks
    }
}
