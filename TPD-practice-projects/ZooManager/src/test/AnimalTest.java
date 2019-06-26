package test;

import model.Animal;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class AnimalTest {
    protected Animal testAnimal;
    protected Zookeeper testZookeeper;

    @Before
    public abstract void setup();

    @Test
    public void testGenericGetters(){
        assertEquals("country", testAnimal.getCountry());
        assertEquals("name", testAnimal.getName());
        assertEquals(40, testAnimal.getAge());
        assertEquals(testZookeeper, testAnimal.getCareTaker());
        assertEquals(20.1, testAnimal.getWeight(), 0.1);
    }
}
