import inheritance.Restaurant;
import inheritance.Review;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("jjjj","300$");
        Review reviews = new Review("ll","mmm",restaurant,4);


        System.out.println(reviews.toString());

    }
}
