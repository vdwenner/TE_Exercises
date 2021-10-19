package com.techelevator.rich;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassicJDBC {

    public static void main(String[] args) throws SQLException {
        //DO STUFF

        BasicDataSource myDataSource = new BasicDataSource();
        myDataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        myDataSource.setUsername("postgres");
        myDataSource.setPassword("postgres1");


        Connection myConnection = myDataSource.getConnection();

        Statement myStatement = myConnection.createStatement();

        String mySQLQuery = "SELECT * FROM park";

        ResultSet myResults = myStatement.executeQuery(mySQLQuery);

        while(myResults.next()){

            String parkName = myResults.getString("park_name");

            System.out.println(parkName);

        }

    }

}