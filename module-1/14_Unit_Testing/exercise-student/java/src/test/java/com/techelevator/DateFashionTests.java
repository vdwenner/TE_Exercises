package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class DateFashionTests {
    @Test
    public void AtLeastOneDateNotStylish_DontGetTable() {
        DateFashion exercises = new DateFashion();
        assertEquals(0, exercises.getATable(2, 2));
        assertEquals(0, exercises.getATable(0, 0));
        assertEquals(0, exercises.getATable(2, 7));
        assertEquals(0, exercises.getATable(2, 9));
    }
    @Test
    public void BothDatesStylish_MaybeGetTable(){
        DateFashion exercises = new DateFashion();
        assertEquals(1, exercises.getATable(3, 3));
        assertEquals(1, exercises.getATable(7, 7));
        assertEquals(1, exercises.getATable(3, 7));
    }
    @Test
    public void EitherDateVeryStylish_AlwaysGetTable() {
        DateFashion exercises = new DateFashion();
        assertEquals(2, exercises.getATable(8, 3));
        assertEquals(2, exercises.getATable(3, 8));
    }
}
