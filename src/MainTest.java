import org.junit.jupiter.api.Test;

import java.util.BitSet;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void greetLength() {
        assertEquals(11, Main.greetLength());
    }


//    @Test
//    void greeting() {
//        assert name.length() == 11 : "Length of greeting is too long!";
//        assertTrue(8 <= len && len <= 15);
//    }


}