package classmethodobject;

public class Calculator {
    //class implementation

    //user defined methods
    //accessModifier non-accessModifier methodType methodName(methodParameters){MethodBody}
    //method/function: is a reusable block of code that executes only when it's called

    //non-return method
    void add(int a, int b) {
        //method implementation
        //local variable
        int total;

        total = a + b;
        System.out.println(total);
    }
    //recursive method: is a method that is calling itself
    void sub() {
        int a = 10;
        int b = 5;
        int total;

        total = a - b;
        System.out.println(total);
        //sub();
    }

    //return method
    int mul(int a, int b) {
        int total;

        total = a * b;
        System.out.println(total);
        return total;
    }

    int div() {
        int a = 10;
        int b = 5;
        int total;

        total = a / b;
        System.out.println(total);
        return total;
    }

}
