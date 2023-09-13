package oops.abstraction;

//full-fledged class
public class Toyota extends ModernCar implements Car, Motor{

    public void start() {
        System.out.println("turn the key and start");
    }

    public void stop() {
        System.out.println("brake to stop");
    }

    public void carColor() {
        System.out.println("black & white");
    }

    public void numberOfDoors(){
        System.out.println("3 doors car");
    }

    public void autoLock() {
        System.out.println("locks after 5 seconds");
    }

    public void engine() {
        System.out.println("v8 engine");

    }

    public void random1() {
        System.out.println("random code");
    }

    public void random2() {
        System.out.println("random code");
    }
}
