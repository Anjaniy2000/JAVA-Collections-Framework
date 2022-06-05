package list.linkedlist;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class LinkedListRunner {
    public static void main(String[] args) {
        List<Integer> linkedlist = new LinkedList<>();

        //add(Object o):
        linkedlist.add(1024);
        linkedlist.add(2048);
        linkedlist.add(3096);
        linkedlist.add(4096);
        linkedlist.add(5005);
        linkedlist.add(6006);
        linkedlist.add(7007);
        linkedlist.forEach(System.out::println);

        //add(int index, Object o)
        linkedlist.add(2, 9999);

        //get(int index):
        System.out.println(linkedlist.get(2));

        //isEmpty():
        System.out.println(linkedlist.isEmpty());

        //size():
        System.out.println(linkedlist.size());

        //indexOf(Object o):
        System.out.println(linkedlist.indexOf(6006));

        //set(int index, Object o):
        linkedlist.set(2, 7000881);
        System.out.println(linkedlist.get(7));

        //remove(int index):
        System.out.println(linkedlist.remove(7));

        //remove(Object o):
        Integer temp = 6006;
        System.out.println(linkedlist.remove(temp));

        //contains(Object o):
        System.out.println(linkedlist.contains(4096));

        //sor():
        Collections.sort(linkedlist);
        linkedlist.forEach(System.out::println);

        //addAll(Collection c):
        List<Integer> templinkedlist1 = new LinkedList<>();
        templinkedlist1.add(8888);
        templinkedlist1.add(1111);

        linkedlist.addAll(templinkedlist1);
        linkedlist.forEach(System.out::println);

        //addAll(int index, Collection c):
        List<Integer> templinkedlist2 = new LinkedList<>();
        templinkedlist2.add(50505);
        templinkedlist2.add(60606);

        linkedlist.addAll(3, templinkedlist2);
        linkedlist.forEach(System.out::println);

        //removeAll(Collection c):
        linkedlist.removeAll(templinkedlist1);
        linkedlist.removeAll(templinkedlist2);
        linkedlist.forEach(System.out::println);

        //toArray():
        Integer[] array = new Integer[linkedlist.size()];
        linkedlist.toArray(array);
        for(Integer element: array){
            System.out.print(element + " ");
        }
        System.out.println();

        //clear():
        linkedlist.clear();
        System.out.println(linkedlist.isEmpty());
    }
}
