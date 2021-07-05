package inheritance;

import java.util.ArrayList;

public class Theater implements AddReview {

    private ArrayList<String> movies = new ArrayList<String>();
    private ArrayList<Review> reviews=new ArrayList<>();

    private String name;

    public Theater(String name) {
        this.name = name;
    }

    public String getMovies() {
        return movies.toString();
    }

    public String getName() {
        return name;
    }

    public void addMovie(String movieName) {
       this.movies.add(movieName);
    }

    public void removeMovie(String movieName){
        this.movies.remove(movieName);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "movies=" + movies +
                ", reviews=" + reviews +
                ", name='" + name + '\'' +
                '}';
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }
}
