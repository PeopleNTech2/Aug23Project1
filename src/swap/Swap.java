package swap;

public class Swap {
    public static void main(String[] args) {

        int a = 7;
        int b = 5;

        System.out.println("a = "+a);//10
        System.out.println("b = "+b);//20

        //swap
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+a);//20
        System.out.println("b = "+b);//10

    }
}
