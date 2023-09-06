package classobjectconstructor;

public class House {

    //class properties
    //variables
    String color = "white";
    int numberOfRooms = 5;
    char unit;

    //constructor: is a block of code similar to method called implicitly during the object creation
    //accessModifier non-accessModifier className(parameters){body}

    //built constructor
    House(String address) {
        System.out.println("the address is: "+address);
    }
    House(String address, String city) {
        System.out.println("the address is: "+address);
        System.out.println("the city is: "+city);
    }
    House(String address, String city, String country) {
        System.out.println("the address is: "+address);
        System.out.println("the city is: "+city);
        System.out.println("the country is: "+country);
    }
    //default constructor
    House(){

    }

    //methods
    void room(){
        System.out.println("sleep zzzzzzzzzzzz");
    }

}
