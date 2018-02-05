package com.company;
import java.util.ArrayList;

public class WAGON {
	private int iD;
	private String NAME;
	public TRAIN TRAIN;
	public ArrayList<PASSENGER> PASSENGER = new ArrayList<PASSENGER>();
	WagonType type;

	public WAGON(String NAME, WagonType type) {

		this.NAME = NAME;
		this.type = type;
	}

}