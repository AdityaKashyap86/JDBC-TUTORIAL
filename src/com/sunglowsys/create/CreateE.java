package com.sunglowsys.create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateE {
    public static void main(String[] args) /*throws SQLException, ClassNotFoundException */ {

        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/jdbc_sunglowsys", "root", "root");

        PreparedStatement preparedStatement = connection.prepareStatement ("insert into employee(emp_name, email, mobile, dept, salary) values ('aditya','kashyap',89898999,'sunglowsys',200000);");
        preparedStatement.executeUpdate ();
        System.out.println ("done");

        connection.close ();
    }
        catch (Exception e) {
            e.printStackTrace ();
        }

    }
}
