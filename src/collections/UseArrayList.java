package collections;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {

        //generic list
        ArrayList list = new ArrayList();

        list.add(1);
        list.add(true);
        list.add("text");
        list.add(1.2451);
        list.add('i');
        System.out.println(list);
        System.out.println(list.size());

        //typed list
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("text1");
        list1.add("text1");
        list1.add("text1");
        list1.add("text4");
        list1.add("text5");
        System.out.println(list1);
        System.out.println(list1.get(0));

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(15);
        list2.add(0);
        list2.add(57);
        list2.add(4589);
        System.out.println(list2);
        for (int num :list2) {
            System.out.println(num);
        }
    }
}
