import Instrument.*;
import Instrument.Keyboard.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    ElectricKeyboard keyboard;
    Piano piano;

    @Before
    public void before() {
        keyboard = new ElectricKeyboard(Material.PLASTIC, "Yamaha", 60, 80, 61, 120);
        piano = new Piano(Material.WOOD,"Bösendorfer", 8000, 10000, 88);
    }

    @Test
    public void pianoHasBrand() {
        assertEquals("Bösendorfer", piano.getBrand());
    }

    @Test
    public void keyboardHasVoices() {
        assertEquals(120, keyboard.getVoices());
    }

    @Test
    public void pianoHasKeys() {
        assertEquals(88,piano.getKeys());
    }

    @Test
    public void canPlayKeyboard() {
        assertEquals("Different noises", keyboard.play());
    }

    @Test
    public void canPlayPiano() {
        assertEquals("Beethoven's Moonlight Sonata", piano.play());
    }


}
