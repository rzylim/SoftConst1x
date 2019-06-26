package test;

import model.Date;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateTest {
    Date testDate;

    @Before
    public void setup() {
        testDate = new Date(26,6,2019);
    }

    @Test
    public void testGetDate() {
        assertEquals(26, testDate.getDay());
        assertEquals(6, testDate.getMonth());
        assertEquals(2019, testDate.getYear());
        assertEquals("26-6-2019", testDate.getShortDate());
        assertEquals("26 June 2019", testDate.getLongDate());
    }
}
