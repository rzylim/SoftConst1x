package test;

import model.Whale;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WhaleTest extends AnimalTest {
    private Whale testWhale;

    @Before
    public void setup(){
        testZookeeper = new Zookeeper("testZookeeper", 30);
        testAnimal = new Whale("name", 40, testZookeeper, 20.1, true,10.6);
        testWhale = (Whale) testAnimal;
    }

    @Test
    public void testHorseGetters(){
        assertTrue(testWhale.isWaterType());
        assertEquals(10.6, testWhale.getMaxDiveDepth(), 0.1);
    }
}
