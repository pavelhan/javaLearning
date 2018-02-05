package com.company;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.sql.SQLException;
import java.util.*;

public class dbConnection {

    ConnectionSource connectionSource = null;
    String login = "user1";
    String password = "pass1";
    String databaseURL = "jdbc:mysql://localhost/classicmodels?" + "user=" + login + "&password=" + password;


    public <T, Z> List<T> getObjectsFromDB(Class<T> clas, Class<Z> column) {

        List<T> objectsList = new ArrayList<T>();
        try {
            connectionSource = new JdbcConnectionSource(databaseURL);
            Dao<T, Z> accountDao = DaoManager.createDao(connectionSource, clas);
            QueryBuilder<T, Z> Table = accountDao.queryBuilder();
            //Table.where().eq("productLine", "Ships");
            objectsList = Table.query();
            if (objectsList.isEmpty()) {
                objectsList.add(clas.newInstance());
            }
            for (T cls : objectsList) {
                System.out.println(cls);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return objectsList;
    }

    public void createDBWithContent(String packageName) {
        ArrayList<Class<?>> classes = new ArrayList<>();
        String packageNameSlashed = packageName.replace(".", "/");

        URL directoryURL = Thread.currentThread().getContextClassLoader().getResource(packageNameSlashed);
        String directoryString = directoryURL.getFile();

        File directory = new File(directoryString);
        if (directory.exists()) {
            String[] files = directory.list();
            for (String fileName : files) {
                if (fileName.endsWith(".class")) {
                    fileName = fileName.substring
                            (0, fileName.length() - 6);
                    try {
                        classes.add(Class.forName(packageName + "." + fileName));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        try {
            connectionSource = new JdbcConnectionSource(databaseURL);
            /*Iterator<Class<?>> iterator = classes.iterator();
            while (iterator.hasNext()) {
                Annotation[] s = iterator.next().getAnnotations();
                if (s.length > 0) {
                    String annotation = s[0].toString();
                    if (annotation.length() > 0 && annotation.contains("DatabaseTable")) {
                        System.out.println(annotation);
                        System.out.println(iterator.next().toGenericString());
                        TableUtils.createTable(connectionSource, iterator.next());
                        System.out.println("Table created");
                    }
                }
            }*/
            for (Class cl : classes) {
                Annotation[] a = cl.getAnnotations();
                if (a.length > 0) {
                    String s = a[0].toString();
                    if(s.length() > 0 && s.contains("DatabaseTable")){
                        TableUtils.createTable(connectionSource,cl);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}