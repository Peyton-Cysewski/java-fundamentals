package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void testCanInstantiate() {
        String author = "Bob Smith";
        float rating = 5;
        String body = "The pizza is the best in the area!";

        Review review = new Review(body, rating, author);

        assertEquals(author, review.author);
        assertEquals(rating, review.stars);
        assertEquals(body, review.body);
        assertNotNull(review);
    }

    @Test public void testToString() {
        String author = "Bob Smith";
        int rating = 5;
        String body = "The pizza is the best in the area!";

        Review review = new Review(body, rating, author);
        String expected = "Bob Smith gave a 5 star review saying: \"The pizza is the best in the area!\".";

        assertEquals(expected, review.toString());
    }
}
