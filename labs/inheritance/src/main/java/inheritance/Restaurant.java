package inheritance;

public class Restaurant {
    public String name;
    public int stars;
    public String price;

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String toString() {
        return String.format("%s has a rating of %d stars and is in the %s price category.", this.name, this.stars, this.price);
    }
}
