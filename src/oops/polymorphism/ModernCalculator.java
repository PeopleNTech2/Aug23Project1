package oops.polymorphism;

public class ModernCalculator extends Calculator{

    @Override
    public void sub(int a, int b) {
        int total = (a - b) / 2;
        System.out.println(total);
    }
}
