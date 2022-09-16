package Products;

import Behaviours.ISell;
import Types.ProductType;

public class Product implements ISell {
    //    maybe use a stream to add Instruments.Instruments and Accessories together
    ProductType productType;
    String brand;
    String description;
    double priceBought;
    double priceSelling;
    int quantity;

    public Product (ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity) {
        this.productType = productType;
        this.brand = brand;
        this.description = description;
        this.priceBought = priceBought;
        this.priceSelling = priceSelling;
        this.quantity = quantity;
    }

    public ProductType getProductType(){
        return productType;
    }

    public String getBrand() {
        return brand;
    }

    public String getDescription() {
        return description;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSelling() {
        return priceSelling;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double calculateMarkup(Product product) {
        return (product.getPriceSelling() - product.getPriceBought());
    }
}
