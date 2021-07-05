package inheritance;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TheaterTest {

    @Test
    public void addMovieTest(){
        Theater theater = new Theater("theater");

//        theater.addMovie("Fadi");
        theater.addMovie("Layana");

        Assertions.assertEquals("[Layana]",theater.getMovies());
    }

    @Test
    public void removeMovieTest(){
        Theater theater = new Theater("theater");

        theater.addMovie("Fadi");
        theater.removeMovie("Layana");

        Assertions.assertEquals("[Fadi]",theater.getMovies());
    }

    @Test
    public void addReviewTest(){
        Theater theater = new Theater("theater");
        Review review = new Review("jjjj","kkkk",5);

        theater.addReview(review);

        Assertions.assertEquals("jjjj",review.getBody());
        Assertions.assertEquals("kkkk",review.getAuthor());
        Assertions.assertEquals(5,review.getStars());
    }
}
