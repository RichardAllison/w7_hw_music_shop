package Instrument.Woodwind;

import Instrument.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindTest {

    Woodwind saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone(Material.METAL, "None", 100.0, 300.0, 1);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.METAL, saxophone.getMaterial());
    }

    @Test
    public void hasReeds() {
        assertEquals(1, saxophone.getReeds());
    }
}
