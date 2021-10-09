package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class NonStartTests {
    @Test
    public void FullStrings_expectNormalConcatenation() {
        NonStart exercises = new NonStart();
        assertEquals("ihere", exercises.getPartialString("Hi", "There"));
    }
    @Test
    public void PartialStrings_ExpectPartialConcatenation(){
        NonStart exercises = new NonStart();
        assertEquals("here", exercises.getPartialString("", "There"));
        assertEquals("i", exercises.getPartialString("Hi", ""));
    }
}
