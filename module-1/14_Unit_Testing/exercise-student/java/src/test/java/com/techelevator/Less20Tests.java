package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Less20Tests {
    @Test
    public void Within1Less_ExpectTrue() {
        Less20 exercises = new Less20();
        assertEquals(true, exercises.isLessThanMultipleOf20(19));
        assertEquals(false, exercises.isLessThanMultipleOf20(21));
        assertEquals(true, exercises.isLessThanMultipleOf20(39));
        assertEquals(false, exercises.isLessThanMultipleOf20(41));
    }
    @Test
    public void Within2LessTest_ExpectTrue(){
        Less20 exercises = new Less20();
        assertEquals(true, exercises.isLessThanMultipleOf20(18));
        assertEquals(false, exercises.isLessThanMultipleOf20(22));
        assertEquals(true, exercises.isLessThanMultipleOf20(38));
        assertEquals(false, exercises.isLessThanMultipleOf20(42));
    }
    @Test
    public void Within3Test_ExpectFalse(){
        Less20 exercises = new Less20();
        assertEquals(false, exercises.isLessThanMultipleOf20(17));
        assertEquals(false, exercises.isLessThanMultipleOf20(23));
        assertEquals(false, exercises.isLessThanMultipleOf20(3));
        assertEquals(false, exercises.isLessThanMultipleOf20(37));
        assertEquals(false, exercises.isLessThanMultipleOf20(43));
    }
}
