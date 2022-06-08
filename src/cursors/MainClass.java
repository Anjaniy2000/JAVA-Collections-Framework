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
        Vector<Integer> vector = new Vector<>();
        for(int i = 1 ; i <= 10 ; i++){
            vector.add(i);
        }

        System.out.println("Enumeration Cursor:");

        Enumeration<Integer> numbersEnumeration = vector.elements();

        while(numbersEnumeration.hasMoreElements()){
            System.out.println(numbersEnumeration.nextElement());
        }

        //ListIterator(It is only applicable for List collection implemented classes like ArrayList, LinkedList, etc, {It provides bi-directional iteration},
        // Since Java 1.2)

        List<Integer> numbers = new ArrayList<>();
        numbers.add(88);
        numbers.add(67);
        numbers.add(57);
        numbers.add(25);
        numbers.add(101);

        System.out.println("ListIterator Cursor:");

        //Forward Direction:
        ListIterator<Integer> forwardDirectionIterator = numbers.listIterator();
        System.out.println("Forward Direction");
        while(forwardDirectionIterator.hasNext()){
            System.out.println(forwardDirectionIterator.next());
        }

        //Backward Direction:
        ListIterator<Integer> backwardDirectionIterator = numbers.listIterator(numbers.size());
        System.out.println("Backward Direction");
        while(backwardDirectionIterator.hasPrevious()){
            System.out.println(backwardDirectionIterator.previous());
        }

        //Other Methods(set(), add()):
        List<Integer> numbers2 = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++){
            numbers2.add(i);
        }

        ListIterator<Integer> tempIterator = numbers2.listIterator();

        System.out.println("After Removing All The Even Numbers From ArrayList:");
        while(tempIterator.hasNext()){
            int element = tempIterator.next();

            if(element % 2 == 0){
                element++;
                tempIterator.set(element);
                tempIterator.add(element);
            }
        }

        numbers2.forEach(System.out::println);
    }
}
