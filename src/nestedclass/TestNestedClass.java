package nestedclass;

public class TestNestedClass {
    public static void main(String[] args) {

        Outer outer = new Outer();

        outer.outerNum = 10;
        outer.outerMethod();
        outer.inner.interNum = 10;
        //in order to access Inner class properties, we first create an Inner class object in outer class then use it to access Inner class properties
        outer.inner.innerMethod();

        //we cannot create object of inner class
        //Inner inner = new Inner();

    }
}
