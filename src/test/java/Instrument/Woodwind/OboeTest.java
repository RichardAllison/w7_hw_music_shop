package Instrument.Woodwind;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {
    Oboe oboe;

    @Before
    public void before() {
        oboe = new Oboe(Material.WOOD, "None", 450,500,2);
    }

    @Test
    public void canPlayOboe() {
        assertEquals("Oboe noises", oboe.play());
    }
}
