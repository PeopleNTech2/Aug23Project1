package oops.abstraction;

//interface
public interface Car extends Example1, Example2{
    //variables are final by default
    //you cannot declare variables in interface
    int number = 5;

    //methods are public be default in interface
    //this is an abstract method
    public void start();

    public void stop();

    public void carColor();
}
