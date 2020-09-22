package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void testCanInstantiate() {
        String name = "Zeeks Pizza";
        int rating = 5;
        String price = "$$$";

        Restaurant Zeeks = new Restaurant(name, rating, price);

        assertEquals(name, Zeeks.name);
        assertEquals(rating, Zeeks.stars);
        assertEquals(price, Zeeks.price);
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
}
