package com.example.demo.tpcApp.model;

import com.example.demo.dataBaseConfig.Database;

import java.sql.*;


public class NewCustomerStatement {
    private Connection con = Database.createCon();

    public NewCustomerOutput testViaHardCode(NewCustomerInput input) {
        NewCustomerOutput nco = new NewCustomerOutput();
        input.setPoId(11111L);
        input.setBusinessName("Programmer");
        input.setBillingZip("9821");
        nco.setCustomerId(input.getPoId());
        return nco;
    }

    public synchronized long getAddressID(NewCustomerInput input)
            throws SQLException {
        long addId = -1;
        String ba1 = input.getBillingAddr1();
        String ba2 = input.getBillingAddr2();
        String bc = input.getBillingCity();
        String bs = input.getBillingState();
        String bz = input.getBillingZip();
        String sql = null;
        if ((ba1 != null) && (ba2 != null) && (bc != null) && (bs != null) && (bz != null)) {
            sql = "select addr_id from address " + " where lower(ADDR_STREET1) = '" + input.getBillingAddr1() + "' " +
                    " " + "   and lower(ADDR_STREET2) = '" + input.getBillingAddr2() + "' " +
                    "   and lower(ADDR_CITY) = '" + input.getBillingCity() + "' " +
                    " " + "   and lower(ADDR_STATE) = '" + input.getBillingState() + "' " +
                    "   and lower(ADDR_ZIP) = '" + input.getBillingZip() + "' " +
                    " " + "   and ADDR_CO_ID = '" + input.getBillingCountry() + "' ";
        }

        PreparedStatement ps101 = con.prepareStatement(sql);
        ResultSet rs = ps101.executeQuery();

        if (rs != null)
            rs.close();

        ps101.close();

        return (addId);
    }

    public synchronized long insertCostumer(NewCustomerInput input) throws SQLException {
        long c_id = -1;
        String sql = "";
        Statement stmt = Database.createMaxStatement(con);

        sql = "SELECT max(C_ID) FROM customer";
        ResultSet rs = stmt.executeQuery(sql);

        if (rs != null) {
            rs.close();
        }

        if (rs.next()) {
            c_id = rs.getLong(1);
        }
        c_id++;
        sql = "INSERT INTO CUSTOMER( C_ID, C_BUSINESS_NAME, C_BUSINESS_INFO, C_PASSWD, C_CONTACT_FNAME, C_CONTACT_LNAME, C_CONTACT_PHONE," +
                "" + " '" + input.getPoId() + "'," + " '" + input.getBusinessName() + "'," + " '" + input.getBusinessInfo() + "'," + " '" + input.getPassword() + "'," + " '" + input.getContactLName() + "'," + " '" + input.getContactPhone() + "')" + " " +
                " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps197 = con.prepareStatement(sql);
        ps197.executeUpdate();

        ps197.close();
        stmt.close();
        return (c_id);
    }

    public synchronized long deleteCostumer(Long c_id) throws SQLException {
//        String query = "delete from CUSTOMER where C_ID = ? and id_entity in (?)";
        String query = "delete from CUSTOMER where C_ID = '" + c_id + "'";
        PreparedStatement prepare = con.prepareStatement(query);
        prepare.setLong(0, c_id);
        prepare.execute();

        prepare.close();
        return c_id;
    }
}
