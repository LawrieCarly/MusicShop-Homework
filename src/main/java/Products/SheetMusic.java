package Products;

import Types.ProductType;

import java.util.ArrayList;

public class SheetMusic extends Accessories{

    ArrayList<Songs> songs;

    public SheetMusic(ProductType productType, String brand, String description, double priceBought, double priceSelling, int quantity) {
        super(productType, brand, description, priceBought, priceSelling, quantity);
        this.songs = new ArrayList<Songs>();
    }

    private class Songs {

        String artist;
        String songTitle;
    }
}
