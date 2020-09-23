package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class TheaterTest {
    @Test public void testCanInstantiate() {
        String name = "Bella Botega";
        int rating = 5;

        Theater BellaBotega = new Theater(name, rating);
        BellaBotega.addMovie("Tenet");
        BellaBotega.addMovie("Dunkirk");
        BellaBotega.addMovie("Interstellar");
        BellaBotega.addMovie("Inception");

        assertEquals(name, BellaBotega.getName());
        assertEquals(rating, BellaBotega.getStars(), 0);
        assertEquals("Tenet", BellaBotega.getMovies().get(0));
        assertEquals("Dunkirk", BellaBotega.getMovies().get(1));
        assertEquals("Interstellar", BellaBotega.getMovies().get(2));
        assertEquals("Inception", BellaBotega.getMovies().get(3));
        assertNotNull(BellaBotega);
    }

    @Test public void testToString() {
        String name = "Bella Botega";
        int rating = 5;

        Theater BellaBotega = new Theater(name, rating);
        BellaBotega.addMovie("Tenet");
        BellaBotega.addMovie("Dunkirk");
        BellaBotega.addMovie("Interstellar");
        BellaBotega.addMovie("Inception");
        String expected = "Bella Botega has a 5 star rating. It is currently showing:\nTenet\nDunkirk\nInterstellar\nInception\n";

        assertEquals(expected, BellaBotega.toString());
    }

    @Test public void testAddString() {
        String name = "Bella Botega";
        int rating = 0;
        String price = "$$$";
        Theater BellaBotega = new Theater(name, rating);

        String author = "Bob Smith";
        int revRating = 5;
        String body = "A confusing, mind-bending movie!";
        String movie = "Tenet";
        MovieReview review = new MovieReview(body, revRating, author, movie);

        BellaBotega.addReview(review);

        assertEquals(5, BellaBotega.getStars(), 0);
        assertEquals(1, BellaBotega.getReviews().size());
        assertEquals("Bella Botega", BellaBotega.getName());
    }

    @Test public void testAddAndRemoveMovies() {
        String name = "Bella Botega";
        int rating = 5;

        Theater BellaBotega = new Theater(name, rating);
        BellaBotega.addMovie("Tenet");
        BellaBotega.addMovie("Dunkirk");
        BellaBotega.addMovie("Interstellar");
        BellaBotega.addMovie("Inception");

        assertEquals("Tenet", BellaBotega.getMovies().get(0));
        assertEquals("Dunkirk", BellaBotega.getMovies().get(1));
        assertEquals("Interstellar", BellaBotega.getMovies().get(2));
        assertEquals("Inception", BellaBotega.getMovies().get(3));

        BellaBotega.removeMovie("Tenet");

        assertEquals("Dunkirk", BellaBotega.getMovies().get(0));
        assertEquals("Interstellar", BellaBotega.getMovies().get(1));
        assertEquals("Inception", BellaBotega.getMovies().get(2));

    }
}
