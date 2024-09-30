package observerpattern;

import java.util.ArrayList;

public class Service implements Subject {
    private ArrayList<Movie> movies;
    private ArrayList<Observer> subscribers;

    public Service() {
        movies = new ArrayList<>();
        subscribers = new ArrayList<>();
    }

    @Override
    public void attach(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void detach(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void updateAll() {
        for (Observer o : subscribers) {
            o.update();
        }
    }

    public void addMovie(Movie m) {
        movies.add(m);
        updateAll();
    }

    public void removeMovie(Movie m) {
        movies.remove(m);
        updateAll();
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }
}
