package Products;

import Products.Product;
import Types.ProductType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

    Product productItem1;


    @Before
    public void setUp() {
        productItem1 = new Product(ProductType.INSTRUMENTS, "Yamaha", "Grand Piano", 3000, 5000, 5);
    }

    @Test
    public void getBrand() {
        assertEquals("Yamaha", productItem1.getBrand());
    }

    @Test
    public void getDescription() {
        assertEquals("Grand Piano", productItem1.getDescription());
    }

    @Test
    public void getPriceBought() {
        assertEquals(3000, productItem1.getPriceBought(), 0.0);
    }

    @Test
    public void getPriceSelling() {
        assertEquals(5000, productItem1.getPriceSelling(), 0.0);
    }

    @Test
    public void getQuantity() {
        assertEquals(5, productItem1.getQuantity());
    }

    @Test
    public void canGetProductType(){
        assertEquals(ProductType.INSTRUMENTS, productItem1.getProductType());
    }

    @Test
    public void CanCalculateMarkup(){
        assertEquals(2000, productItem1.calculateMarkup(productItem1), 0.0);
    }


}