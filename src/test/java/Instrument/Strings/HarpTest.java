package Instrument.Strings;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HarpTest {
    Harp harp;

    @Before
    public void before() {
        harp = new Harp(Material.WOOD,"None", 3500, 4000, 47);
    }

    @Test
    public void canPlayHarp() {
        assertEquals("Harp noises", harp.play());
    }

}
