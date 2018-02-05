package com.company;
import java.util.ArrayList;
import java.util.LinkedList;

public class LINE {
	private int iD;
	public ArrayList<TRAIN> TRAINS;
	public LinkedList<STATION> STATION;

	public LINE() {
		TRAINS = new ArrayList<TRAIN>();
		STATION = new LinkedList<STATION>();
	}
}