package model;

import java.util.ArrayList;

public class Calendar {
    private Date currDate;
    private String email;
    private ArrayList<Entry> entries;

    public Calendar(Date date) {
        currDate = date;
        email = null;
        entries = new ArrayList<>();
    }

    //getters
    public Date getCurrDate() { return currDate; }
    public String getEmail() { return email; }
    public ArrayList<Entry> getEntries() { return entries; }

    //setters
    public void setCurrDate(Date currDate) { this.currDate = currDate; }
    public void setEmail(String email) { this.email = email; }

    public void addEntry(Entry entry) { entries.add(entry); }

    public Entry getSoonest() {
        Entry soonest = null;
        for(Entry entry : entries) {
            if(soonest == null) {
                soonest = entry;
                continue;
            }
            if(entry.getDate().getYear() < soonest.getDate().getYear()){
                soonest = entry;
                continue;
            }
            if(entry.getDate().getMonth() < soonest.getDate().getMonth()){
                soonest = entry;
                continue;
            }
            if(entry.getDate().getDay() < soonest.getDate().getDay()){
                soonest = entry;
                continue;
            }
            if(entry.getTime().getHour() < soonest.getTime().getHour()){
                soonest = entry;
                continue;
            }
            if(entry.getTime().getMinute() < soonest.getTime().getMinute()){
                soonest = entry;
                continue;
            }
        }
        return soonest;
    }

    public ArrayList<Entry> getEvents() {
        ArrayList<Entry> accum = new ArrayList<>();

        for(Entry entry : entries) {
            //if(entry instanceof Event) { accum.add(entry); }
            if(entry.getClass().equals(Event.class)) { accum.add(entry); }
        }
        return accum;
    }

    public ArrayList<Entry> getMeetings() {
        ArrayList<Entry> accum = new ArrayList<>();

        for(Entry entry : entries) {
            if(entry instanceof Meeting) { accum.add(entry); }
        }
        return accum;
    }

    public ArrayList<Entry> getReminders() {
        ArrayList<Entry> accum = new ArrayList<>();

        for(Entry entry : entries) {
            if(entry instanceof Reminder) { accum.add(entry); }
        }
        return accum;
    }
}
