package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Lucky13Tests {
    @Test
    public void Null_ExpectTrue(){
        Lucky13 lucky = new Lucky13();
        assertEquals(true, lucky.getLucky(null));
    }
    @Test
    public void ArrayWithNo1sOr0s_ExpectTrue() {
        Lucky13 lucky = new Lucky13();
        assertEquals(true, lucky.getLucky(new int[] { 0, 2, 4 }));
        assertEquals(true, lucky.getLucky(new int[] {}));
    }
    @Test
    public void ArrayWithAll1sOr0s_ExpectFalse() {
        Lucky13 lucky = new Lucky13();
        assertEquals(false, lucky.getLucky(new int[] { 1, 1, 1 }));
        assertEquals(false, lucky.getLucky(new int[] { 3, 3, 3 }));
        assertEquals(false, lucky.getLucky(new int[] { 1, 3 }));
    }
}
