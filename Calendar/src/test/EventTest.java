package test;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EventTest {
    Event testEvent;
    Calendar testCalendar;
    Reminder testReminder;

    @Before
    public void setup() {
        Date testEventDate = new Date(26,6,2019);
        Time testEventTime = new Time(14,43);
        testEvent = new Event(testEventDate, testEventTime, "testEvent");
        Date testCurrDate = new Date(25,6,2019);
        testCalendar = new Calendar(testCurrDate);
        Date testReminderDate = new Date(26,6,2019);
        Time testReminderTime = new Time(13,43);
        testReminder = new Reminder(testReminderDate, testReminderTime, "testReminder");
    }

    @Test
    public void testSetReminder() {
        assertEquals(null, testEvent.getReminder());
        assertEquals(0, testCalendar.getEntries().size());

        testEvent.setReminder(testReminder, testCalendar);
        assertEquals(testReminder, testEvent.getReminder());
        assertEquals(1, testCalendar.getEntries().size());
        assertEquals(1, testCalendar.getReminders().size());
        assertEquals(testReminder, testCalendar.getReminders().get(0));
    }
}
