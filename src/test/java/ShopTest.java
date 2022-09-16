import Products.*;
import Types.InstrumentType;
import Types.ProductType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Trumpet trumpet;
    Guitar guitar;
    Amps amps;
    Picks picks;

    Product product;

    @Before
    public void setUp() {
        trumpet = new Trumpet(ProductType.INSTRUMENTS, "yamaha", "trumpet", 400, 500, 2, InstrumentType.BRASS, "small");
        guitar= new Guitar(ProductType.INSTRUMENTS, "les Paul", "guitar", 40, 80, 3, InstrumentType.STRING, 4, "black", "electric");
        amps = new Amps(ProductType.ACCESSORIES, "Marshall", "2525C", 100, 200, 1, 300);
        picks = new Picks(ProductType.ACCESSORIES, "Dunlop", "large", 0.50, 1, 30, "red");
        product = new Product(ProductType.INSTRUMENTS, "yamaha", "grand piano", 200, 500, 2);
        shop = new Shop("Ricks Music Shop");
    }

    @Test
    public void addInstrument() {
        shop.addProducts(trumpet);
        assertEquals(2, shop.getNumberOfInstruments());
    }

    @Test
    public void addAccessories() {
        shop.addProducts(picks);
        assertEquals(1, shop.getNumberOfAccessories());
    }

    @Test
    public void removeInstruments() {
        shop.addProducts(trumpet);
        shop.addProducts(guitar);
        shop.removeProducts(guitar);
        assertEquals(1, shop.getNumberOfInstruments());
    }

    @Test
    public void removeAccessories() {
        shop.addProducts(picks);
        shop.addProducts(amps);
        shop.removeProducts(amps);
        assertEquals(1, shop.getNumberOfAccessories());
    }

    @Test
    public void addsToAllLists(){
        shop.addProducts(trumpet);
        shop.addProducts(guitar);
        shop.addProducts(picks);
        shop.addProducts(amps);
        assertEquals(4, shop.getNumberOfProducts());
        assertEquals(2, shop.getNumberOfInstruments());
        assertEquals(2, shop.getNumberOfAccessories());
    }

    @Test
    public void getTotalMarkup(){
        shop.addProducts(trumpet);
        shop.addProducts(guitar);
        shop.addProducts(picks);
        shop.addProducts(amps);
        assertEquals(435, shop.totalMarkup(), 0.0);
    }
}