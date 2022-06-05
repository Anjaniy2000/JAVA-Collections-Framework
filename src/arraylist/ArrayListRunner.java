package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();

        //add(Object o):
        arraylist.add(1024);
        arraylist.add(2048);
        arraylist.add(3096);
        arraylist.add(4096);
        arraylist.add(5005);
        arraylist.add(6006);
        arraylist.add(7007);
        arraylist.forEach(System.out::println);

        //add(int index, Object o)
        arraylist.add(2, 9999);

        //get(int index):
        System.out.println(arraylist.get(2));

        //isEmpty():
        System.out.println(arraylist.isEmpty());

        //size():
        System.out.println(arraylist.size());

        //indexOf(Object o):
        System.out.println(arraylist.indexOf(6006));

        //set(int index, Object o):
        arraylist.set(2, 7000881);
        System.out.println(arraylist.get(7));

        //remove(int index):
        System.out.println(arraylist.remove(7));

        //remove(Object o):
        Integer temp = 6006;
        System.out.println(arraylist.remove(temp));

        //contains(Object o):
        System.out.println(arraylist.contains(4096));

        //sor():
        Collections.sort(arraylist);
        arraylist.forEach(System.out::println);

        //addAll(Collection c):
        List<Integer> templist1 = new ArrayList<>();
        templist1.add(8888);
        templist1.add(1111);

        arraylist.addAll(templist1);
        arraylist.forEach(System.out::println);

        //addAll(int index, Collection c):
        List<Integer> templist2 = new ArrayList<>();
        templist2.add(50505);
        templist2.add(60606);

        arraylist.addAll(3, templist2);
        arraylist.forEach(System.out::println);

        //removeAll(Collection c):
        arraylist.removeAll(templist1);
        arraylist.removeAll(templist2);
        arraylist.forEach(System.out::println);

        //toArray():
        Integer[] array = new Integer[arraylist.size()];
        arraylist.toArray(array);
        for(Integer element: array){
            System.out.print(element + " ");
        }
        System.out.println();

        //clear():
        arraylist.clear();
        System.out.println(arraylist.isEmpty());

    }
}
