package inheritance;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShopTest {

    @Test
    public void shopTest(){
        Shop shop=new Shop("shop","$$","llll");
        Review review1 = new Review("layana","layana1",5);

        Assertions.assertEquals("shop",shop.getName());
        Assertions.assertEquals("$$",shop.getDollarSignNum());
        Assertions.assertEquals("llll",shop.getDescription());


        shop.addReview(review1);

        Assertions.assertEquals("layana1",review1.getAuthor());
        Assertions.assertEquals("layana",review1.getBody());
        Assertions.assertEquals(5,review1.getStars());


    }

    @Test
    public void shopReviewTest(){
        Shop shop=new Shop("shop","5","10$");
        Review review = new Review("body","Layana",2);
        shop.addReview(review);

        Assertions.assertEquals("Shop{name='shop', dollarSignNum=5, description='10$', reviews=[Review{body='body', author='Layana', stars=2}]}", shop.toString());
    }

}
