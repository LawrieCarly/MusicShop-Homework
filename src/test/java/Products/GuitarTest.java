package Products;

import Types.InstrumentType;
import Types.ProductType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar guitar1;

    @Before
    public void setUp() {
        guitar1 = new Guitar(ProductType.INSTRUMENTS, "Fender", "Vintage acoustic guitar",  50, 80, 10, InstrumentType.STRING,4,"red", "acoustic");

    }

    @Test
    public void getStrings() {
        assertEquals(4, guitar1.getStrings());
    }

    @Test
    public void getColour() {
        assertEquals("red", guitar1.getColour());
    }

    @Test
    public void getSound() {
        assertEquals("acoustic", guitar1.getSound());
    }

    @Test
    public void canPlay(){
        assertEquals("twang strum twang", guitar1.play(guitar1));
    }
}