import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CijfersTest {

    @Test
    void geenNegatieveCijfers() {
        Cijfers c = new Cijfers();
        assertThrows(IllegalArgumentException.class, () -> c.nummerNaarCharCijfer(-1));
    }

    @Test
    void nietHogerDanHonderd(){
        Cijfers c = new Cijfers();
        assertThrows(IllegalArgumentException.class,()->c.nummerNaarCharCijfer(101));
    }

    @Test
    void testF(){
        Cijfers c = new Cijfers();
        assertEquals('F',c.nummerNaarCharCijfer(55));
    }

    @Test
    void testD(){
        Cijfers c = new Cijfers();
        assertEquals('D',c.nummerNaarCharCijfer(65));
    }

    @Test
    void testC(){
        Cijfers c = new Cijfers();
        assertEquals('C',c.nummerNaarCharCijfer(75));
    }

    @Test
    void testB(){
        Cijfers c = new Cijfers();
        assertEquals('B',c.nummerNaarCharCijfer(85));
    }

    @Test
    void testA(){
        Cijfers c = new Cijfers();
        assertEquals('A',c.nummerNaarCharCijfer(95));
    }

}