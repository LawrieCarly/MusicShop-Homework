package Products;

import Types.InstrumentType;
import Types.ProductType;

public class Piano extends Instruments{

    int keys;
    String colour;


    public Piano(ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity, InstrumentType instrumentType, int keys, String colour) {
        super(productType, brand, description, priceBought, priceSelling, quantity, instrumentType);
        this.keys = keys;
        this.colour = colour;

    }

    public int getKeys() {
        return keys;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String play(Instruments instruments) {
        return "Plunk tink Plunk tink";
    }
}
