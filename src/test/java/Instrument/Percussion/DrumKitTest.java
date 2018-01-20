package Instrument.Percussion;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumKitTest {

    DrumKit drums;

    @Before
    public void before() {
        drums = new DrumKit(Material.PLASTIC, "Yamaha", 120, 150, 5);
    }

    @Test
    public void drumKitHasParts() {
        assertEquals(5, drums.getParts());
    }

    @Test
    public void canPlayDrums() {
        assertEquals("Lots of noise", drums.play());
    }
}
