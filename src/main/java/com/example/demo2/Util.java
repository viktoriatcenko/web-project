package com.example.demo2;

import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Util {
    public static ResultSet getResultFromDB() {
        ResultSet resultSet = null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/my_db",
                    "postgres", "postgres"
            );
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from books");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return resultSet;
    }

    public static void printPage(HttpServletResponse response, String s1, String s2) {
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
            ResultSet resultSet = Util.getResultFromDB();
            while (resultSet.next()) {
                pw.println(resultSet.getString(s1) + " "
                        + resultSet.getString(s2));
            }
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

}
