import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XOTest {

    @Test
    void getXOEmptyString() {
        assertTrue(XO.getXO(""));
    }
    @Test
    void getXOTrueResults() {
        assertTrue(XO.getXO("xxoo"));
        assertTrue(XO.getXO("xaxsojogoopxlipiux"));
        assertTrue(XO.getXO("xqwxerotyo"));
        assertTrue(XO.getXO("xasasasasao"));
    }
    @Test
    void getXOFalseResults() {
        assertFalse(XO.getXO("xxooppllo"));
        assertFalse(XO.getXO("xxxxxxxxx"));
        assertFalse(XO.getXO("ooooooooo"));
        assertFalse(XO.getXO("cdfvcxoojjh"));
    }
}