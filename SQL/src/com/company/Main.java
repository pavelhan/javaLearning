package com.company;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        MySQLConnection dao = new MySQLConnection();
        try {
            dao.runQueries();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
