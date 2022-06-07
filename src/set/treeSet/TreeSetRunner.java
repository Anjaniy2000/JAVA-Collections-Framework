package set.treeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetRunner {
    public static void main(String[] args) {

        Set<Integer> treeset = new TreeSet<>();

        //add(Object o):
        treeset.add(1024);
        treeset.add(2048);
        treeset.add(3096);

        //addAll(Collection c){Union - Operation}:
        List<Integer> templist1 = new ArrayList<>();
        templist1.add(5005);
        templist1.add(6006);

        treeset.addAll(templist1);
        treeset.forEach(System.out::println);

        //size():
        System.out.println(treeset.size());

        //isEmpty():
        System.out.println(treeset.isEmpty());

        //remove(Object o):
        System.out.println(treeset.remove(2048));

        //removeAll(Collection c):
        List<Integer> templist2 = new ArrayList<>();
        templist2.add(5005);
        templist2.add(6006);
        System.out.println(treeset.removeAll(templist2));

        treeset.forEach(System.out::println);

        //contains(Object o):
        System.out.println(treeset.contains(3096));

        //containsAll(Collection o){Subset - Operation}:
        List<Integer> templist3 = new ArrayList<>();
        templist3.add(1024);
        templist3.add(3096);
        System.out.println(treeset.containsAll(templist3));

        //retainAll(Collection o){Intersection - Operation}:
        List<Integer> templist4 = new ArrayList<>();
        templist4.add(1024);
        templist4.add(5555);
        templist4.add(6666);
        templist4.add(7777);

        treeset.retainAll(templist4);
        treeset.forEach(System.out::println);

        //toArray():
        Integer[] array = new Integer[treeset.size()];
        treeset.toArray(array);
        for (Integer element :
                array) {
            System.out.print(element + " ");
        }
        System.out.println();

        //clear():
        treeset.clear();
        System.out.println(treeset.size());
    }
}
