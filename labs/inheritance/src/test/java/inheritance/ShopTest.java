package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test public void testCanInstantiate() {
        String name = "Trader Joe's";
        int rating = 5;
        String price = "$$$";

        Shop TraderJoes = new Shop(name, rating, price);

        assertEquals(name, TraderJoes.getName());
        assertEquals(rating, TraderJoes.getStars(), 0);
        assertEquals(price, TraderJoes.getPrice());
        assertNotNull(TraderJoes);
    }

    @Test public void testToString() {
        String name = "Trader Joe's";
        int rating = 5;
        String price = "$$$";

        Shop TraderJoes = new Shop(name, rating, price);
        String expected = "Trader Joe's has a rating of 5 stars and is in the $$$ price category.";

        assertEquals(expected, TraderJoes.toString());
    }

    @Test public void testAddString() {
        String name = "Trader Joe's";
        int rating = 0;
        String price = "$$$";
        Shop TraderJoes = new Shop(name, rating, price);

        String author = "Bob Smith";
        int revRating = 5;
        String body = "This store is great!";
        Review review = new Review(body, revRating, author);

        TraderJoes.addReview(review);

        assertEquals(5, TraderJoes.getStars(), 0);
        assertEquals(1, TraderJoes.getReviews().size());
        assertEquals("Trader Joe's", TraderJoes.getName());
    }
}
