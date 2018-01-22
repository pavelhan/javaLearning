package com.company;
import java.util.ArrayList;

public class TRAIN {
	private int iD;
	private int DRIVERID;
	public LINE LINE;
	public DRIVER CURRENT_DRIVER;
	public ArrayList<TRAIN_MOVING_LINE> TRAIN_MOVING_LINE = new ArrayList<TRAIN_MOVING_LINE>();
	public ArrayList<DRIVER> DRIVER = new ArrayList<DRIVER>();
	public ArrayList<WAGON> WAGON = new ArrayList<WAGON>();
}