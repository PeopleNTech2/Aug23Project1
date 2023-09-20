package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class UseIterator {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(0);
        list.add(57);
        list.add(4589);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
//        System.out.println(it.next());
//        System.out.println(it.hasNext());
    }
}
