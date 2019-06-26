package model;

import java.util.HashSet;

public class Meeting extends Event {
    private HashSet<String> attendees;

    public Meeting(Date date, Time time, String label) {
        super(date, time, label);
        attendees = new HashSet<>();
    }

    //getters
    public HashSet<String> getAttendees() { return attendees; }

    public void addAttendee(String email) { attendees.add(email); }

    public void removeAttendee(String email) { attendees.remove(email); }

    public void emailInvitations() {
        for(String email : attendees) {
            System.out.println("Inviting: " + email);
        }
    }
}
