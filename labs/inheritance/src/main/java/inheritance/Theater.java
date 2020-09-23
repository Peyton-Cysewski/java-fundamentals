package inheritance;

import java.util.ArrayList;

public class Theater extends Business {
    private ArrayList<String> movies = new ArrayList();

    public Theater(String name, float stars) {
        super(name, stars);
    }

    public ArrayList<String> getMovies() { return movies; }
    public void addMovie(String movie) { this.movies.add(movie); }
    public void removeMovie(String movie) { this.movies.remove(movie); }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%s has a %d star rating. It is currently showing:\n", this.getName(), (int)this.getStars()));
        for (String movie : movies) {
            sb.append(String.format("%s\n", movie));
        }
        return sb.toString();
    }

}
