package collections;

import java.util.LinkedList;

public class UseLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("text1");
        list1.add("text2");
        list1.add("text3");
        list1.add("text4");
        list1.add("text5");
        System.out.println(list1);
        System.out.println(list1.get(0));

    }
}
