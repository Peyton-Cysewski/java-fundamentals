package inheritance;

import java.util.ArrayList;

public class Business implements Reviewable {
    private String name;
    private float stars;
    private ArrayList<Review> reviews = new ArrayList();

    public Business(String name, float stars) {
        this.name = name;
        this.stars = stars;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public float getStars() { return stars; }
    public void setStars(float stars) { this.stars = stars; }

    public ArrayList<Review> getReviews() { return reviews; }
    public void setReviews(ArrayList<Review> reviews) { this.reviews = reviews; }

    public String toString() {
        return String.format("%s has a %d star rating.", this.name, this.stars);
    }

    @Override
    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            review.setBusiness(this);
            reviews.add(review);

            float starTotal = 0;
            for (Review rev : reviews) {
                starTotal += rev.getStars();
            }
            this.setStars(starTotal / reviews.size());
        }
    }

}
