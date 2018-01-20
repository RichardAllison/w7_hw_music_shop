package Instrument.Strings;

import Instrument.InstrumentKind;
import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Guitar electricGuitar;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentKind.ACOUSTIC, Material.WOOD,"None", 60, 80, 6);
        electricGuitar = new Guitar(InstrumentKind.ELECTRIC, Material.METAL,"None", 60, 80, 6);
    }

    @Test
    public void hasKind() {
        assertEquals(InstrumentKind.ELECTRIC, electricGuitar.getKind());
    }

    @Test
    public void canPlayGuitar() {
        assertEquals("Albeniz' Asturias", guitar.play());
    }

}
