package com.techelevator.rich;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JDBCTemplateDemo {

    public static void main(String[] args) {

        //DO DSTUFF

        BasicDataSource myDataSource = new BasicDataSource();
        myDataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        myDataSource.setUsername("postgres");
        myDataSource.setPassword("postgres1");

        for(String park: getParkNameList(myDataSource)){
            System.out.println(park);
        }

        Scanner input = new Scanner(System.in);

        System.out.print("What state parks do you want to see: ");

        String state = input.nextLine();

        try {
            for (String statePark : getParksByState(myDataSource, state)) {
                System.out.println(statePark);
            }
        }
        catch(Exception ex){
            System.out.println("Something bad happened");
        }

    }

    private static List<String> getParkNameList(BasicDataSource sourceDB){

        List<String> result = new ArrayList<>();

        JdbcTemplate myTemplate = new JdbcTemplate(sourceDB);

        SqlRowSet parks = myTemplate.queryForRowSet("SELECT * FROM park");

        while(parks.next()){
            result.add(parks.getString("park_name"));
        }

        return  result;

    }

    private static List<String> getParksByState(BasicDataSource sourceDB, String stateCode){

        List<String> result = new ArrayList<>();

        JdbcTemplate myTemplate = new JdbcTemplate(sourceDB);

        SqlRowSet parks = myTemplate.queryForRowSet("SELECT p.* FROM park p INNER JOIN park_state ps ON p.park_id = ps.park_id AND ps.state_abbreviation='" + stateCode + "'");

        while(parks.next()){
            result.add(parks.getString("park_name"));
        }

        return  result;

    }
}
