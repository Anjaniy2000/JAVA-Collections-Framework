package iterableAndIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass{
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(1024);
        arraylist.add(2048);
        arraylist.add(-5656);
        arraylist.add(7896);
        arraylist.add(9999);

        /* Iterable - Methods: */

        //Enhanced - forLoop(for each loop):
        System.out.println("Using Enhanced For Loop:");
        for(Integer element : arraylist){
            System.out.println(element);
        }

        //Iterable - forEachLoop(Lambda - Expression):
        System.out.println("Using Iterable For Each Loop");
        arraylist.forEach((element) ->{
            System.out.println(element);
        });

        //Using Iterator - Interface:
        System.out.println("Using Iterator Interface");
        Iterator<Integer> iterator = arraylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
