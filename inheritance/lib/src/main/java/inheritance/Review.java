package inheritance;

public class Review{
    private String body;
    private String author;
    private Integer stars;
//    private Restaurant restaurant;

    public Review(String body, String author , Integer stars) {
        if (stars<=5 && stars>=0){
            this.body = body;
            this.author = author;
//            this.restaurant = restaurant;
            this.stars = stars;
        }

    }

//    public Restaurant getRestaurant() {
//        return restaurant;
//    }

    public Integer getStars() {
        return stars;
    }



    public String getBody() {
        return body;
    }


    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", stars=" + stars +
                '}';
    }
}