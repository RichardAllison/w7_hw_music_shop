package Recordings;

import Instrument.Material;
import Instrument.Strings.Violin;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BoxSetTest {

    BoxSet boxSet;
    BoxSet boxSet2;
    CD cd1;
    CD cd2;

    @Before
    public void before() {
        cd1 = new CD("Disc 1", "Artist", 12, 0, 0);
        cd2 = new CD("Disc 2", "Different Artist", 10, 0, 0);
        ArrayList<CD> cds = new ArrayList<>();
        cds.add(cd1);
        cds.add(cd2);
        boxSet = new BoxSet("Compilation", cds, 14,20);
    }

    @Test
    public void hasTitle() {
        assertEquals("Compilation", boxSet.getTitle());
    }

    @Test
    public void hasContents() {
        assertEquals(2, boxSet.contentsCount());
        assertEquals(cd1, boxSet.getContents().get(0));
    }

}
