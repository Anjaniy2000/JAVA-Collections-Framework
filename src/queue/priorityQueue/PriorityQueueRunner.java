package queue.priorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueRunner {
    public static void main(String[] args) {

        Queue<String> priorityqueue = new PriorityQueue<>();

        /* these methods throw exceptions: */

        //offer(Object o):
        priorityqueue.offer("Jay");
        priorityqueue.offer("Adams");
        priorityqueue.offer("Mike");

        //peek():
        System.out.println(priorityqueue.peek());

        //poll():
        System.out.println(priorityqueue.poll());
        System.out.println(priorityqueue.poll());

        /* these methods return false/null: */

        //add(Object o)
        priorityqueue.add("Sammy");
        priorityqueue.add("Quora");

        priorityqueue.forEach(System.out::println);

        //element():
        System.out.println(priorityqueue.element());

        //poll():
        System.out.println(priorityqueue.remove());
        System.out.println(priorityqueue.remove());
    }
}
