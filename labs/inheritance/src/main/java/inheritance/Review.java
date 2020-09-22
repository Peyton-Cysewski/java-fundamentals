package inheritance;

public class Review {
    public String body;
    public int stars;
    public String author;

    public Review(String body, int stars, String author) {
        this.body = body;
        this.stars = stars;
        this.author = author;
    }

    public String toString() {
        return String.format("%s gave a %d star review saying: \"%s\".", this.author, this.stars, this.body);
    }
}
