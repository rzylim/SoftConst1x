package ui;

import model.Transcript;

public class Main {
    public static void main(String[] args){
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        Transcript t3 = new Transcript( "Alan Turing", 0612);

        t1.addCourseAndGrade("CPSC-210", 3.5);
        t1.addCourseAndGrade("ENGL-201", 4.0);
        t1.addCourseAndGrade("CPSC-110", 3.1);

        t2.addCourseAndGrade("CPSC-310", 3.4);
        t2.addCourseAndGrade("ENGL-301", 3.9);
        t2.addCourseAndGrade("CPSC-210", 3.0);

        t3.addCourseAndGrade("CPSC-410", 4.0);
        t3.addCourseAndGrade("ENGL-401", 4.0);
        t3.addCourseAndGrade("CPSC-310", 4.0);

        System.out.print(t1.getStudentName() + ": ");
        t1.printTranscript();

        System.out.println("GPA: " + t1.getGPA().toString());

        t1.setStudentName("John Doe");

    }
}
