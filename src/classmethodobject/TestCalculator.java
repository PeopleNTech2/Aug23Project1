package classmethodobject;

public class TestCalculator {//runnable class

    public static void main(String[] args) {//main method

        //create object: instance of a class
        //className objectName = new className()
        Calculator cal = new Calculator();

        cal.add(20, 10);
        cal.sub();
        //non-return method cannot be assigned
        //int num3 = cal.add();
        //non-return method cannot be printed
        //System.out.println(cal.sub());

        int num1 = cal.mul(50, 6);
        //return method can be assigned
        System.out.println(num1);
        //return method can be printed
        System.out.println(cal.div());
        cal.add(154, 9816);

    }
}
