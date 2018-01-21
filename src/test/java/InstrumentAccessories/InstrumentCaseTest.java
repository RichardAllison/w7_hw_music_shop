package InstrumentAccessories;

import Instrument.*;
import Instrument.Strings.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentCaseTest {

    InstrumentCase<Violin> instrumentCase;
    Violin violin;

    @Before
    public void before() {
        instrumentCase = new InstrumentCase<>("Violin case", 40, 60);
        violin = new Violin(Material.WOOD, "None", 200.0, 350.50, 4);
    }

    @Test
    public void canPutInstrumentInCase() {
        instrumentCase.addInstrument(violin);
        assertEquals(violin, instrumentCase.getInstrument());
    }

    @Test
    public void canChangeUnitCost() {
        instrumentCase.setUnitCost(70);
        assertEquals(70, instrumentCase.getUnitCost(),0);
    }

    @Test
    public void canChangeSalePrice() {
        instrumentCase.setSalePrice(100);
        assertEquals(100, instrumentCase.getSalePrice(),0);
    }
}
