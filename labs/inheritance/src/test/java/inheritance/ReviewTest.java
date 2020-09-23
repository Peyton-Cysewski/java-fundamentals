package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void testCanInstantiate() {
        String author = "Bob Smith";
        int rating = 5;
        String body = "The pizza is the best in the area!";

        Review review = new Review(body, rating, author);

        assertEquals(author, review.getAuthor());
        assertEquals(rating, review.getStars());
        assertEquals(body, review.getBody());
        assertNotNull(review);
    }

    @Test public void testToString() {
        String author = "Bob Smith";
        int rating = 5;
        String body = "The pizza is the best in the area!";

        Review review = new Review(body, rating, author);
        String expected = "This review is not official yet.";
        assertEquals(expected, review.toString());

        String expected2 = "Bob Smith gave Trader Joe's a 5 star review saying: \"The pizza is the best in the area!\".";
        Shop traderJoes = new Shop("Trader Joe's", 0, "$$$");
        traderJoes.addReview(review);
        assertEquals(expected2, review.toString());
    }
}
