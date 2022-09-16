package Products;

import Types.InstrumentType;
import Types.ProductType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumsTest {

    Drums drum;

    @Before
    public void setUp() {
        drum = new Drums(ProductType.INSTRUMENTS, "yamaha", "5 piece drum kit ", 300, 600, 2, InstrumentType.PERCUSSION, 4, 1, "green");

    }
}