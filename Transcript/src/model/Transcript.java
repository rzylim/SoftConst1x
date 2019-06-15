package model;

import java.util.ArrayList;
import java.util.List;

/**
 * INVARIANT: course list and grade list are the same size
 * each course has a grade associated, and vice versa, at matching indices
 */
public class Transcript {

    private String studentName;
    private int studentID;
    private List<String> courseNames;
    private List<Double> grades;

    public Transcript(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        courseNames = new ArrayList<>();
        grades = new ArrayList<>();
    }

    //getters
    public String getStudentName() {
        return this.studentName;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public int getCourseNamesSize() {
        return courseNames.size();
    }

    public int getGradesSize() {
        return grades.size();
    }

    //setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    //REQUIRES: grade must be between 0 and 4. course should not be null.
    //MODIFIES: this
    //EFFECTS:  Adds the course and the student's grade to the student's transcript.
    public void addCourseAndGrade(String course, double grade) {
        courseNames.add(course);
        grades.add(grade);
    }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS:  Returns the course name and grade in Course: Grade format.
    // This method should return course name and grade in some consistent String format
    public String getCourseAndGrade(String course) {
        int ind = courseNames.indexOf(course);
        if (ind != -1) {
            return course + ": " + (grades.get(ind)).toString();
        } else {
            return null;
        }
    }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS:  Show student's transcript.
    public void printTranscript() {
        String acc = "";
        for (int i = 0; i < courseNames.size(); i++) {
            acc += courseNames.get(i) + ": " + grades.get(i).toString() + ", ";
        }
        //acc += "\nGPA: " + getGPA().toString();
        System.out.println(acc);
    }

    //REQUIRES: nothing
    //MODIFIES: nothing
    //EFFECTS:  Calculate student's GPA based on his transcript and return it.
    public Double getGPA() {
        return calculateAverage(grades);
    }

    //REQUIRES: List provided is not empty.
    //EFFECT: Returns average of the grades provided.
    public Double calculateAverage(List<Double> selectedGrades){
        Double sum = 0.0;
        for(Double grade : selectedGrades){
            sum += grade;
        }
        return sum / selectedGrades.size();
    }

    //EFFECTS: Returns grade for the given course.
    public Double getGradeByCourse(String course) {
        int ind = courseNames.indexOf(course);
        if (ind != -1) {
            return grades.get(ind);
        } else {
            return null;
        }
    }

    public Double getAverageOverSelectedCourses(List<String> selectedCourses){
        List<Double> selectedGrades = new ArrayList<>();
        for(String course : selectedCourses){
            int ind = courseNames.indexOf(course);
            if(ind != -1){
                selectedGrades.add(grades.get(ind));
            }
        }
        return calculateAverage(selectedGrades);
    }
}

