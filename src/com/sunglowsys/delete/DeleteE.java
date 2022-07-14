package com.sunglowsys.delete;

import com.sunglowsys.connection.CreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteE {
    public static void main(String[] args) {
        try {
            Connection c = CreateConnection.getConnection ();
            String query="delete from employee where emp_id=2";

            PreparedStatement pstm = c.prepareStatement (query);
            pstm.executeUpdate ();

            System.out.println ("Record update successfully");

        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
