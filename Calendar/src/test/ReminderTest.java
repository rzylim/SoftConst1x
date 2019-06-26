package test;

import model.Date;
import model.Reminder;
import model.Time;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReminderTest {
    Reminder testReminder;

    @Before
    public void setup(){
        Date testDate = new Date(26,06,2019);
        Time testTime = new Time(14,43);
        testReminder = new Reminder(testDate, testTime, "testReminder");
    }

    @Test
    public void testAddNote(){
        assertEquals(0, testReminder.getNotes().size());
        testReminder.addNote("note1");
        assertEquals(1, testReminder.getNotes().size());
        assertEquals("note1", testReminder.getNotes().get(0));
        testReminder.addNote("note2");
        assertEquals(2, testReminder.getNotes().size());
        assertEquals("note2", testReminder.getNotes().get(1));
    }
}
