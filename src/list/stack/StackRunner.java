package list.stack;

import java.util.Stack;

public class StackRunner {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        //push(Object o):
        stack.push("Jay");
        stack.push("Adams");
        stack.push("Sammy");
        stack.push("Robert");
        stack.push("Quora");

        stack.forEach(System.out::println);
        System.out.println(stack.size());

        //peek():
        System.out.println(stack.peek());

        //pop():
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.forEach(System.out::println);
        System.out.println(stack.size());

        //search(Object o):
        System.out.println(stack.search("Adams"));

        //empty():
        System.out.println(stack.empty());


    }
}
