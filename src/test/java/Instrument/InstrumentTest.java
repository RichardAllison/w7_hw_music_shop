package Instrument;

import Instrument.Strings.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument violin;

    @Before
    public void before() {
        violin = new Violin(Material.WOOD, "None", 200.0, 350.50, 4);
    }

    @Test
    public void hasType() {
        assertEquals(InstrumentCategory.STRING, violin.getInstrumentType());
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, violin.getMaterial());
    }

    @Test
    public void hasBrand() {
        assertEquals("None", violin.getBrand());
    }

    @Test
    public void hasUnitCost() {
        assertEquals(200, violin.getUnitCost(), 0.00);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(350.5, violin.getSalePrice(), 0.00);
    }

    @Test
    public void hasMargin() {
        assertEquals(150.5, violin.calculateMargin(), 0.0);
    }

    @Test
    public void canChangeUnitCost() {
        violin.setUnitCost(250);
        assertEquals(250, violin.getUnitCost(), 0.00);
    }

    @Test
    public void canChangeSalePrice() {
        violin.setSalePrice(500);
        assertEquals(500, violin.getSalePrice(), 0.00);
    }

}
