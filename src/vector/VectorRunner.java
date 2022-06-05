package vector;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorRunner {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();

        //add(Object o):
        vector.add(1024);
        vector.add(2048);
        vector.add(3096);
        vector.add(4096);
        vector.add(5005);
        vector.add(6006);
        vector.add(7007);
        vector.forEach(System.out::println);

        //add(int index, Object o)
        vector.add(2, 9999);

        //get(int index):
        System.out.println(vector.get(2));

        //isEmpty():
        System.out.println(vector.isEmpty());

        //size():
        System.out.println(vector.size());

        //indexOf(Object o):
        System.out.println(vector.indexOf(6006));

        //set(int index, Object o):
        vector.set(2, 7000881);
        System.out.println(vector.get(7));

        //remove(int index):
        System.out.println(vector.remove(7));

        //remove(Object o):
        Integer temp = 6006;
        System.out.println(vector.remove(temp));

        //contains(Object o):
        System.out.println(vector.contains(4096));

        //sor():
        Collections.sort(vector);
        vector.forEach(System.out::println);

        //addAll(Collection c):
        List<Integer> tempvector1 = new Vector<>();
        tempvector1.add(8888);
        tempvector1.add(1111);

        vector.addAll(tempvector1);
        vector.forEach(System.out::println);

        //addAll(int index, Collection c):
        List<Integer> tempvector2 = new Vector<>();
        tempvector2.add(50505);
        tempvector2.add(60606);

        vector.addAll(3, tempvector2);
        vector.forEach(System.out::println);

        //removeAll(Collection c):
        vector.removeAll(tempvector1);
        vector.removeAll(tempvector2);
        vector.forEach(System.out::println);

        //toArray():
        Integer[] array = new Integer[vector.size()];
        vector.toArray(array);
        for(Integer element: array){
            System.out.print(element + " ");
        }
        System.out.println();

        //clear():
        vector.clear();
        System.out.println(vector.isEmpty());
    }
}
