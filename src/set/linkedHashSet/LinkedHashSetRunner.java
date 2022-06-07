package set.linkedHashSet;

import java.util.*;

public class LinkedHashSetRunner {
    public static void main(String[] args) {

        Set<Integer> linkedhashset = new LinkedHashSet<>();

        //add(Object o):
        linkedhashset.add(1024);
        linkedhashset.add(2048);
        linkedhashset.add(3096);

        //addAll(Collection c){Union - Operation}:
        List<Integer> templist1 = new ArrayList<>();
        templist1.add(5005);
        templist1.add(6006);

        linkedhashset.addAll(templist1);
        linkedhashset.forEach(System.out::println);

        //size():
        System.out.println(linkedhashset.size());

        //isEmpty():
        System.out.println(linkedhashset.isEmpty());

        //remove(Object o):
        System.out.println(linkedhashset.remove(2048));

        //removeAll(Collection c):
        List<Integer> templist2 = new ArrayList<>();
        templist2.add(5005);
        templist2.add(6006);
        System.out.println(linkedhashset.removeAll(templist2));

        linkedhashset.forEach(System.out::println);

        //contains(Object o):
        System.out.println(linkedhashset.contains(3096));

        //containsAll(Collection o){Subset - Operation}:
        List<Integer> templist3 = new ArrayList<>();
        templist3.add(1024);
        templist3.add(3096);
        System.out.println(linkedhashset.containsAll(templist3));

        //retainAll(Collection o){Intersection - Operation}:
        List<Integer> templist4 = new ArrayList<>();
        templist4.add(1024);
        templist4.add(5555);
        templist4.add(6666);
        templist4.add(7777);

        linkedhashset.retainAll(templist4);
        linkedhashset.forEach(System.out::println);

        //toArray():
        Integer[] array = new Integer[linkedhashset.size()];
        linkedhashset.toArray(array);
        for (Integer element :
                array) {
            System.out.print(element + " ");
        }
        System.out.println();

        //clear():
        linkedhashset.clear();
        System.out.println(linkedhashset.size());
    }
}
