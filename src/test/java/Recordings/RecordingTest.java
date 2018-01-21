package Recordings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordingTest {

    Recording recording;

    @Before
    public void before() {
        recording = new CD("Title", "Artist", 12, 5, 10);
    }

    @Test
    public void hasUnitCost() {
        assertEquals(5, recording.getUnitCost(), 0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(10,recording.getSalePrice(), 0);
    }

    @Test
    public void canChangeUnitCost() {
        recording.setUnitCost(10);
        assertEquals(10, recording.getUnitCost(),0);
    }

    @Test
    public void canChangeSalePrice() {
        recording.setSalePrice(20);
        assertEquals(20, recording.getSalePrice(),0);
    }
}
