package queue;

import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Queue;

public class ArrayDequeRunner {
    public static void main(String[] args) {

//        Queue<Integer> arraydeque = new ArrayDeque<>();
        Deque<Integer> arraydeque = new ArrayDeque<>();

        /* these methods throw exceptions: */

        //offerFirst(Object o):
        arraydeque.offerFirst(1024);
        arraydeque.offerFirst(2048);
        arraydeque.offerFirst(9999);

        arraydeque.forEach(System.out::println);

        //peekFirst():
        System.out.println(arraydeque.peekFirst());

        //pollFirst():
        System.out.println(arraydeque.pollFirst());

        //offerLast(Object o):
        arraydeque.offerLast(3096);
        arraydeque.offerLast(4096);
        arraydeque.offerLast(5555);

        arraydeque.forEach(System.out::println);

        //peekLast():
        System.out.println(arraydeque.peekLast());

        //pollLast():
        System.out.println(arraydeque.pollLast());
        System.out.println(arraydeque.pollLast());


        /* these methods return false/null: */

        //addFirst(Object o):
        arraydeque.addFirst(1001);
        arraydeque.addFirst(2002);

        arraydeque.forEach(System.out::println);

        //getFirst():
        System.out.println(arraydeque.getFirst());

        //removeFirst():
        System.out.println(arraydeque.removeFirst());

        //addLast(Object o):
        arraydeque.addLast(8888);
        arraydeque.addLast(1111);

        arraydeque.forEach(System.out::println);

        //getLast():
        System.out.println(arraydeque.getLast());

        //removeLast():
        System.out.println(arraydeque.removeLast());

        System.out.println("-----------------------");


        /* ArrayDeque as Stack: */

        Deque<String> stack = new ArrayDeque<>();

        //push(Object o):
        stack.push("Jay");
        stack.push("Adams");
        stack.push("Mike");
        stack.push("Sammy");

        stack.forEach(System.out::println);

        //peek():
        System.out.println(stack.peek());

        //pop():
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
