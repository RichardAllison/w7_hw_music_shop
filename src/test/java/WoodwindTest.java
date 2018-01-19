import Instrument.*;
import Instrument.Woodwind.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindTest {

    Saxophone saxophone;
    Bassoon bassoon;
    Clarinet clarinet;
    Flute flute;
    Oboe oboe;

    @Before
    public void before() {
        saxophone = new Saxophone(Material.BRASS, "None", 100.0, 300.0, 1);
        bassoon = new Bassoon(Material.WOOD, "None", 300,500, 2);
        clarinet = new Clarinet(Material.WOOD, "None", 400, 550, 1);
        flute = new Flute(Material.METAL, "None",50, 100, 0);
        oboe = new Oboe(Material.WOOD, "None", 450,500,2);
    }

    @Test
    public void canPlaySaxophone() {
        assertEquals("Saxophone noises", saxophone.play());
    }

    @Test
    public void canPlayBassoon() {
        assertEquals("Bassoon noises", bassoon.play());
    }

    @Test
    public void canPlayClarinet() {
        assertEquals("Clarinet noises", clarinet.play());
    }

    @Test
    public void canPlayFlute() {
        assertEquals("Flute noises", flute.play());
    }

    @Test
    public void canPlayOboe() {
        assertEquals("Oboe noises", oboe.play());
    }
}
