package test;

import model.Call;
import model.CellPhone;
import model.Person;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CellPhoneTest {
    private Call testCall1;
    private Call testCall2;
    private Call testCall3;
    private CellPhone testCellPhone;
    private Person testPerson;

    @Before
    public void setup(){
        testPerson = new Person("testPerson");
        testCellPhone = new CellPhone(testPerson, "testCellPhoneLocation");
        testCall1 = new Call(testCellPhone, "testCallLocation1");
        testCall2 = new Call(testCellPhone, "testCallLocation2");
        testCall3 = new Call(testCellPhone, "testCallLocation3");

        testCellPhone.addCall(testCall1);
        testCellPhone.addCall(testCall2);
    }

    @Test
    public void testAddCall(){
        assertEquals(2, testCellPhone.getCalls().size());

        testCellPhone.addCall(testCall3);
        assertEquals(3, testCellPhone.getCalls().size());
    }

    @Test
    public void testGetters(){
        assertEquals(testPerson, testCellPhone.getOwner());
        assertEquals(2, testCellPhone.getCalls().size());
        assertEquals("testCellPhoneLocation", testCellPhone.getLocation());
        assertEquals(testCellPhone, testCellPhone.getTrace());
    }
}
