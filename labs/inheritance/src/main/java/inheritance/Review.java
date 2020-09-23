package inheritance;

public class Review {
    private String body;
    private int stars;
    private String author;
    private Business business = null;

    public Review(String body, int stars, String author) {
        this.body = body;
        this.stars = stars;
        this.author = author;
    }

    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }

    public int getStars() { return stars; }
    public void setStars(int stars) { this.stars = stars; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public Business getBusiness() { return business; }
    public void setBusiness(Business business) { this.business = business; }

    public String toString() {
        if (business != null)return String.format("%s gave %s a %d star review saying: \"%s\".",
             this.author, business.getName(), this.stars, this.body);
        else
            return "This review is not official yet.";
    }
}
