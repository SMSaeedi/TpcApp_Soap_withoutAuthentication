package com.example.demo.tpcApp.model;

import com.example.demo.dataBaseConfig.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ChangePaymentMethodStatement {
    private static Connection con = Database.createCon();

    public synchronized String updateCPM(ChangePaymentMethodInput input)
            throws SQLException {
        PreparedStatement ps79 = con.prepareStatement("UPDATE customer " +
                " SET C_PAYMENT_METHOD= '" + input.getPaymentMethod() + "', C_CREDIT_INFO= '" + input.getCreditInfo() + "', " +
                " WHERE C_ID = '" + input.getPoId() + "'");
        ps79.close();
        return input.getPaymentMethod();
    }

    public synchronized String getBusiName(long c_id) throws SQLException {
        String cbn = null;
        PreparedStatement ps89 = con.prepareStatement("select c_business_name from customer where c_id = '" + c_id + "' ");
        ps89.setLong(1, c_id);
        ResultSet rs = ps89.executeQuery();
        if (rs != null) {
            rs.close();
        }
        ps89.close();
        return (cbn);
    }
}