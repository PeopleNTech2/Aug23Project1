package oops.polymorphism;

public class Calculator {

    //polymorphism: method overloading & method overriding
    //method overloading: is when you have 2 methods having the same name but different number of parameters
    public void add(int a, int b) {
        int total = a + b;
        System.out.println(total);
    }
    public void add(int a, int b, int c) {
        int total = a + b + c;
        System.out.println(total);
    }

    //method overriding: is when you have 2 methods having the same name, the same number of parameters but different body
    //method overriding requires inheritance & overriding annotation
    public void sub(int a, int b) {
        int total = a - b;
        System.out.println(total);
    }

    //this method cannot be overridden because it's final
    public final void mul(int a, int b) {
        int total = a * b;
        System.out.println(total);
    }
}
