package cursors;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jay");
        names.add("Adams");
        names.add("Mahesh");
        names.add("Anna");
        names.add("Lilly");


        /* Cursors In Java: */

        //Iterator(Universal Cursor{Can Be Use With Any Collection}, {Since Java 1.2}):
        System.out.println("Iterator Cursor:");
        Iterator<String> nameIterator = names.iterator();
        while(nameIterator.hasNext()){
            String name = nameIterator.next();
            if(name.equals("Anna")){
                nameIterator.remove();
            }
            else{
                System.out.println(name);
            }
        }

        System.out.println(names);

        //Enumeration(Not Universal Cursor{Can Be Use With Legacy Classes(i.e Vector, HashTable)}, {Since Java 1.0}):
        Vector<Integer> numbers = new Vector<>();
        for(int i = 1 ; i <= 10 ; i++){
            numbers.add(i);
        }

        System.out.println("Enumeration Cursor:");

        Enumeration<Integer> numbersEnumeration = numbers.elements();

        while(numbersEnumeration.hasMoreElements()){
            System.out.println(numbersEnumeration.nextElement());
        }

        //ListIterator(It is only applicable for List collection implemented classes like ArrayList, LinkedList, etc, {It provides bi-directional iteration},
        // Since Java 1.2)



    }
}
