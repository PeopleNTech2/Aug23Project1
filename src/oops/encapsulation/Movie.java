package oops.encapsulation;

public class Movie {

    //encapsulation is about variables: data hiding

    //global variables
    private String title;
    private String rating;

    //setter
    public void setTitle(String title){
        //title is a local variable
        //use this keyword to make reference to the global variable
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        if (rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") || rating.equals("R")){
            this.rating = rating;
        }else {
            this.rating = "Not Rated";
        }
    }

}
