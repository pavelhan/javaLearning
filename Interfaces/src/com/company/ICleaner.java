package com.company;

public interface ICleaner {

    public void clean(Tools tool, Materials material);

    enum Tools {
        Broom, Scoop
    }

    enum Materials {
        Water, CleningChemicals
    }
}
