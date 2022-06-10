package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        //Without Generics:
        List arrayList = new ArrayList();
        arrayList.add(1024);
        arrayList.add(5555);
        arrayList.add(2048);
        arrayList.add(4048);
//        arrayList.add("Martin");// Wrong Input

        System.out.println("Without Generics:");
        arrayList.forEach(System.out::println);

        //With Generics:
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Jay");
        linkedList.add("Adams");
        linkedList.add("Lilly");
        linkedList.add("Georgia");
//        linkedList.add(9999);// Will Give Compile Time Error:

        System.out.println("With Generics:");
        linkedList.forEach(System.out::println);
    }
}
