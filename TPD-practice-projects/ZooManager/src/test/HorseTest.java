package test;

import model.Horse;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HorseTest extends AnimalTest {
    private Horse testHorse;

    @Before
    public void setup(){
        testZookeeper = new Zookeeper("testZookeeper", 30);
        testAnimal = new Horse("name", "country", 40, testZookeeper, 20.1, 10.6);
        testHorse = (Horse) testAnimal;
    }

    @Test
    public void testHorseGetters(){
        assertEquals(10.6, testHorse.getTopSpeed(), 0.1);
    }
}
