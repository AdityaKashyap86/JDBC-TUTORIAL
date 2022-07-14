package com.sunglowsys.update;

import com.sunglowsys.connection.CreateConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateE {
    public static void main(String[] args) {
        try {
            Connection c = CreateConnection.getConnection ();
            String q = "update employee set emp_name='shivam kumar'  where emp_id=1";

            PreparedStatement pstm = c.prepareStatement (q);
            pstm.executeUpdate ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}