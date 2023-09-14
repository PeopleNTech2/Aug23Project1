package oops.inheritance;

public class Father extends GrandFather{

    //Father is a super class to Son
    //super class is the class that is inheriting from
    //super keyword

    int height = 6;

    public Father(int height){
        this.height = height;
    }

    public void athletic(){
        System.out.println("he practices sport");
    }

    protected void hasCar(){
        System.out.println("vroom vroom");
    }

}
