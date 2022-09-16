package Products;

import Types.ProductType;

public class Picks extends Accessories {

    String colour;

    public Picks(ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity, String colour) {
        super(productType, brand, description, priceBought, priceSelling, quantity);
        this.colour = colour;
    }
}
