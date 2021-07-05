package inheritance;

import java.util.ArrayList;

public class Shop implements AddReview{
    private String name;
    private String dollarSignNum;
    private String description;
    private ArrayList<Review> reviews;

    public Shop(String name, String dollarSignNum, String description) {
        this.name = name;
        this.dollarSignNum = dollarSignNum;
        this.description = description;
        reviews = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDollarSignNum() {
        return dollarSignNum;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    @Override
    public void addReview(Review review){
        reviews.add(review);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", dollarSignNum=" + dollarSignNum +
                ", description='" + description + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
