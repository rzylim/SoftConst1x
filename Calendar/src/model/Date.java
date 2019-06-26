package model;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getters
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public String getShortDate() {
        return String.valueOf(day) + "-" + String.valueOf(month) + "-" + String.valueOf(year);
    }

    public String getLongDate() {

        String monthString;
        switch(month) {
            case 1: monthString = "January"; break;
            case 2: monthString = "February"; break;
            case 3: monthString = "March"; break;
            case 4: monthString = "April"; break;
            case 5: monthString = "May"; break;
            case 6: monthString = "June"; break;
            case 7: monthString = "July"; break;
            case 8: monthString = "August"; break;
            case 9: monthString = "September"; break;
            case 10: monthString = "October"; break;
            case 11: monthString = "November"; break;
            case 12: monthString = "December"; break;
            default: monthString = "Invalid month";
        }

        return String.valueOf(day) + " " + monthString + " " + String.valueOf(year);
    }

    //setters
    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }
}
