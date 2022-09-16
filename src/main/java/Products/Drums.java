package Products;

import Types.InstrumentType;
import Types.ProductType;

public class Drums extends Instruments {

    int drumPads;
    int symbols;
    String colour;

    public Drums(ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity, InstrumentType instrumentType, int drumPads, int symbols, String colour) {
        super(productType, brand, description, priceBought, priceSelling, quantity, instrumentType);
        this.drumPads = drumPads;
        this.symbols = symbols;
        this.colour = colour;
    }

    public int getDrumPads() {
        return drumPads;
    }

    public int getSymbols() {
        return symbols;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String play(Instruments instruments) {
        return "Crash Bang Ding";
    }
}
