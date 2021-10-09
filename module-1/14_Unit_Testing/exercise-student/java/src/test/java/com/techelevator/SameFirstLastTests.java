package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class SameFirstLastTests {
    @Test
    public void Null_ExpectFalse(){
        SameFirstLast exercises = new SameFirstLast();
        assertEquals(false, exercises.isItTheSame(null));
    }
    @Test
    public void ArrayLength0_ExpectFalse() {
        SameFirstLast exercises = new SameFirstLast();
        assertEquals(false, exercises.isItTheSame(new int[] {}));
    }
    @Test
    public void ArrayLength1_ExpectTrue() {
        SameFirstLast exercises = new SameFirstLast();
        assertEquals(true, exercises.isItTheSame(new int[] {1}));
    }
    @Test
    public void ArrayLength20orMore() {
        SameFirstLast exercises = new SameFirstLast();
        assertEquals(true, exercises.isItTheSame(new int[] { 1, 1 }));
        assertEquals(true, exercises.isItTheSame(new int[] { 1, 3, 1 }));
        assertEquals(false, exercises.isItTheSame(new int[] { 1, 3 }));
        assertEquals(false, exercises.isItTheSame(new int[] { 1, 3, 3 }));
    }
}
