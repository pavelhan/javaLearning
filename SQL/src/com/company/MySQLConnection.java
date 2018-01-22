package com.company;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Date;

public class MySQLConnection {
    private Connection myConnnection = null;
    private Statement myStatement = null;
    private PreparedStatement myPreparedStatement = null;
    private ResultSet myResultSet = null;

    public void runQueries() throws Exception {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.jdbc.Driver");
            // Connection
            myConnnection = DriverManager
                    .getConnection("jdbc:mysql://localhost/classicmodels?useSSL=false&"
                            + "user=user1&password=pass1");

            // Statement for queries
            myStatement = myConnnection.createStatement();

			/*
             mysql> select * from payments limit 5;
			+----------------+-------------+---------------------+----------+
			| customerNumber | checkNumber | paymentDate         | amount   |
			+----------------+-------------+---------------------+----------+
			|            103 | HQ336336    | 2004-10-19 00:00:00 |  6066.78 |
			|            103 | JM555205    | 2003-06-05 00:00:00 | 14571.44 |
			|            103 | OM314933    | 2004-12-18 00:00:00 |  1676.14 |
			|            112 | BO864823    | 2004-12-17 00:00:00 | 14191.12 |
			|            112 | HQ55022     | 2003-06-06 00:00:00 | 32641.98 |
			+----------------+-------------+---------------------+----------+
			 */

            // Result set - the result of the SQL query
            // executeQuery - for DQL
            /*1. Выбрать всех контрагентов из Франции или Испании
            * */
            myResultSet = myStatement.executeQuery("select * from customers where country = 'France' or country = 'Spain'");
            printResults(myResultSet);
            System.out.println("-------------------------------");
            /*2.Выбрать всех контрагентов, имя контакта которых начинается на J и кредитный лимит больше 100 000*/
            myResultSet = myStatement.executeQuery("select * from customers where contactFirstName like 'J%' and creditLimit > 100000;");
            printResults(myResultSet);
            System.out.println("-------------------------------");
            /*3.Выбрать максимальную дату платежа для каждого контрагента у которых эта дата была до 2004-го года
            * */
            myResultSet = myStatement.executeQuery("select customerNumber, max(paymentDate) from payments GROUP BY customerNumber having max(paymentDate) < STR_TO_DATE ('20040101','%Y%m%d')");
            printResults(myResultSet);
            System.out.println("-------------------------------");

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

    private void printMetaData(ResultSet resultSet) throws SQLException {
        // Metadata from the database
        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
            System.out.println("Column " + i + " "
                    + resultSet.getMetaData().getColumnName(i));
        }
    }

    private String getData(ResultSet resultSet, String columnName, String columnType) {
        String res;
        try {
            switch (columnType) {
                case "INT":
                case "BIGINT":
                    res = "" + resultSet.getInt(columnName);
                    break;
                case "DATE":
                case "DATETIME":
                case "TIMESTAMP":
                    res = "" + resultSet.getDate(columnName);
                    break;
                case "CHAR":
                case "VARCHAR":
                    res = "" + resultSet.getString(columnName);
                    break;
                case "FLOAT":
                    res = "" + resultSet.getFloat(columnName);
                    break;
                case "DOUBLE":
                    res = "" + resultSet.getDouble(columnName);
                    break;
                case "BOOLEAN":
                    res = "" + resultSet.getBoolean(columnName);
                    break;
                default:
                    res = "";
            }
            return res;
        } catch (SQLException e) {
            e.printStackTrace();
            return "";
        }
    }
    private String[] getColumnNames(ResultSet resultSet) throws SQLException {
        // Metadata from the database
        String[] columns = new String[resultSet.getMetaData().getColumnCount()];

        for (int i = 0; i < columns.length; i++) {
            columns[i] = resultSet.getMetaData().getColumnName(i + 1);
        }
        return columns;
    }

    private String[] getColumnTypes(ResultSet resultSet) throws SQLException {
        // Metadata from the database
        String[] types = new String[resultSet.getMetaData().getColumnCount()];

        for (int i = 0; i < types.length; i++) {
            types[i] = resultSet.getMetaData().getColumnTypeName(i + 1);
        }
        return types;
    }

    private void printResults(ResultSet resultSet) throws SQLException {
        String[] columns = getColumnNames(resultSet);
        String[] types = getColumnTypes(resultSet);
        int cnt = 0;
        for (int i = 0; i < columns.length; i++) {
            System.out.print(columns[i] + " | ");
            cnt += columns[i].length();
        }
        System.out.println("");
        for (int i = 0; i < cnt + 3 * columns.length - 1; i++)
            System.out.print("-");
        System.out.println("");

        while (resultSet.next()) {
            for (int i = 0; i < columns.length; i++) {
                System.out.print(getData(resultSet, columns[i], types[i])
                        + " | ");
            }
            System.out.println("");
        }
    }

    // closing
    private void close() {
        try {
            if (myResultSet != null) {
                myResultSet.close();
            }
            if (myStatement != null) {
                myStatement.close();
            }
            if (myPreparedStatement != null) {
                myPreparedStatement.close();
            }
            if (myConnnection != null) {
                myConnnection.close();
            }
        } catch (Exception e) {
        }
    }
}
