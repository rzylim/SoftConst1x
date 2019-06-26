package model;

import java.util.ArrayList;

public class Reminder extends Entry {

    private ArrayList<String> notes;

    public Reminder(Date date, Time time, String label) {
        super(date, time, label);
        notes = new ArrayList<>();
    }

    //getters
    public ArrayList<String> getNotes() { return notes; }

    public void addNote(String note) { notes.add(note); }
}
