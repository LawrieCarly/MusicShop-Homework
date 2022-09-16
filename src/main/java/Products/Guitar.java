package Products;

import Types.InstrumentType;
import Types.ProductType;

public class Guitar extends Instruments {

    int strings;
    String colour;
    String sound;

    public Guitar(ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity, InstrumentType instrumentType, int strings, String colour, String sound) {
        super(productType, brand, description, priceBought, priceSelling,  quantity, instrumentType);
        this.strings = strings;
        this.colour = colour;
        this.sound = sound;
    }

    public int getStrings() {
        return strings;
    }

    public String getColour() {
        return colour;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String play(Instruments instruments) {
        return "twang strum twang";
    }
}
