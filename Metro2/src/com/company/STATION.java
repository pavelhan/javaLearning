package com.company;
import java.util.ArrayList;

public class STATION {
	private int iD;
	private String NAME;
	public LINE LINE;
	public ArrayList<PASSENGER> PASSENGER = new ArrayList<PASSENGER>();
	public ArrayList<TRAIN_VISIT_STATION> TRAIN_VISIT_STATION = new ArrayList<TRAIN_VISIT_STATION>();
}