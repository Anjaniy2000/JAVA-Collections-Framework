package arraylist;

import arraylist.implementation.ArrayList;

import java.util.PriorityQueue;

public class MainClass {
    public static void main(String[] args) throws Exception {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(1024);
//        arrayList.add(2048);
//        arrayList.add(4096);
//        arrayList.add(123123);
//        arrayList.add(9999999);
//        arrayList.add(111111);
//
//
//        arrayList.print();
//
//        System.out.println(arrayList.remove(5));
//        System.out.println(arrayList.size());
//        arrayList.print();
//
//        arrayList.remove();
//        System.out.println(arrayList.size());
//        arrayList.remove();
//        arrayList.print();
//
//        arrayList.print();
//
//        System.out.println(arrayList.get(2));
//
//        arrayList.remove(3);
//        arrayList.print();
//
//        System.out.println(arrayList.remove());
//        System.out.println(arrayList.remove());
//        System.out.println();
//        arrayList.print();
//
//        System.out.println(arrayList.size());
//
//        System.out.println(arrayList.remove(2));
//        System.out.println(arrayList.remove(4));
//        System.out.println(arrayList.size());
//        arrayList.print();

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(123);
        queue.offer(234);

        System.out.println(queue.remove());
        System.out.println(queue.poll());

        System.out.println(queue.peek());
    }
}
