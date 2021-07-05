package inheritance;

import java.util.ArrayList;

public class Restaurant implements AddReview {

    private String name;
    private double stars;
    private String price;
    private  ArrayList <Review> reviews ;


    public Restaurant(String name, String price) {
        this.name = name;
        stars = 0;
        this.price = price;
        reviews = new ArrayList<>();
    }


    public String getName() {

        return name;
    }

    public Double getStars() {
        return stars;
    }

    public String getPrice() {
        return price;
    }


    public void addReview(Review review){
        int sum=0;

        reviews.add(review);

        for (Review review1:reviews
             ) {
            sum+=review1.getStars();
        }
      stars=sum/ reviews.size();
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price='" + price + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}