package oops.abstraction;

public class TestCar {
    public static void main(String[] args) {

        Car corolla = new Toyota();
        corolla.start();
        corolla.stop();
        corolla.carColor();
        corolla.random1();
        corolla.random2();

        Toyota camry = new Toyota();
        camry.engine();
        camry.numberOfDoors();
        camry.start();
        camry.stop();
        camry.autoLock();
        camry.random1();
        camry.random2();
        camry.autoRadio();

        Honda civic = new Honda();

        Honda accord = new Honda();

        //cannot create an object of interfaces & abstract classes
        //Car car = new Car();
        //ModernCar modernCar = new ModernCar();

    }
}
