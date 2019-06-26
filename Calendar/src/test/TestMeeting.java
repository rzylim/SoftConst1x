package test;

import model.Date;
import model.Meeting;
import model.Time;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestMeeting {
    Meeting testMeeting;

    @Before
    public void setup(){
        Date testMeetingDate = new Date(26,6,2019);
        Time testMeetingTime = new Time(14,43);
        testMeeting = new Meeting(testMeetingDate, testMeetingTime, "testMeeting");
        testMeeting.addAttendee("member1");
        testMeeting.addAttendee("member2");
        testMeeting.addAttendee("member3");
    }

    @Test
    public void testAddAttendee(){
        assertEquals(3, testMeeting.getAttendees().size());

        testMeeting.addAttendee("member4");
        assertEquals(4, testMeeting.getAttendees().size());
        assertTrue(testMeeting.getAttendees().contains("member4"));

        testMeeting.addAttendee("member4");
        assertEquals(4, testMeeting.getAttendees().size());
        assertTrue(testMeeting.getAttendees().contains("member4"));

        testMeeting.addAttendee("member5");
        assertEquals(5, testMeeting.getAttendees().size());
        assertTrue(testMeeting.getAttendees().contains("member5"));
    }

    @Test
    public void testRemoveAttendee(){
        testMeeting.addAttendee("member1");
        testMeeting.addAttendee("member2");
        testMeeting.addAttendee("member3");
        assertEquals(3, testMeeting.getAttendees().size());
        assertTrue(testMeeting.getAttendees().contains("member1"));
        assertTrue(testMeeting.getAttendees().contains("member2"));
        assertTrue(testMeeting.getAttendees().contains("member3"));

        testMeeting.removeAttendee("member2");
        assertTrue(testMeeting.getAttendees().contains("member1"));
        assertFalse(testMeeting.getAttendees().contains("member2"));
        assertTrue(testMeeting.getAttendees().contains("member3"));
    }
}
