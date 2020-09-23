package inheritance;

public class MovieReview extends Review {
    private String movie;

    public MovieReview(String body, int stars, String author, String movie) {
        super(body, stars, author);
        this.movie = movie;
    }

}