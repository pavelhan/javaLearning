package com.company;
import java.util.ArrayList;
import java.util.Comparator;


public class DRIVER {
	private int iD;
	private String NAME;
	public TRAIN CURRENT_TRAIN;
	public ArrayList<TRAIN_MOVING_LINE> TRAIN_MOVING_LINE = new ArrayList<TRAIN_MOVING_LINE>();
	public ArrayList<TRAIN> TRAIN = new ArrayList<TRAIN>();
	private int experience;

    public DRIVER(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setCURRENT_TRAIN(TRAIN CURRENT_TRAIN) {
        this.CURRENT_TRAIN = CURRENT_TRAIN;
    }
}