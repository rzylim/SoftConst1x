package test;

import model.Animal;
import model.Whale;
import model.Zookeeper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZookeeperTest {
    private Zookeeper testZookeeper;
    private Animal testAnimal;

    @Before
    public void setup(){
        testZookeeper = new Zookeeper("testZookeeper", 30);
        testAnimal = new Whale("Whale", 20, testZookeeper, 100, true, 305.2);
    }

    @Test
    public void testSetters(){
        assertEquals(0, testZookeeper.getAnimalList().size());
        assertEquals(null, testZookeeper.getFavourite());

        useSetters();
        assertEquals(1, testZookeeper.getAnimalList().size());
        assertEquals(testAnimal, testZookeeper.getFavourite());
    }

    @Test
    public void testGetters(){
        useSetters();
        assertEquals("testZookeeper", testZookeeper.getName());
        assertEquals(30, testZookeeper.getAge());
        assertEquals(1, testZookeeper.getAnimalList().size());
        assertEquals(testAnimal, testZookeeper.getFavourite());
    }

    private void useSetters(){
        testZookeeper.addToList(testAnimal);
        testZookeeper.setFavourite(testAnimal);
    }
}
