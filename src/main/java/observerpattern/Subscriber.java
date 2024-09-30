package observerpattern;

import java.util.ArrayList;

public class Subscriber implements Observer {
    private Service service;
    private ArrayList<Movie> movies;

    public Subscriber (Service s) {
        this.service = s;
        this.movies = new ArrayList<>();
    }

    @Override
    public void update() {
        if (service != null) {
            movies = service.getMovies();
            for (Movie m : movies) {
                System.out.println(m.toString());
            }
        }
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
