package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class StringBitsTests {
    @Test
    public void Null_ExpectEmptyString() {
        StringBits exercises = new StringBits();
        assertEquals("", exercises.getBits(null));
    }
    @Test
    public void StringLength0_ExpectEmptyString() {
        StringBits exercises = new StringBits();
        assertEquals("", exercises.getBits(""));
    }
    @Test
    public void StringLength1_ExpectedAlternateLetters(){
        StringBits exercises = new StringBits();
        assertEquals("H", exercises.getBits("H"));
    }
    @Test
    public void StringLength20orMore_ExpectedAlternateLetters(){
        StringBits exercises = new StringBits();
        assertEquals("Js", exercises.getBits("Josh"));
        assertEquals("Tc lvtr", exercises.getBits("Tech Elevator"));
    }
}
