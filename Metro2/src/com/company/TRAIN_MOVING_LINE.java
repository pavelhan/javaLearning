package com.company;
import java.util.ArrayList;
import java.util.Date;

public class TRAIN_MOVING_LINE {
	private int iD;
	private Date DATE_MOVING_START;
	public TRAIN TRAIN;
	public DRIVER DRIVER;
	public ArrayList<TRAIN_VISIT_STATION> TRAIN_VISIT_STATION = new ArrayList<TRAIN_VISIT_STATION>();


    public void startTrainMovingLine(TRAIN train, DRIVER currentDriver){
        currentDriver.setCURRENT_TRAIN(train);
        int currentExp = currentDriver.getExperience();
        if (!(currentExp <= 0)){
            currentDriver.setExperience(currentExp -1);
        }
        System.out.println("Train finished trip. Driver has decreased it's experience");
    }
}