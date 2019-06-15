package test;

import model.IntegerSet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntegerSetTest {
    IntegerSet testSet;

    @Before
    public void setup() {
        testSet = new IntegerSet();
    }

    @Test
    public void testInsertNotThere() {
        //check that the number is not already in the set
        checkSetEmptyDoesntContain(3);

        //insert the number into the set
        testSet.insert(3);

        //check that the number is in the set once
        checkSetContainsOnce(3);
    }

    @Test
    public void testInsertAlreadyThere() {
        //check that the number is not already in the set
        checkSetEmptyDoesntContain(3);

        //insert the number into the set
        testSet.insert(3);

        //check that the number is in the set once
        checkSetContainsOnce(3);

        //insert the number again
        testSet.insert(3);
        //check that the number is in the set once
        checkSetContainsOnce(3);
    }

    @Test
    public void testRemoveNotThere() {
        assertFalse(testSet.contains(3));

        int sizeBefore = testSet.size();
        testSet.remove(3);
        int sizeAfter = testSet.size();
        assertEquals(sizeBefore, sizeAfter);
    }

    @Test
    public void testRemovePresent() {
        testSet.insert(3);
        assertTrue(testSet.contains(3));

        testSet.remove(3);
        assertEquals(Integer.valueOf(0), testSet.size());
    }

    private void checkSetContainsOnce(int num) {
        assertTrue(testSet.contains(num));
        assertEquals(Integer.valueOf(1), testSet.size());
    }

    private void checkSetEmptyDoesntContain(int num) {
        assertEquals(Integer.valueOf(0), testSet.size());
        assertFalse(testSet.contains(num));
    }
}
