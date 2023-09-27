package testing;

public class Test {
    //this class got replaced by JUnit library that is providing many methods and annotations
    String flag = "fail";

    public void validate(int actual, int expected) {
        if (actual == expected) {
            flag = "pass";
        }
        System.out.println(flag);
    }
}
