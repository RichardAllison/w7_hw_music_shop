package Instrument.Strings;

import Instrument.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Strings violin;

    @Before
    public void before() {
        violin = new Violin(Material.WOOD, "None", 200.0, 350.50, 4);
    }

    @Test
    public void hasStrings() {
        assertEquals(4, violin.getStrings());
    }

}
