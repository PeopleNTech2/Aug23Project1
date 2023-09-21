package exceptiohandling;

public class Math {
    public static void main(String[] args) throws Exception{

        //runtime exception (unchecked exception)
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        try{
            System.out.println("line 4 "+ 10/0);
        }catch (ArithmeticException arithmeticException){
            System.out.println("line 4 with exception");
            arithmeticException.printStackTrace();
        }
        System.out.println("line 5");
        System.out.println("line 6");
        System.out.println("line 7");

    }
}
