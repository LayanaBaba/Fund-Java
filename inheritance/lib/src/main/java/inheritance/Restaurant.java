package inheritance;

import java.util.ArrayList;

public class Restaurant<stars> {

    private String name;
    private Integer stars;
    private String price;
    private  ArrayList <Review> reviews ;


    public Restaurant(String name, Integer stars, String price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        reviews = new ArrayList<>();
    }
    public Restaurant(String name, String price) {
        this.name = name;

        this.price = price;

    }

    public String getName() {

        return name;
    }

    public Integer getStars() {
        return stars;
    }

    public String getPrice() {
        return price;
    }

   public void addReview(Review review){

       reviews.add(review);

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
