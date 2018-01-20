package Instrument.Keyboard;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricKeyboardTest {

    ElectricKeyboard keyboard;

    @Before
    public void before() {
        keyboard = new ElectricKeyboard(Material.PLASTIC, "Yamaha", 60, 80, 61, 120);
    }

    @Test
    public void keyboardHasVoices() {
        assertEquals(120, keyboard.getVoices());
    }

    @Test
    public void canPlayKeyboard() {
        assertEquals("Different noises", keyboard.play());
    }

}
