package com.techelevator;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class WordCountTests {
    @Test
    public void Null_ExpectEmptySet() {
        WordCount exercises = new WordCount();
        assertEquals(new HashMap<String, Integer>(), exercises.getCount(null));
    }
    @Test
    public void EmptySetTest_ExpectEmptySet() {
        WordCount exercises = new WordCount();
        assertEquals(new HashMap<String, Integer>(), exercises.getCount(new String[] {}));
    }
    @Test
    public void UniqueTest_Expect1Each() {
        WordCount exercises = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Josh", 1);
        expected.put("David", 1);
        expected.put("Casey", 1);
        expected.put("Craig", 1);
        assertEquals(expected, exercises.getCount(new String[] { "Josh", "David", "Casey", "Craig" }));
    }
    @Test
    public void WordNotProvidedTests(){
        WordCount exercises = new WordCount();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("Josh", 4);
        assertNotEquals(expected, exercises.getCount(new String[] { "Craig", "Craig", "Craig", "Craig" }));
    }
}
