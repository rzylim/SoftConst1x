package test;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person testPerson;
    private Fingerprint testFingerprint;

    @Before
    public void setup(){
        testPerson = new Person("TestPerson");
        testFingerprint = new Fingerprint(testPerson, "TestLocation");
    }

    @Test
    public void testSetFingerprint() {
        assertEquals(null, testPerson.getFingerprint());

        testPerson.setFingerprint(testFingerprint);
        assertEquals(testFingerprint, testPerson.getFingerprint());
    }

    @Test
    public void testGetters(){
        testPerson.setFingerprint(testFingerprint);
        assertEquals("TestPerson", testPerson.getName());
        assertEquals(testFingerprint, testPerson.getFingerprint());
    }

}
