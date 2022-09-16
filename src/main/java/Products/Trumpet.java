package Products;

import Types.InstrumentType;
import Types.ProductType;

public class Trumpet extends Instruments {

    String size;


    public Trumpet(ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity, InstrumentType instrumentType, String size) {
        super(productType, brand, description, priceBought, priceSelling, quantity, instrumentType);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String play(Instruments instruments) {
        return "Toot toot toot";
    }
}
