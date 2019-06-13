package model;

public class Transcript {

    private String studentName;
    private int studentID;

    public Transcript (String studentName, int studentID) { }

    //getters
    public String getStudentName() { return this.studentName; }
    public int getStudentID() { return this.studentID; }

    //setters
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setStudentID(int studentID) { this.studentID = studentID; }

    //REQUIRES: grade must be between 0 and 4. course should not be null.
    //MODIFIES: this
    //EFFECTS:  Adds the course and the student's grade to the student's transcript.
    public void addGrade(String course, double grade){ }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS:  Returns the course name and grade in Course - Grade format.
    // This method should return course name and grade in some consistent String format
    public String getCourseAndGrade(String course){ return null; }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS:  Show student's transcript.
    public void printTranscript(){ }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS:  Calculate student's GPA based on his transcript and return it.
    public double getGPA(){ return 0.0; }
}

