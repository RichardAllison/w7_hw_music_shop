package Recordings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDTest {

    CD cd;

    @Before
    public void before() {
        cd = new CD("Title", "Artist", 12, 5, 10);
    }

    @Test
    public void hasTitle() {
        assertEquals("Title", cd.getTitle());
    }

    @Test
    public void hasArtist() {
        assertEquals("Artist", cd.getArtist());
    }

    @Test
    public void hasTracks() {
        assertEquals(12, cd.getTracks());
    }
}
