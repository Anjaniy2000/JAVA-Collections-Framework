package iterableAndIterator;

import iterableAndIterator.implementations.CustomIterable;

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
        System.out.println("Using Iterable For Each Loop:");
        arraylist.forEach((element) ->{
            System.out.println(element);
        });

        //Using Iterator - Interface:
        System.out.println("Using Iterator Interface:");
        Iterator<Integer> iterator = arraylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /* Use CustomIterable To Store & Iterate A List Of Elements: */

        CustomIterable<String> names = new CustomIterable<>();
        names.add("Jay");
        names.add("Adams");
        names.add("Mahesh");
        names.add("Anna");
        names.add("Lilly");

        //Using Enhanced - forLoop(for each loop):
        System.out.println("Using Enhanced For Loop:");
        for(String name : names){
            System.out.println(name);
        }

        //Iterable - forEachLoop(Lambda - Expression):
        System.out.println("Using Iterable For Each Loop:");
        names.forEach(name ->{
            System.out.println(name);
        });

        //Using Iterator - Interface:
        System.out.println("Using Iterator Interface:");
        Iterator<String> nameIterator = names.iterator();
        while(nameIterator.hasNext()){
            System.out.println(nameIterator.next());
        }


    }
}
