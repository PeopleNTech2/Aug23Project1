package oops.abstraction;

//full-fledged class
public class Honda implements Car{

    public void start() {
        System.out.println("keyless start");
    }

    public void stop() {
        System.out.println("assisted brake");
    }

    public void carColor() {
        System.out.println("blue and green");
    }

    public void brakeSystem(){
        System.out.println("hydraulic brakes");
    }

    public void random1() {
        System.out.println("random code");
    }

    public void random2() {
        System.out.println("random code");
    }
}
