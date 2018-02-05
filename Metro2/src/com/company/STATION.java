package com.company;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class STATION {
	private int iD;
	private String NAME;
	public LINE LINE;
	public LinkedList<PASSENGER> PASSENGER = new LinkedList<>();
	public ArrayList<TRAIN_VISIT_STATION> TRAIN_VISIT_STATION = new ArrayList<TRAIN_VISIT_STATION>();

	public STATION(String NAME, LINE LINE, LinkedList<PASSENGER> PASSENGER) {
		this.NAME = NAME;
		this.LINE = LINE;
		this.PASSENGER = PASSENGER;
	}
}