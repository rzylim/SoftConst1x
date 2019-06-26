package test;

import model.Carrot;
import model.Lettuce;
import model.Tomato;
import model.VegType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VegetableTest {
    private Carrot testCarrot;
    private Lettuce testLettuce;
    private Tomato testTomato;

    @Before
    public void setup(){
        testCarrot = new Carrot();
        testLettuce = new Lettuce();
        testTomato = new Tomato();
    }

    @Test
    public void testCarrotGetters(){
        assertEquals("Carrot", testCarrot.getName());
        assertEquals(VegType.ROOT, testCarrot.getType());
        assertEquals("Plant 3-5 weeks before last spring frost", testCarrot.getInstructions());
    }

    @Test
    public void testLettuceGetters(){
        assertEquals("Lettuce", testLettuce.getName());
        assertEquals(VegType.LEAF, testLettuce.getType());
        assertEquals("", testLettuce.getInstructions());
    }

    @Test
    public void testTomatoGetters(){
        assertEquals("Tomato", testTomato.getName());
        assertEquals(VegType.SEED, testTomato.getType());
        assertEquals("Start seeds indoors 6-8 weeks early", testTomato.getInstructions());
    }
}
