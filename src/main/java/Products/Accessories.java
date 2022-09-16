package Products;

import Types.ProductType;

public abstract class Accessories extends Product {


    public Accessories(ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity) {
        super(productType, brand, description, priceBought, priceSelling, quantity);
    }


}
