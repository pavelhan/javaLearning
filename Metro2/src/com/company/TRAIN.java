package com.company;
import java.util.ArrayList;
import java.util.LinkedList;

public class TRAIN {
	private int iD;
	private int DRIVERID;
	public LINE LINE;
	public DRIVER CURRENT_DRIVER;
	public ArrayList<TRAIN_MOVING_LINE> TRAIN_MOVING_LINE = new ArrayList<TRAIN_MOVING_LINE>();
	public LinkedList<WAGON> WAGON = new LinkedList<WAGON>();
	public String NAME;

	public TRAIN(LinkedList<WAGON> WAGON) {
		this.WAGON = WAGON;
	}

	public TRAIN(LINE LINE, DRIVER CURRENT_DRIVER, ArrayList<TRAIN_MOVING_LINE> TRAIN_MOVING_LINE, LinkedList<WAGON> WAGON, String NAME) {
		this.LINE = LINE;
		this.CURRENT_DRIVER = CURRENT_DRIVER;
		this.TRAIN_MOVING_LINE = TRAIN_MOVING_LINE;
		this.WAGON = WAGON;
		this.NAME = NAME;
	}

	public TRAIN(String NAME, LinkedList<WAGON> WAGON) {
		this.NAME = NAME;
		this.WAGON = WAGON;
	}

	@Override
	public String toString() {
		return "TRAIN{" +
				"NAME='" + NAME + '\'' +
				'}';
	}
}