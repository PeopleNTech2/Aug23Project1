package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class UseHashSet {
    public static void main(String[] args) {

        //HashSet does not keep the order of the elements
        //takes natural ordering
        //don't accept duplication
        HashSet<String> list1 = new HashSet<>();
        list1.add("jack");
        list1.add("john");
        list1.add("brad");
        list1.add("david");
        list1.add("jack");
        System.out.println(list1);

        HashSet<Integer> list3 = new HashSet<>();
        list3.add(9);
        list3.add(5);
        list3.add(0);
        list3.add(6);
        list3.add(0);
        System.out.println(list3);

        //LinkedHashSet
        //keep the entering order
        LinkedHashSet<String> list2 = new LinkedHashSet<>();
        list2.add("text5");
        list2.add("text1");
        list2.add("text2");
        list2.add("text3");
        list2.add("text4");
        System.out.println(list2);

        //treeSet sorts the element alphabetically
        TreeSet<String> set = new TreeSet<>();
        set.add("jack");
        set.add("brad");
        set.add("john");
        set.add("dave");
        set.add("jack");
        System.out.println(set);

    }
}
