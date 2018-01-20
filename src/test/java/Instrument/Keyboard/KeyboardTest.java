package Instrument.Keyboard;

import Instrument.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {


    Keyboard piano;

    @Before
    public void before() {
        piano = new Piano(Material.WOOD,"Bösendorfer", 8000, 10000, 88);
    }

    @Test
    public void pianoHasBrand() {
        assertEquals("Bösendorfer", piano.getBrand());
    }

    @Test
    public void pianoHasKeys() {
        assertEquals(88,piano.getKeys());
    }


}
