package test;

import model.Coin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class CoinTest {
    Coin testCoin;

    @Before
    public void setup() {
        testCoin = new Coin();
    }

    @Test
    public void test100Times() {
        int changes = 0;
        testCoin.flip();
        Boolean lastStatus = testCoin.checkStatus();
        for(int i = 0; i < 100; i++) {
            testCoin.flip();
            if (testCoin.checkStatus() != lastStatus) {
                changes++;
                lastStatus = !lastStatus;
            }
        }
        assertFalse(0 == changes);
    }
}
