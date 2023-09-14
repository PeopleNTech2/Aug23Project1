package nestedclass;

//outer class
public class Outer {
    //nested class: is a class within another class

    int outerNum = 5;

    public Outer(){

    }

    public void outerMethod(){
        System.out.println("this is outer class");
    }

    //Inner class object
    Inner inner = new Inner();

    //inner class
    //Note: private, protected & static are applicable for nested class
    public class Inner{
        int interNum = 5;

        public Inner(){

        }

        public void innerMethod(){
            System.out.println("this inner class");
        }
    }
}
