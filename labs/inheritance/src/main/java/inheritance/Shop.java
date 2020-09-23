package inheritance;

import java.util.ArrayList;

public class Shop extends Business {
    private String price;

    public Shop(String name, int stars, String price) {
        super(name, stars);
        this.price = price;
    }

    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }

    public String toString() {
        return String.format("%s has a rating of %d stars and is in the %s price category.", this.getName(), (int)this.getStars(), this.price);
    }

}
