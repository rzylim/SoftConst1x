package test;

import model.Call;
import model.CellPhone;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CallTest {
    private Call testCall;
    private CellPhone testCellPhone;
    private Person testPerson;

    @Before
    public void setup(){
        testPerson = new Person("testPerson");
        testCellPhone = new CellPhone(testPerson, "testCellPhoneLocation");
        testCall = new Call(testCellPhone, "testCallLocation");
    }

    @Test
    public void testGetters(){
        assertEquals(testCellPhone, testCall.getOutgoing());
        assertEquals("testCallLocation", testCall.getLocation());
        assertEquals(testCall, testCall.getTrace());
    }
}
