package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ResturantTest {

    Restaurant restaurant = new Restaurant("resturent1", "5$");

    @Test
    public  void constructorTest(){
        Assertions.assertEquals("resturent1",restaurant.getName());

        Assertions.assertEquals("5$",restaurant.getPrice());
    }

    @Test
    public void toStringTest(){
        Assertions.assertEquals("Restaurant{name='resturent1', stars=0.0, price='5$', reviews=[]}",restaurant.toString());
    }


    @Test
    public void addReviewTest(){
        Restaurant restaurant = new Restaurant("Ahmad","20$");

        Review review1=new Review("big","Layana",3);

        restaurant.addReview(review1);



        Assertions.assertEquals("Layana",review1.getAuthor());
        Assertions.assertEquals("big",review1.getBody());
        Assertions.assertEquals(3,review1.getStars());

//        Assertions.assertEquals("Ahmad",review1.getRestaurant().getName());
//        Assertions.assertEquals("20$",review1.getRestaurant().getPrice());
//        Assertions.assertEquals(3,review1.getRestaurant().getStars());
    }

}
