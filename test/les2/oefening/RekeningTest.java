package les2.oefening;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RekeningTest {

    private Rekening r;

    @BeforeEach
    public void createRekening(){
        this.r = new Rekening(23423, 0.00);
    }

    @Test
    public void stort() {
        r.stort(0);
        assertEquals(0, r.getSaldo());
    }
    @Test
    public void negatiefRekeningnummer(){
        assertTrue(r.getNummer()>0);
    }
}