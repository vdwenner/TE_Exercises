package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class MaxEndTests {
    @Test
    public void EndLargerTest() {
        MaxEnd3 exercises = new MaxEnd3();
        assertArrayEquals(new int[] { 13, 13, 13 }, exercises.makeArray(new int[] { 13, 0, 3 }));
        assertArrayEquals(new int[] { 13, 13, 13 }, exercises.makeArray(new int[] { 13, 20, 3 }));
    }
    @Test
    public void BeginningLargerTest(){
        MaxEnd3 exercises = new MaxEnd3();
        assertArrayEquals(new int[] { 13, 13, 13 }, exercises.makeArray(new int[] { 13, 0, 3 }));
        assertArrayEquals(new int[] { 13, 13, 13 }, exercises.makeArray(new int[] { 13, 20, 3 }));
    }
    @Test
    public void EndSameSizesTest() {
        MaxEnd3 exercises = new MaxEnd3();
        assertArrayEquals(new int[] { 10, 10, 10 }, exercises.makeArray(new int[] { 10, 0, 10 }));
        assertArrayEquals(new int[] { 10, 10, 10 }, exercises.makeArray(new int[] { 10, 20, 10 }));
    }
}
