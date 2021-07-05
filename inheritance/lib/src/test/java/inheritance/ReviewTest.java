package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReviewTest {
    Restaurant restaurant = new Restaurant("resturent1", "5$");
    Review review = new Review("big", "Layana",3);

    @Test
    public  void constructorTest(){
        Assertions.assertEquals("big",review.getBody());
        Assertions.assertEquals(3,review.getStars());
        Assertions.assertEquals("Layana",review.getAuthor());
    }

    @Test
    public void toStringTest(){
        Assertions.assertEquals("Review{body='big', author='Layana', stars=3, restaurant=Restaurant{name='resturent1', stars=0.0, price='5$', reviews=[]}}",review.toString());


    }

}

