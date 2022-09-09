package com.example.demo.tpcApp.model;

import com.example.demo.dataBaseConfig.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NewProductsStatement {
    Connection con = Database.createCon();

    public NewProductsOutput hardCodeTest(NewProductsInput input) throws Exception {
        List<NewProductsInput> list = new ArrayList<>();
        NewProductsOutput npo = new NewProductsOutput();
        input.setCutOffDuration(11111L);
        input.setItemLimit(22222L);
        input.setSubjectString("Gloomy products");
        list.add(input);
        return npo;
    }

    public synchronized List<NewProductModel> insertNew(NewProductsInput npo) throws SQLException {
        List<NewProductModel> output = new ArrayList<>();

        PreparedStatement ps81 = con.prepareStatement(
                "   SELECT i_id, i_title, a_fname, a_lname " +
                        "     FROM item, author " +
                        "    WHERE lower(i_subject) = lower(?) " +
                        "      AND i_pub_date > to_timestamp(?, 'YYYY-MM-DD HH24:MI:SS') " +
                        "      AND i_a_id = a_id  " +
                        " ORDER BY i_pub_date desc, i_title asc");

        ResultSet rs = ps81.executeQuery();
        // Results
        while (rs.next()) {
            output.add(new NewProductModel(rs));
        }

        ps81.executeQuery();
        ps81.close();
        return output;
    }
}