package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class FrontTimesTests {
    @Test
    public void StringGreaterThan3Tests() {
        FrontTimes exercise = new FrontTimes();
        assertEquals("JosJosJos", exercise.generateString("Josh", 3));
        assertEquals("JosJos", exercise.generateString("Josh", 2));
        assertEquals("Jos", exercise.generateString("Josh", 1));
    }
    @Test
    public void StringLessThan3Tests(){
        FrontTimes exercise = new FrontTimes();
        assertEquals("JoJoJo", exercise.generateString("Jo", 3));
        assertEquals("JoJo", exercise.generateString("Jo", 2));
        assertEquals("Jo", exercise.generateString("Jo", 1));
    }
    @Test
    public void EmptyStringTests(){
        FrontTimes exercise = new FrontTimes();
        assertEquals("", exercise.generateString("", 3));
        assertEquals("", exercise.generateString("", 2));
        assertEquals("", exercise.generateString("", 1));
    }

    @Test
    public void NullTests(){
        FrontTimes exercise = new FrontTimes();
        assertEquals("", exercise.generateString(null, 3));
        assertEquals("", exercise.generateString(null, 2));
        assertEquals("", exercise.generateString(null, 1));
    }
}
