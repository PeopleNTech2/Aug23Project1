package testing;

import org.junit.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        //unit testing
        Calculator cal = new Calculator();
        Test test = new Test();

        //test add
        //test data: num1 = 10, num2 = 20
        //expected: 30
        int actualAdd = cal.add(10, 20);
        Assert.assertEquals(30, actualAdd);
        System.out.println("pass");
        //test.validate(actualAdd, 30);

        //test sub
        //test data: num1 = 10, num2 = 20
        //expected: -10
        int actualSub = cal.sub(10, 20);
        Assert.assertEquals(-10, actualSub);
        System.out.println("pass");
        //est.validate(actualSub, -10);
    }
}
