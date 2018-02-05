package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here
            dbConnection connection = new dbConnection();
            Ships ships = new Ships();
            //connection.getObjectsFromDB(Ships.class,String.class);
            connection.createDBWithContent("com.company");

    }
}
