import inheritance.Restaurant;
import inheritance.Review;

public class Main {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("jjjj","30$");
        Review reviews3 = new Review("ll","mmm",4);
        Review reviews1 = new Review("ll","mmm",5);
        Review reviews2 = new Review("ll","mmm",4);

//        restaurant.addReview(reviews3);
//        restaurant.addReview(reviews1);
//        restaurant.addReview(reviews2);

        System.out.println(reviews3.toString());
        System.out.println(reviews1.toString());
        System.out.println(reviews2.toString());
        System.out.println(restaurant.toString());

    }
}
