package Products;

import Types.ProductType;

public class Amps extends Accessories{

    int volume;

    public Amps(ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity, int volume) {
        super(productType, brand, description, priceBought, priceSelling, quantity);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
