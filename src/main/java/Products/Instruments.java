package Products;

import Behaviours.IPlay;
import Types.InstrumentType;
import Types.ProductType;

public abstract class Instruments extends Product implements IPlay{

    InstrumentType instrumentType;

    public Instruments(ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity, InstrumentType instrumentType) {
        super(productType, brand, description, priceBought, priceSelling, quantity);
        this.instrumentType = instrumentType;

    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
