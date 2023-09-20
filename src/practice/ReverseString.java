package practice;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Hello";
        //olleh

        char [] array = str.toLowerCase().toCharArray();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }

//        StringBuilder sb = new StringBuilder(str.toLowerCase());
//        System.out.println(sb.reverse());

    }
}
