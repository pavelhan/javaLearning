package com.company;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class dbConnection {

    public void connectDB() {
        String login = "user1";
        String password = "pass1";
        List<Ships> shipsList = new ArrayList<>();
        String databaseURL = "jdbc:mysql://localhost/classicmodels?" + "user=" + login + "&password=" + password;

        // 1. Connect to database
        ConnectionSource connectionSource = null;
        try {
            connectionSource = new JdbcConnectionSource(databaseURL);

        // Создание DAO объекта

            Dao<Ships, String> accountDao = DaoManager.createDao(connectionSource, Ships.class);
            QueryBuilder<Ships, String> productsTable = accountDao.queryBuilder();
            productsTable.where().eq("productLine", "Ships");
            shipsList = productsTable.query();
            for (Ships ships : shipsList){
                System.out.println(ships);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public dbConnection() throws SQLException {
    }
}
