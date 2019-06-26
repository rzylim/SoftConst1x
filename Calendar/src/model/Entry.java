package model;

public abstract class Entry {
    private Date date;
    private Time time;
    private String label;
    private int interval;

    public Entry(Date date, Time time, String label) {
        this.date = date;
        this.time = time;
        this.label = label;
        this.interval = 0;
    }

    //getters
    public Date getDate() { return date; }
    public Time getTime() { return time; }
    public String getLabel() { return label; }
    public int getInterval() { return interval; } //0 == not repeating

    //setters
    public void setDate(Date date) { this.date = date; }
    public void setTime(Time time) { this.time = time; }
    public void setLabel(String label) { this.label = label; }
    public void setInterval(int interval) { this.interval = interval; }
}
