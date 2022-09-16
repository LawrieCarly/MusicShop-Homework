import Products.*;
import Types.InstrumentType;
import Types.ProductType;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Product> instruments;
    private ArrayList<Product> accessories;

    private ArrayList<Product> totalProducts;

    public Shop(String name) {
        this.name = name;
        this.instruments = new ArrayList<Product>();
        this.accessories = new ArrayList<Product>();
        this.totalProducts = new ArrayList<Product>();
    }

    public int getNumberOfInstruments(){
       return this.instruments.size();
    }

    public int getNumberOfAccessories(){
        return this.accessories.size();
    }

    public int getNumberOfProducts(){
        return this.totalProducts.size();
    }

    public void addProducts (Product product){
        this.totalProducts.add(product);

        if((product) instanceof Instruments){
            this.instruments.add((Instruments) product);
        }
        if((product) instanceof Accessories){
            this.accessories.add((Accessories) product);
        }
    }

    public void removeProducts(Product product){
        if(product.getProductType() == ProductType.INSTRUMENTS){
            this.instruments.remove(product);
        }
        if(product.getProductType() == ProductType.ACCESSORIES){
            this.accessories.remove(product);
        }
    }

    public double totalMarkup() {
        double totalMarkup = 0.0;
        for (Product product : this.totalProducts) {
            totalMarkup += product.calculateMarkup(product) * product.getQuantity();
        }
        return totalMarkup;
    }
}
