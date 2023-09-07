package modifiers.nonaccess;

public class TestHuman {

    public static void main(String[] args) {

        //create object in order to call the non-static properties (because they belong to the object)
        Human david = new Human();

        david.smile();
        david.name = "Sparrow";

        //use the class name to call the static properties (because they belong to the class)
        Human.talk();
        Human.age = 50;

        //why main method is static?
        //because java needs to run the method without creating an object

    }
}
