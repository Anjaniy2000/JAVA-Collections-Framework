package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetRunner {
    public static void main(String[] args) {

        Set<Integer> hashset = new HashSet<>();

        //add(Object o):
        hashset.add(1024);
        hashset.add(2048);
        hashset.add(3096);

        //addAll(Collection c){Union - Operation}:
        List<Integer> templist1 = new ArrayList<>();
        templist1.add(5005);
        templist1.add(6006);

        hashset.addAll(templist1);
        hashset.forEach(System.out::println);

        //size():
        System.out.println(hashset.size());

        //isEmpty():
        System.out.println(hashset.isEmpty());

        //remove(Object o):
        System.out.println(hashset.remove(2048));

        //removeAll(Collection c):
        List<Integer> templist2 = new ArrayList<>();
        templist2.add(5005);
        templist2.add(6006);
        System.out.println(hashset.removeAll(templist2));

        hashset.forEach(System.out::println);

        //contains(Object o):
        System.out.println(hashset.contains(3096));

        //containsAll(Collection o){Subset - Operation}:
        List<Integer> templist3 = new ArrayList<>();
        templist3.add(1024);
        templist3.add(3096);
        System.out.println(hashset.containsAll(templist3));

        //retainAll(Collection o){Intersection - Operation}:
        List<Integer> templist4 = new ArrayList<>();
        templist4.add(1024);
        templist4.add(5555);
        templist4.add(6666);
        templist4.add(7777);

        hashset.retainAll(templist4);
        hashset.forEach(System.out::println);

        //toArray():
        Integer[] array = new Integer[hashset.size()];
        hashset.toArray(array);
        for (Integer element :
                array) {
            System.out.print(element + " ");
        }
        System.out.println();

        //clear():
        hashset.clear();
        System.out.println(hashset.size());
    }
}
