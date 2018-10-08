import org.junit.*;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkingLowersVolume(){
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyZerosVolume(){
        assertEquals(0, waterBottle.empty());
    }

    @Test
    public void refillReturnsVolumeToMax(){
        assertEquals(100, waterBottle.refill());
    }
}
