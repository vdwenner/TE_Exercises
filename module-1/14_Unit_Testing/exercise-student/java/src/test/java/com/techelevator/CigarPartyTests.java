package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CigarPartyTests {
    @Test
    public void RangeOfValuesForWeekendTests(){
        CigarParty party = new CigarParty();
        assertEquals(true, party.haveParty(40, true));
        assertEquals(true, party.haveParty(60, true));
        assertEquals(true, party.haveParty(80, true));
        assertEquals(false, party.haveParty(39, true));
    }
    @Test
    public void RangeOfValuesForWeekdayTests() {
        CigarParty party = new CigarParty();
        assertEquals(true, party.haveParty(40, false));
        assertEquals(true, party.haveParty(60, false));
        assertEquals(false, party.haveParty(39, false));
        assertEquals(false, party.haveParty(61, false));
    }
}
