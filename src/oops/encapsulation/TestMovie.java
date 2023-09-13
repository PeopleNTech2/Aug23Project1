package oops.encapsulation;

public class TestMovie {
    public static void main(String[] args) {

        Movie titanic = new Movie();

        titanic.setTitle("titanic");

        System.out.println(titanic.getTitle());

        //titanic.rating = "PG";

        titanic.setRating("dog");
        System.out.println(titanic.getRating());

    }
}
