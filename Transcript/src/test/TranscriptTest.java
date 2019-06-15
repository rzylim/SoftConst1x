package test;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TranscriptTest {
    Transcript testTranscript;

    @Before
    public void setup(){
        testTranscript = new Transcript("Student Name", 1000);
        testTranscript.addCourseAndGrade("CPSC-210", 3.5);
        testTranscript.addCourseAndGrade("ENGL-201", 4.0);
        testTranscript.addCourseAndGrade("CPSC-110", 3.0);
    }

    @Test
    public void testAddItemToTranscript(){
        assertEquals(3, testTranscript.getCourseNamesSize());
        assertEquals(3, testTranscript.getGradesSize());

        testTranscript.addCourseAndGrade("ABCD-101", 4.0);
        assertEquals(4, testTranscript.getCourseNamesSize());
        assertEquals(4, testTranscript.getGradesSize());
        assertEquals("ABCD-101: 4.0", testTranscript.getCourseAndGrade("ABCD-101"));
    }

    @Test
    public void testGetUnknownCourse(){
        assertEquals(3, testTranscript.getCourseNamesSize());
        assertEquals(3, testTranscript.getGradesSize());

        assertEquals(null, testTranscript.getCourseAndGrade("MEHH-101"));
    }

    @Test
    public void testGetGPA(){
        assertEquals(Double.valueOf(3.5), testTranscript.getGPA());
    }

    @Test
    public void testCalculateAverage(){
        List<Double> testGrades = new ArrayList<>();
        testGrades.add(4.0);
        testGrades.add(3.6);
        assertEquals(Double.valueOf(3.8), testTranscript.calculateAverage(testGrades));
    }

    @Test
    public void testGetGradeByCourse(){
        assertEquals(Double.valueOf(3.5), testTranscript.getGradeByCourse("CPSC-210"));
        assertEquals(Double.valueOf(4.0), testTranscript.getGradeByCourse("ENGL-201"));
        assertEquals(Double.valueOf(3.0), testTranscript.getGradeByCourse("CPSC-110"));
    }

    @Test
    public void testGetAverageOverSelectedCoursesNonContinuous(){
        List<String> testCourses = new ArrayList<>();
        testCourses.add("CPSC-210");
        testCourses.add("CPSC-110");

        assertEquals(Double.valueOf(3.25), testTranscript.getAverageOverSelectedCourses(testCourses));
    }
}
