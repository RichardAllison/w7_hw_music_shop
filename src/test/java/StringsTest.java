import Instrument.*;
import Instrument.Strings.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Violin violin;
    Viola viola;
    Cello cello;
    Bass bass;
    Guitar guitar;
    Harp harp;

    @Before
    public void before() {
        violin = new Violin(Material.WOOD, "None", 200.0, 350.50, 4);
        viola = new Viola(Material.WOOD,"None", 100, 150, 4);
        cello = new Cello(Material.WOOD,"None", 400, 600, 4);
        bass = new Bass(Material.WOOD,"None", 800, 1000, 5);
        guitar = new Guitar(Material.WOOD,"None", 60, 80, 6);
        harp = new Harp(Material.WOOD,"None", 3500, 4000, 47);
    }

    @Test
    public void canPlayViolin() {
        assertEquals("Mendelssohn's Violin Concerto", violin.play());
    }
    @Test
    public void canPlayViola() {
        assertEquals("Viola noises", viola.play());
    }
    @Test
    public void canPlayCello() {
        assertEquals("Cello noises", cello.play());
    }
    @Test
    public void canPlayBass() {
        assertEquals("Bass noises", bass.play());
    }
    @Test
    public void canPlayGuitar() {
        assertEquals("Albeniz' Asturias", guitar.play());
    }
    @Test
    public void canPlayHarp() {
        assertEquals("Harp noises", harp.play());
    }

}
