package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1L, 1L, 1L, 
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2L, 1L, 1L,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3L, 2L, 1L,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4L, 2L, 2L,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao sut;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        //set up and produce test(expected) data
        Timesheet timesheet = new Timesheet((long)3, (long)1, (long)1, LocalDate.of(2012, 05, 11), (double)8.8, true, "that sounds pretty fun.");
        Timesheet expected = sut.createTimesheet(timesheet);
        //end setup

        //do work and get actual data
        Timesheet actual = sut.getTimesheet(expected.getTimesheetId());

        //perform the test
        assertTimesheetsMatch(expected, actual);
    }
        // complete before other methods
    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = new Timesheet((long)11, (long)1, (long)1, LocalDate.of(2012, 05, 11), (double)8.8, true, "that sounds pretty fun.");
        Timesheet expected = sut.createTimesheet(timesheet);
        Timesheet actual = sut.getTimesheet(expected.getTimesheetId());

        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());

    }






    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        Assert.fail();
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        Assert.fail();
    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {
        //set up test data
        Timesheet expected = new Timesheet();
        expected.setBillable(true);
        expected.setDateWorked(LocalDate.of(2015, 12, 31));
        expected.setDescription("Fuzzy panda");
        expected.setEmployeeId((long)2);
        expected.setHoursWorked(6.5);
        expected.setProjectId((long)2);
        expected.setTimesheetId((long)1);
        Timesheet actual = sut.createTimesheet(expected);
        expected.setTimesheetId(actual.getTimesheetId());
        //end test data setup

        //perform work here with method you are testing

        //asset equality(do the test)
        assertTimesheetsMatch(expected, actual);

    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {

        Assert.fail();
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet expected = new Timesheet((long)11, (long)1, (long)1, LocalDate.of(2012, 05, 11), (double)8.8, true, "that sounds pretty fun.");

        Timesheet actual = sut.updateTimesheet(expected);
        assertTimesheetsMatch(expected, actual);
    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {
        Assert.fail();
    }
        //53 and 54 repeated - create another controlled piece of test data.
        //run method that I was testing.
        //check the database (using the check timesheet method)
    @Test
    public void getBillableHours_returns_correct_total() {
        Assert.fail();
    }

    public void printTimesheetAttributes(Timesheet timesheet) {
        System.out.println("{");
        System.out.println("EmployeeId: "+timesheet.getEmployeeId());
        System.out.println("ProjectId: "+timesheet.getProjectId());
        System.out.println("TimesheetId: "+timesheet.getTimesheetId());
        System.out.println("EmployeeId: "+timesheet.getDateWorked());
        System.out.println("HoursWorked: "+timesheet.getHoursWorked());
        System.out.println("Description: "+timesheet.getDescription());
        System.out.println("}");
    }

    public void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        System.out.println("Expected: ");
        printTimesheetAttributes(expected);

        System.out.println("Actual: ");
        printTimesheetAttributes(actual);

        System.out.println(1);
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());

        System.out.println(2);
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());

        System.out.println(3);
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());

        System.out.println(4);
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());

        System.out.println(5);
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);

        System.out.println(6);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());

        System.out.println(7);
        Assert.assertEquals(expected.getDescription(), actual.getDescription());


    }

}
