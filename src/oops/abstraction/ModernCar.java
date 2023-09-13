package oops.abstraction;

//abstract class (hybrid interface/full-fledged class)
public abstract class ModernCar {

    String wheels;
    int mirrors = 3;

    //non-abstract method
    public void autoRadio(){
        System.out.println("turn it on and enjoy the music");
    }

    //abstract method
    public abstract void autoLock();
}
