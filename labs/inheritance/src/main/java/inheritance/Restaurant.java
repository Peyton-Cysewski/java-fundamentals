package inheritance;

import java.util.ArrayList;

public class Restaurant {
    public String name;
    public int stars;
    public String price;
    public ArrayList<Review> reviews = new ArrayList();

    public Restaurant(String name, int stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public String toString() {
        return String.format("%s has a rating of %d stars and is in the %s price category.", this.name, this.stars, this.price);
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            reviews.add(review);
            int starTotal = 0;
            for (Review rev : reviews) {
                starTotal += rev.stars;
                rev.name = this.name;
                rev.price = this.price;
            }
            this.stars = starTotal / reviews.size();
        }
    }
}
