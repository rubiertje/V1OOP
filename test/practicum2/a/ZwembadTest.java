package practicum2.a;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    public void testBerekendInhoud(){
        Zwembad z = new Zwembad(1.0, 2.0, 1.0);
        assertEquals(2, z.inhoud());
    }

    @Test
    public void testToString(){
        Zwembad z = new Zwembad(1.0, 2.0, 1.0);
        assertEquals("Dit zwembad is 1.0 meter breed, 2.0 meter lang, en 1.0 meter diep", z.toString());
    }

}