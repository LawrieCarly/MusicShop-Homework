package Products;

import Types.InstrumentType;
import Types.ProductType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrumpetTest {

    Trumpet trumpet1;

    @Before
    public void setUp() throws Exception {
        trumpet1 = new Trumpet(ProductType.INSTRUMENTS, "Bach", "Big Pocket Trumpet", 400, 600, 2, InstrumentType.BRASS, "small");
    }

    @Test
    public void getSize() {
        assertEquals("small", trumpet1.getSize());
    }
}