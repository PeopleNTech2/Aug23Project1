package garbagecollection;

public class Number {

    int a = 1;

    public  void printNumber(){
        System.out.println("number is : "+a);
    }

    public void finalize(){
        System.out.println("object garbage is collected");
    }
}
