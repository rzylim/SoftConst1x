package test;

import model.Fingerprint;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FingerprintTest {
    private Person testPerson;
    private Fingerprint testFingerprint;

    @Before
    public void setup() {
        testPerson = new Person("TestPerson");
        testFingerprint = new Fingerprint(testPerson, "TestLocation");
    }

    @Test
    public void testGetters(){
        assertEquals(testPerson, testFingerprint.getOwner());
        assertEquals("TestLocation", testFingerprint.getLocation());
        assertEquals(testFingerprint, testFingerprint.getTrace());
    }
}
