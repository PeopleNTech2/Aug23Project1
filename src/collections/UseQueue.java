package collections;

import java.util.PriorityQueue;

public class UseQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(7);
        queue.add(0);
        queue.add(9);
        queue.add(4);
        queue.add(3);

        System.out.println(queue);
    }
}
