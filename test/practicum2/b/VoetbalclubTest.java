package practicum2.b;

import org.junit.jupiter.api.Test;
import practicum2.a.Zwembad;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    @Test
    public void testClubnaam(){
        Voetbalclub test1 = new Voetbalclub("");
        Voetbalclub test2 = new Voetbalclub(null);
        assertEquals("FC", test1.getNaam());
        assertEquals("FC", test2.getNaam());
    }
    @Test
    public void testResultaat(){
        Voetbalclub test1 = new Voetbalclub("test");
        test1.verwerkResultaat('w');
        test1.verwerkResultaat('g');
        test1.verwerkResultaat('v');
        test1.verwerkResultaat('4');
        assertEquals(4, test1.aantalPunten());
        assertEquals(3, test1.aantalGespeeld());
    }
    @Test
    public void testToString() {
        Voetbalclub test1 = new Voetbalclub("test");
        test1.verwerkResultaat('w');
        test1.verwerkResultaat('g');
        test1.verwerkResultaat('v');
        assertEquals("test 3 1 1 1 4", test1.toString());
    }
    @Test
    public void testOptelling(){
        Voetbalclub test1 = new Voetbalclub("test");
        test1.verwerkResultaat('w');
        test1.verwerkResultaat('w');
        test1.verwerkResultaat('w');
        test1.verwerkResultaat('w');
        assertEquals(12, test1.aantalPunten());
        assertEquals(4, test1.aantalGespeeld());

    }
}