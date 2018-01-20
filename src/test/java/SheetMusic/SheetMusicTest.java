package SheetMusic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Three Sonatas and Three Partitas for Solo Violin", "J.S. Bach", "Bärenreiter Urtext", 60, 7,14);
    }

    @Test
    public void hasName() {
        assertEquals("Three Sonatas and Three Partitas for Solo Violin", sheetMusic.getName());
    }

    @Test
    public void hasComposer() {
        assertEquals("J.S. Bach", sheetMusic.getComposer());
    }

}
