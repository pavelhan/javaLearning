package com.company;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            dbConnection connection = new dbConnection();
            connection.connectDB();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
