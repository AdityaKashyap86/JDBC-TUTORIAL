package com.sunglowsys.fetchData;

import com.sunglowsys.connection.CreateConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchE {
    public static void main(String[] args) {
        try {
            Connection c= CreateConnection.getConnection ();
            String query="select * from employee";
            System.out.println ("Query fetch properly");

            Statement statement= c.createStatement ();
            ResultSet set= statement.executeQuery (query);

            while (set.next ()) {
                long emp_id = set.getLong (1);
                String emp_name = set.getString (2);
                String email = set.getString (3);
                long mobile = set.getLong (4);
                String dept = set.getString (5);
                long salary = set.getLong (6);

                System.out.println (emp_id+":"+emp_name+":"+email+":"+mobile+":"+dept+":"+salary);
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
}
