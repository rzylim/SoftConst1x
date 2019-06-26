package test;

import model.Elephant;
import model.Zookeeper;
import org.junit.Before;

public class ElephantTest extends AnimalTest {

    @Before
    public void setup() {
        testZookeeper = new Zookeeper("testZookeeper", 30);
        testAnimal = new Elephant("name", "country", 40, testZookeeper, 20.1);
    }
}
