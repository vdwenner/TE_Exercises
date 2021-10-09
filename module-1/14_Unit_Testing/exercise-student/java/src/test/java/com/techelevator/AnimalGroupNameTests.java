package com.techelevator;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalGroupNameTests {
    @Test
    public void ProvideKnownAnimalName_ExpectKnownHerdName() {
        AnimalGroupName animalGroup = new AnimalGroupName();
        String herdName = animalGroup.getHerd("giraffe");
        assertEquals("Tower", herdName);
    }
    @Test
    public void ProvidedUnknownAnimalName_CrazyCase_ExpectUnknownHerdName() {
        AnimalGroupName animalGroup = new AnimalGroupName();
        String herdName = animalGroup.getHerd("giRAFFE");
        assertEquals("Tower", herdName);
    }
    @Test
    public void ProvidedUnknownAnimalName_ExpectUnknownHerdName() {
        AnimalGroupName animalGroup = new AnimalGroupName();
        String herdName = animalGroup.getHerd("");
        String herdName2 = animalGroup.getHerd("elephants");
        assertEquals("unknown", herdName);
        assertEquals("unknown", herdName2);
    }
    @Test
    public void ProvideNull_ExpectUnknownHerdName() {
        AnimalGroupName animalGroup = new AnimalGroupName();
        String herdName = animalGroup.getHerd(null);
        assertEquals("unknown", herdName);
    }

}
