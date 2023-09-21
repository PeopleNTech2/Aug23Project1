package garbagecollection;

public class GarbageCollection {
    public static void main(String[] args) {

        Number number1 = new Number();
        Number number2 = new Number();

        number1.printNumber();

        number1 = null;
        number2 = null;

        System.gc();

    }
}
