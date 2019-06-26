package test;

import model.LowVolumeIntegerSet;
import org.junit.Before;

public class LowVolumeIntegerSetTest extends IntegerSetTest {

    // NOTE: this project accompanies the Abstract IntegerSetTest video

    @Before
    public void setup(){
        testSet = new LowVolumeIntegerSet();
    }
}
