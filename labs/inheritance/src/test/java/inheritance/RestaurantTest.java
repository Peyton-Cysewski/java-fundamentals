package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testCanInstantiate() {
        String name = "Zeeks Pizza";
        int rating = 5;
        String price = "$$$";

        Restaurant Zeeks = new Restaurant(name, rating, price);

        assertEquals(name, Zeeks.getName());
        assertEquals(rating, Zeeks.getStars(), 0);
        assertEquals(price, Zeeks.getPrice());
        assertNotNull(Zeeks);
    }

    @Test public void testToString() {
        String name = "Zeeks Pizza";
        int rating = 5;
        String price = "$$$";

        Restaurant Zeeks = new Restaurant(name, rating, price);
        String expected = "Zeeks Pizza has a rating of 5 stars and is in the $$$ price category.";

        assertEquals(expected, Zeeks.toString());
    }

    @Test public void testAddString() {
        String name = "Zeeks Pizza";
        int rating = 0;
        String price = "$$$";
        Restaurant Zeeks = new Restaurant(name, rating, price);

        String author = "Bob Smith";
        int revRating = 5;
        String body = "The pizza is the best in the area!";
        Review review = new Review(body, revRating, author);

        Zeeks.addReview(review);

        assertEquals(5, Zeeks.getStars(), 0);
        assertEquals(1, Zeeks.getReviews().size());
        assertEquals("Zeeks Pizza", Zeeks.getName());
    }
}
