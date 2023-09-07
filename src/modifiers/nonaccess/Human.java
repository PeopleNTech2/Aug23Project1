package modifiers.nonaccess;

public class Human {

    //non-access
        //final/static/abstract

    //static property belongs to the class
    //non-static property belongs to the object
    static int age = 20;
    String name = "John";

    //a static method can use only static variables
    public static void talk(){
        System.out.println("communicate blablabla");
        age = 40;
        //cannot use non-static variables
        //name = "brooklyn";
    }

    //a non-static method can use both static & non-static variables
    public void smile(){
        System.out.println("yuupi");
        age = 30;
        name = "bronx";
    }

}
