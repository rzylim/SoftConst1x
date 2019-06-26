package test;

import model.Snake;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SnakeTest extends AnimalTest {
    private Snake testSnake;

    @Before
    public void setup(){
        testZookeeper = new Zookeeper("testZookeeper", 30);
        testAnimal = new Snake("name", 40, testZookeeper, 20.1, 10.6, true);
        testSnake = (Snake) testAnimal;
    }

    @Test
    public void testHorseGetters(){
        assertEquals(10.6, testSnake.getLength(), 0.1);
        assertTrue(testSnake.isVenom());
    }
}
