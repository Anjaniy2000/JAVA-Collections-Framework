package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRunner {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        /* these methods throw exceptions: */

        //offer(Object o):
        queue.offer("Jay");
        queue.offer("Adams");
        queue.offer("Mike");

        //peek():
        System.out.println(queue.peek());

        //poll():
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        /* these methods return false/null: */

        //add(Object o)
        queue.add("Sammy");
        queue.add("Quora");

        queue.forEach(System.out::println);

        //element():
        System.out.println(queue.element());

        //poll():
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
