package ui;

import model.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar(new Date(20, 6, 2019));
        Event event1 = new Event(new Date(21, 6, 2019), new Time(10, 00), "event1");
        Event event2 = new Event(new Date(21, 6, 2019), new Time(11, 00), "event2");
        Meeting meeting1 = new Meeting(new Date(23, 6, 2019), new Time(19, 15), "meeting1");
        Meeting meeting2 = new Meeting(new Date(28, 6, 2019), new Time(00, 43), "meeting2");
        meeting2.addAttendee("person1@test.com");
        meeting2.addAttendee("person2@test.com");
        Reminder meeting2Reminder = new Reminder(new Date(28, 6, 2019), new Time(00, 00), "reminder for meeting2");
        meeting2Reminder.addNote("Note for meeting2Reminder");
        meeting2.setReminder(meeting2Reminder, calendar);

        calendar.addEntry(event1);
        calendar.addEntry(event2);
        calendar.addEntry(meeting1);
        calendar.addEntry(meeting2);

        meeting2.emailInvitations();

        ArrayList<Entry> events = calendar.getEvents();
        ArrayList<Entry> meetings = calendar.getMeetings();
        ArrayList<Entry> reminders = calendar.getReminders();

        System.out.println("Events:");
        for(Entry event : events) {
            System.out.println(event.getDate().getLongDate());
        }
        System.out.println("Meetings:");
        for(Entry meeting : meetings) {
            System.out.println(meeting.getDate().getLongDate());
        }
        System.out.println("Reminders:");
        for(Entry reminder : reminders) {
            System.out.println(reminder.getDate().getLongDate());
        }
    }
}
