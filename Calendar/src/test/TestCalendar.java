package test;

import model.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalendar {
    Calendar testCalendar;
    Event testEvent;
    Reminder testReminder;
    Meeting testMeeting;

    @Before
    public void setup(){
        Date testCurrDate = new Date(25,6,2019);
        testCalendar = new Calendar(testCurrDate);

        Date testEventDate = new Date(26,6,2019);
        Time testEventTime = new Time(14,43);
        testEvent = new Event(testEventDate, testEventTime, "testEvent");
        Date testReminderDate = new Date(26,6,2019);
        Time testReminderTime = new Time(13,43);
        testReminder = new Reminder(testReminderDate, testReminderTime, "testReminder");
        Date testMeetingDate = new Date(27,6,2019);
        Time testMeetingTime = new Time(14,43);
        testMeeting = new Meeting(testMeetingDate, testMeetingTime, "testMeeting");
        testMeeting.addAttendee("member1");
        testMeeting.addAttendee("member2");
        testMeeting.addAttendee("member3");

        testCalendar.addEntry(testEvent);
        testEvent.setReminder(testReminder, testCalendar);
        testCalendar.addEntry(testMeeting);
    }

    @Test
    public void testGetSoonest(){
        assertEquals(3, testCalendar.getEntries().size());
        assertEquals(testReminder, testCalendar.getSoonest());
    }

    @Test
    public void testGetEvents(){
        assertEquals(3, testCalendar.getEntries().size());
        assertEquals(1, testCalendar.getEvents().size());
        assertEquals(testEvent, testCalendar.getEvents().get(0));
    }

    @Test
    public void testGetReminders(){
        assertEquals(3, testCalendar.getEntries().size());
        assertEquals(1, testCalendar.getReminders().size());
        assertEquals(testReminder, testCalendar.getReminders().get(0));
    }

    @Test
    public void testGetMeetings(){
        assertEquals(3, testCalendar.getEntries().size());
        assertEquals(1, testCalendar.getMeetings().size());
        assertEquals(testMeeting, testCalendar.getMeetings().get(0));
    }
}
